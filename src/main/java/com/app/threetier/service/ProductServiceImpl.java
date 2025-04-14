package com.app.threetier.service;

import com.app.threetier.domain.ProductVO;
import com.app.threetier.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Override
    public void insertProduct(ProductVO productVO) {productDAO.insert(productVO);}

    @Override
    public List<ProductVO> selectAll() {
        return productDAO.selectAll();
    }

    @Override
    public Optional<ProductVO> select(Long id) {
        return productDAO.select(id);
    }

    @Override
    public void update(ProductVO productVO) {
        productDAO.update(productVO);
    }

    @Override
    public void delete(Long id) {
        productDAO.delete(id);
    }
}
