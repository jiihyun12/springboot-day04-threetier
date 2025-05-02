package com.app.threetier.service;

import com.app.threetier.domain.PostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PostService {
    //    게시글 목록
    public List<PostVO> findAll();

    //    전체 조회
    List<PostVO> getList();

    //    게시글 단일 조회
    public Optional<PostVO> findId(Long id );

    //    게시글 추가
    public void write(PostVO postVO);

    //    게시글 수정
    public void edit(PostVO postVO);

    //    게시글 삭제
    public void remove(Long id);
}