package ksmybatis.admin.products.service;

import java.util.List;

import ksmybatis.admin.products.domain.Products;

public interface ProductsService {

	// 상품목록조회
	List<Products> getProductList();
	
	// 회원 등록
	void addProduct(Products products);

}
