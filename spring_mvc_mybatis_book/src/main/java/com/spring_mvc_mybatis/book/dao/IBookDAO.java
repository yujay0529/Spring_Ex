package com.spring_mvc_mybatis.book.dao;

import java.util.ArrayList;

import com.spring_mvc_mybatis.book.model.BookVO;


public interface IBookDAO {
	// 구현 클래스에서 오버라이딩할 추상 메소드 선언 
			// 규격 지정 : 반드시 구현해야 할 메소드 지정해 놓는 것
			ArrayList<BookVO> listAllBook();   		// 전체 상품 조회
			void insertBook(BookVO bookVo);			// 상품 정보 등록
			void updateBook(BookVO bookVo);			// 상품 정보 수정
			void deleteBook(String bookNum);					// 상품 정보 삭제
			BookVO detailViewBook(String bookNum);// 상세 상품 조회


	
}
