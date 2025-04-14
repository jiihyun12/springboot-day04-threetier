package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberServiceTests {

    @Autowired
    private MemberService memberService;
    @Autowired
    private MemberVO memberVO;

    @Test
    public void insertTest() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test123@gmail.com");
        memberVO.setMemberName("홍길동");
        memberVO.setMemberPassword("123456");
        memberService.join(memberVO);
    }

    @Test
    public void selectTest() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test123@gmail.com");
        memberVO.setMemberPassword("test123!");
        memberService.login(memberVO)
                .map((MemberVO member) -> memberVO.toString())
                .ifPresent( (member) -> {
                    log.info( "{}", memberVO);
                });
        ;
    }


}
