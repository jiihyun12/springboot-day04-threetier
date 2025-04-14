package com.app.threetier.mapper;

import com.app.threetier.domain.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
    public void insert(ProductVO productVO);

    public List<ProductVO> selectAll();

    public Optional<ProductVO> select(Long id);

    public void update(ProductVO productVO);

    public void delete(Long id);
}

