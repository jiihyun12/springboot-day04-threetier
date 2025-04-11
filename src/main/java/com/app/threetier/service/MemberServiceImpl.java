package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.repository.MemberDAO;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;
    private final PostDAO postDAO;

    @Override
    public void join(MemberVO memberVO) {
        memberDAO.save(memberVO);
    }

    @Override
    public Optional<MemberVO> login(MemberVO memberVO) {
        return memberDAO.findByMemberIdAndMemberPassword(memberVO);
    }

    //    @Transactional(rollbackFor = Exception.class)
//    @Transactional(rollbackFor = {IOException.class, RuntimeException.class})
    @Override
    public void withdraw(Long id) {
//        게시글도 모두 삭제
        postDAO.deleteAllByMemberId(id);
        memberDAO.delete(id);
    }

}
