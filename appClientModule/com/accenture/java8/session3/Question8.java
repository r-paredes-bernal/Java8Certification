package com.accenture.java8.session3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {

	public Question8() {
	}

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Harry Potter", Book.Category.FICTION),
				new Book("Fast and Forious", Book.Category.ACTION )
		);
		
		books.stream()
					.filter( b -> b.getCategory().equals(Book.Category.FICTION))
					.peek( b -> System.out.println(b.getTitle()))
					.collect(Collectors.toList());
		
		// Collect, Count, Max, Min, Reduce
	}
	

}

class Book {
	private String title;
	private Category category;
	
	Book(String name, Category category ){
		this.title = name;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	static enum Category {
		FICTION, ACTION
	};
}
