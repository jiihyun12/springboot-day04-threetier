package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.PostVO;
import com.app.threetier.mapper.PostMapper;
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
@RequestMapping("/post/*")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final HttpSession session;

    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("posts", postService.getList());
    }

    @GetMapping("write") // writeOK 있어야하니까 두 개 필요
    public void goToWrite(Model model) {
        model.addAttribute("PostVO", new PostVO());
        model.addAttribute("memberId", ((MemberVO)session.getAttribute("memberId")).getId());
    }

    @PostMapping("write")
    public RedirectView write(PostVO postVO) {
        postService.write(postVO);
        return new RedirectView("/member/list");
    }


   /* @GetMapping("read")
    public void goToRead(@RequestParam("id") Long id, Model model) {
        model.addAttribute("post", PostService.getPostById(id).orElseThrow()->{
            throw new RuntimeException("post not found");
        })
    }*/

    @GetMapping("edit")
    public void goToEdit(@RequestParam("id") Long id, Model model) {
       model.addAttribute("post", postService.getPostById(id));

    }

    @PostMapping("edit")
    public RedirectView edit(PostVO postVO) {
        postService.edit(postVO);
        return new RedirectView("/post/list");
    }

   /* @GetMapping("remove")
    public RedirectView removePost(){
        postService.removeAll(id);
        return new RedirectView("/post/list");
    }*/

}
