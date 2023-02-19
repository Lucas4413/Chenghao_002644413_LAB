package Library;

public class Book {
	String ID;
	String name;
	Author author;
	Genre genre;
	float price;
	String status;
	private static int count = 0;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	public String getID() {
		return ID;
	}
	public void setID() {
		this.count++;
		ID = count+"";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
