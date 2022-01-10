package com.spring_mvc_mybatis.book.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc_mybatis.book.model.BookVO;
import com.spring_mvc_mybatis.book.service.BookService;

@Controller
public class BookController {

	// DI 설정
	@Autowired
	BookService service;

	// 실행 시 index 페이지 열기
	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}

	// 전체 도서 조회
	@RequestMapping("/book/listAllBook")
	public String listAllBook(Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList", bookList);

		return "book/bookListView";
	}

	// 도서 등록 폼 이동
	@RequestMapping("/book/newBookForm")
	public String newBookForm() {
		return "book/newBookForm";
	}

	// 도서 등록
	@RequestMapping("/book/insertBook")
	public String insertBook(BookVO book) {
		System.out.println(book.getBookNum());
		service.insertBook(book);
		return "redirect:./listAllBook";
	}

	// 상세 페이지 이동
	@RequestMapping("/book/detailViewBook/{bookNum}")
	public String detailViewBook(@PathVariable String bookNum, Model model) {
		BookVO book = service.detailViewBook(bookNum);
		model.addAttribute("book", book);
		return "book/bookDetailView";
	}

	// 수정 화면 페이지 이동 (수정하기 위해 상품 상세 정보를 화면에 먼저 출력)
	@RequestMapping("/book/updateBookForm/{bookNum}")
	public String updateBookForm(@PathVariable String bookNum, Model model) {
		// 상품정보 전달하고, 해당 상품 젖ㅇ보 받아오기
		BookVO book = service.detailViewBook(bookNum); // 상세 상품 조회 메소드 그대로 사용
		model.addAttribute("book", book);
		return "book/updateBookForm";
	}

	// 도서 정보 수정 : 수정된 상품 정보 DB에 저장
	@RequestMapping("/book/updateBook")
	public String detailViewBook(BookVO book) {
		service.updateBook(book);
		return "redirect:./listAllBook"; // 전체 도서 조회 페이지로 포워딩
	}

	// 도서 정보 삭제
	@RequestMapping("/book/deleteBook/{bookNum}")
	public String deleteBook(@PathVariable String bookNum) {
		service.deleteBook(bookNum);
		return "redirect:../listAllBook"; // 전체 도서 조회 페이지로 이동
	}
}
