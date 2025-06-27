package ksmybatis.admin.products.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmybatis.admin.products.domain.Products;
import ksmybatis.admin.products.mapper.ProductsMapper;
import ksmybatis.admin.products.service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class ProductsServiceImpl implements ProductsService{
	
	private final ProductsMapper productsMapper;
	
	/*
	 * 상품 목록 조회
	 */
	@Override
	public List<Products> getProductList() {
		
		var productList = productsMapper.getProductList();
		
		return productList;
	}
	
	@Override
	public void addProduct(Products products) {
		int result = productsMapper.addProduct(products);
		String insertResult = "상품등록 실패";
		
		if(result > 0)  insertResult = "상품등록 성공"; 
		log.info("회원등록 성공");
		
	}
}
