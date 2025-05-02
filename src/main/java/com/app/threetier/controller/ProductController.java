package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.ProductVO;
import com.app.threetier.service.ProductService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/product/*")
public class ProductController {
    private final ProductService productService;
    private final HttpSession session;

    @GetMapping("write")
    public void goToRegister(Model model) {
        model.addAttribute("productVO", new ProductVO());
    }

    @PostMapping("write")
    public RedirectView product(ProductVO productVO) {
        productService.register(productVO);
        return new RedirectView("/product/register");
    }

    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("products", productService.selectAll());
    }

    @GetMapping("read")
    public void goToRead( Long id, Model model) {
        model.addAttribute("product", productService.select(id).orElseThrow());
    }

    @GetMapping("edit")
    public void goToEdit( Long id, Model model) {
        model.addAttribute("productVO", productService.select(id).orElseThrow());
    }

    @PostMapping("edit")
    public RedirectView update(ProductVO productVO) {
        productService.update(productVO);
        return new RedirectView("/product/list");
    }

    @GetMapping("remove")
    public RedirectView remove(Long id) {
        productService.delete(id);
        return new RedirectView("/product/list");
    }


}


