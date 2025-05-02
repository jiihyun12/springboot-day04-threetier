package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.PostVO;
import com.app.threetier.repository.PostDAO;
import com.app.threetier.service.PostService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/post/*")
public class PostController {

    private final PostService postService;
    private final HttpSession session;
    private final PostVO postVO;

    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("posts", postService.getList());}


    @GetMapping("write")
    public void goToWrite(Model model) {
        model.addAttribute("postVO", new PostVO());
        model.addAttribute("memberId", ((MemberVO)session.getAttribute("member")).getId());
    }

    @PostMapping("write")
    public RedirectView write(PostVO postVO) {
        postService.write(postVO);
        return new RedirectView("/post/list");
    }

    @GetMapping("read")
    public void goToRead(@RequestParam("id") Long id, Model model) {
        model.addAttribute("post", postService.findId(id).orElseThrow(()->{
            throw new RuntimeException("Post Not Found");
        }));
    }

    @GetMapping("edit")
    public void goToEdit(@RequestParam("id") Long id, Model model) {
      Long memberId = ((MemberVO)session.getAttribute("member")).getId();
      PostVO postVO = postService.findId(id).orElseThrow(()-> new RuntimeException("Post Not Found"));
          model.addAttribute("postVO", postVO);
          model.addAttribute("memberId", memberId);
    }

    @PostMapping("edit")
    public RedirectView edit(PostVO postVO) {
        postService.edit(postVO);
        return new RedirectView("/post/list");
    }

    @GetMapping("remove")
    public RedirectView remove(Long id) {
        postService.remove(id);
        return new RedirectView("/post/list");
    }



}
