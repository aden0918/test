package ksmybatis.admin.products.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.products.domain.Products;

@Mapper
public interface ProductsMapper {
	// 판매자가 등록한 상품 삭제
	int removeProductsBySellerId(String sellerId);
	
	//상품목록조회
	List<Products> getProductList();
	
	// 상품 등록
	int addProduct(Products products);
	
	// 중복 아이디 체크
	boolean checkProductById(String productCode); 

}
