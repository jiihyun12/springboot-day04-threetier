package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;

    // 임플리먼츠에서 오버라이드 만들떄 p누른다
    @Override
    public void join(MemberVO memberVO) {
        memberDAO.save(memberVO);
    }

    @Override
    public Optional<MemberVO> login(MemberVO memberVO) {
        return memberDAO.login(memberVO);
    }

    @Override
    public void withdraw(Long member) {

    }
}
