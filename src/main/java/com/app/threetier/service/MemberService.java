package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;

import java.util.Optional;

// 서비스는 인터페이스로 만들자!
// 하나의 메서드당 하나의 서비스
public interface MemberService {
//    회원가입
    public void join(MemberVO memberVO);

//    로그인
    public Optional<MemberVO> login(MemberVO memberVO);

//    회원 탈퇴
    public void withdraw(Long id);


}
