package com.oracle.entity;

public class Book {
    private Integer bookid;

    private String bookname;

    private Double price;

    private Double memberprice;

    private String isbn;

    private String author;

    private String publisher;

    private String discription;

    private String bookimage;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Double memberprice) {
        this.memberprice = memberprice;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public String getBookimage() {
        return bookimage;
    }

    public void setBookimage(String bookimage) {
        this.bookimage = bookimage == null ? null : bookimage.trim();
    }

	public Book(Integer bookid, String bookname, Double price,
			Double memberprice, String isbn, String author, String publisher,
			String discription, String bookimage) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.memberprice = memberprice;
		this.isbn = isbn;
		this.author = author;
		this.publisher = publisher;
		this.discription = discription;
		this.bookimage = bookimage;
	}
    
}