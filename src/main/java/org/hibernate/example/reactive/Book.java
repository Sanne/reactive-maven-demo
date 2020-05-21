package org.hibernate.example.reactive;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
class Book {
	@Id @GeneratedValue Integer id;
	String title;
	String author;
	String isbn;

	Book(String isbn, String title, String author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}

	Book() {}
}
