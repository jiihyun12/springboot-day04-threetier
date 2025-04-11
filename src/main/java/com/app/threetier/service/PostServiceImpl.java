package com.app.threetier.service;

import com.app.threetier.domain.PostVO;
import com.app.threetier.domain.TaskVO;
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
    public List<TaskVO> getList() {
        return postDAO.findAll();
    }

    @Override
    public Optional<PostVO> getPostById(Long id) {
        return postDAO.findById(id);
    }

    @Override
    public void deleteAll(Long memberId) {
        postDAO.deleteAllByMemberId(memberId);
    }

   @Override
   public void write(PostVO postVO){
        postDAO.save(postVO);
   }

   @Override
   public void edit(PostVO postVO){
        postDAO.edit(postVO);
   }
}
