package Business;

import javax.swing.JFrame;

import Customer.CustomerDirectory;
import Library.AuthorDirectory;
import Library.BookDirectory;
import Library.GenreDirectory;
import Services.MasterRequestDirectory;
import UI.registerWorkArea.RegisterFrame;

public class Business {
	private AccountDirectory accountDirectory;
	private CustomerDirectory customerDirectory;
	private MasterRequestDirectory masterOrderDirectory;
	private BookDirectory bookDirectory;
	private AuthorDirectory authorDirectory;
	private GenreDirectory genreDirectory;
	
	public BookDirectory getBookDirectory() {
		return bookDirectory;
	}

	public void setBookDirectory(BookDirectory bookDirectory) {
		this.bookDirectory = bookDirectory;
	}

	public AuthorDirectory getAuthorDirectory() {
		return authorDirectory;
	}

	public void setAuthorDirectory(AuthorDirectory authorDirectory) {
		this.authorDirectory = authorDirectory;
	}

	public GenreDirectory getGenreDirectory() {
		return genreDirectory;
	}

	public void setGenreDirectory(GenreDirectory genreDirectory) {
		this.genreDirectory = genreDirectory;
	}

	public Business() {
		this.accountDirectory = new AccountDirectory();
		this.customerDirectory = new CustomerDirectory();
		this.masterOrderDirectory = new MasterRequestDirectory();
		this.authorDirectory = new AuthorDirectory();
		this.genreDirectory = new GenreDirectory();
		this.bookDirectory = new BookDirectory();
		
		Account userAccount = this.accountDirectory.createAccount("admin","manager", "admin");
		Account librarianAccount = this.accountDirectory.createAccount("lib", "librarian", "lib");
	}
	
	public static Business getBusinessInstance() {
		return new Business();
	}
	
	public AccountDirectory getAccountDirectory() {
		return this.accountDirectory;
	}
	public void setAccountDirectory(AccountDirectory accountDirectory) {
		this.accountDirectory = accountDirectory;
	}
	public CustomerDirectory getCustomerDirectory() {
		return this.customerDirectory;
	}
	public void setCustomerDirectory(CustomerDirectory customerDirectory) {
		this.customerDirectory = customerDirectory;
	}
	public MasterRequestDirectory getMasterOrderDirectory() {
		return this.masterOrderDirectory;
	}
	public void setMasterOrderDirectory(MasterRequestDirectory orderList) {
		this.masterOrderDirectory = orderList;
	}
	
	public JFrame goToRegister(Business business) {
		return new RegisterFrame(business);
	}
}
