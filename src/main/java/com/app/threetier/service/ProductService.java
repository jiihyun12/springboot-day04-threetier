package com.app.threetier.service;

import com.app.threetier.domain.ProductVO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public void register(ProductVO productVO);

    public List<ProductVO> selectAll();

    public Optional<ProductVO> select(Long id);

    public void update(ProductVO productVO);

    public void delete(Long productVO);
}
