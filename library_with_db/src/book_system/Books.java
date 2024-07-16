package book_system;
import java.util.*;
public class Books {
	Author a;
	Borrower b; 
	private final int book_id; 
	public  final String name;
	boolean available = true;


	public Books(Author _a,Borrower _b,int _book_id,String _name) {
		this.a = new Author(_a);
		this.b = new Borrower(_b);
		book_id =_book_id;
		name =_name;
	}


	//getters
	public int getBookId() {return this.book_id;}
	public String getName() {return this.name;}
	public boolean getAvailable() {return this.available;}
	public Author getAuthor() {return this.a ;}
	public Borrower getBorrower() {return this.b ;}
	
	//setters 
	public void setAvailable(boolean v) {this.available = v;}
	public void setAuthor(Author au) {this.a = au;}
	public void setBorrower(Borrower bo) {this.b = bo;}
	
}
