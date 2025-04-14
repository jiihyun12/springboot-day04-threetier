package com.app.threetier.service;

import com.app.threetier.domain.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;


    @Override
    public List<PostVO> findAll() {
        return List.of();
    }

    //    전체 조회
    @Override
    public List<PostVO> getList() {
        return postDAO.findAll();
    }

//    단일 조회
    @Override
    public Optional<PostVO> findId(Long id) {
        return postDAO.findId(id);
    }

//    게시글 작성
    @Override
    public void write(PostVO postVO) {
        postDAO.write(postVO);
    }

//    게시글 수정
    @Override
    public void edit(PostVO postVO) {
        postDAO.edit(postVO);
    }

    @Override
    public void remove(Long id) {
        postDAO.delete(id);
    }
}

