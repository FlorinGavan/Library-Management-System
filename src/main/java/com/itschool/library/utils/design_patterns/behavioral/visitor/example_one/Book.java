package com.itschool.library.utils.design_patterns.behavioral.visitor.example_one;

public class Book implements ItemElement{
    	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
