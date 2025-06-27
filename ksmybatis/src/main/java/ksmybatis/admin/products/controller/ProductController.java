package ksmybatis.admin.products.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmybatis.admin.products.domain.Products;
import ksmybatis.admin.products.mapper.ProductsMapper;
import ksmybatis.admin.products.service.ProductsService;
import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping("/admin/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductsService productsService;
	private final ProductsMapper productsMapper;
	
	@PostMapping("/addProduct")
	public String addProduct(Products products) {
		productsService.addProduct(products);
		
		return "redirect:/admin/products/productList";
	}
	
	
	
	@GetMapping("/addProduct")
	public String addProductView() {
		
		return "admin/products/addProductView";
	}
	
	
	
	/*
	 * 상품 목록 조회
	 * @return productListView
	 */
	
	@GetMapping("/productList")
	public String productListView(Model model) {
		
		List<Products> productList = productsService.getProductList();
		
		model.addAttribute("title", "상품목록조회");
		model.addAttribute("productList", productList);
		
		return "/admin/products/productListView";
	}
}
