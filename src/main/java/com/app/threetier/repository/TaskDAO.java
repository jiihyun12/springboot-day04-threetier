package com.app.threetier.repository;

import com.app.threetier.domain.TaskVO;
import com.app.threetier.mapper.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TaskDAO {
    private final TaskMapper taskMapper;

    public List<TaskVO> insert() {
        return taskMapper.insert();
    }

}
