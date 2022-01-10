package com.spring_mvc_mybatis.book.model;

public class BookVO {
	private String bookNum;
	private String bookName;
	private String bookAuther;
	private String bookPrice;
	private String bookDate;
	private String PubNum;
	
	
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public String getPubNum() {
		return PubNum;
	}
	public void setPubNum(String pubNum) {
		PubNum = pubNum;
	}

	
}
