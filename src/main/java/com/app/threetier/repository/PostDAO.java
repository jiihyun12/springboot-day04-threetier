package com.app.threetier.repository;

import com.app.threetier.domain.PostVO;
import com.app.threetier.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

   private final PostMapper postMapper;

//    전체 조회
    public List<PostVO> findAll() { return postMapper.selectAll(); }

//    단일 조회
    public Optional<PostVO> findId( Long id ) { return postMapper.select(id);}

//    게시글 작성
    public void write(PostVO postVO) { postMapper.insert(postVO);}

//    게시글 수정
    public void update(PostVO postVO) { postMapper.update(postVO);}

//    게시글 삭제
    public void delete(Long id) { postMapper.delete(id); }

    public void edit(PostVO postVO) { postMapper.update(postVO);}
    }


