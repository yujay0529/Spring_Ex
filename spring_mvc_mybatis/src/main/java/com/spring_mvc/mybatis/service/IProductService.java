package com.spring_mvc.mybatis.service;

import java.util.ArrayList;

import com.spring_mvc.mybatis.model.ProductVO;

public interface IProductService {
	// 구현 클래스에서 오버라이딩할 추상 메소드 선언 
	// 규격 지정 : 반드시 구현해야 할 메소드 지정해 놓는 것
	ArrayList<ProductVO> listAllProduct();   		// 전체 상품 조회
	void insertProduct(ProductVO prdVo);			// 상품 정보 등록
	void updateProduct(ProductVO prdVo);			// 상품 정보 수정
	void deleteProduct(String prdNo);					// 상품 정보 삭제
	ProductVO detailViewProduct(String prdNo);// 상세 상품 조회
}
