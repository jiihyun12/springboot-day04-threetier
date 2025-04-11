package com.app.threetier.mapper;

import com.app.threetier.domain.TaskVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskMapper {
    public List<TaskVO> selectAll();
}
