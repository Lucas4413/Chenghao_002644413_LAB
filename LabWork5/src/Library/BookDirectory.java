package Library;

import java.util.ArrayList;

public class BookDirectory {
	ArrayList<Book> books;
	
	public BookDirectory() {
		this.books = new ArrayList<Book>();
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void createBook(String name, Float price, Author author, Genre genre) {
		Book book = new Book();
		book.setAuthor(author);
		book.setGenre(genre);
		book.setName(name);
		book.setPrice(price);
		book.setID();
		book.setStatus("ready");
		this.books.add(book);
	}
	
	public Book searchById(String id) {
		for (Book b:this.books) {
			if(b.getID().equals(id)) {
				return b;
			}
		}
		return null;
	}
}
