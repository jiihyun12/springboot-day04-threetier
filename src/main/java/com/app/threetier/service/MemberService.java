package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MemberService { // MemberService 누르고 ctrl 엔터 눌러서 implements 생성한다.

//    회원가입
    public void join(MemberVO memberVO);

//    로그인
    public Optional<MemberVO> login(MemberVO memberVO);

    void withdraw(Long member);
}
