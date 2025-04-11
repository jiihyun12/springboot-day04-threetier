package com.app.threetier.service;

import com.app.threetier.domain.PostVO;
import com.app.threetier.domain.TaskVO;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<TaskVO> getList();

    public void deleteAll(Long memberId);

    public Optional<PostVO> getPostById(Long id);

    public void write(PostVO postVO);

//    게시글 수정
    public void edit(PostVO postVO);

//    게시글 삭제
    public void deleteAll(long memberId);



}
