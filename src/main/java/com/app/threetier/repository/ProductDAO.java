package com.app.threetier.repository;

import com.app.threetier.domain.ProductVO;
import com.app.threetier.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    private final ProductMapper productMapper;

    public void insert(ProductVO productVO) {
        productMapper.insert(productVO);
    }

    public List<ProductVO> selectAll() {
        return productMapper.selectAll();
    }

    public Optional<ProductVO> select(Long id) {
        return productMapper.select(id);
    }

    public void update(ProductVO productVO) {
        productMapper.update(productVO);
    }

    public void delete(Long id) {
        productMapper.delete(id);
    }
}
