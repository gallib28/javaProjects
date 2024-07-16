package book_system;

public class Borrower {
	final String borrower_name;
	String phone ; 
	final int borrower_id;


	public Borrower(String _borrower_name,String _phone,int _borrower_id) {
		setPhone(_phone);
		borrower_name = _borrower_name;
		borrower_id = _borrower_id ;
	}
	
	public Borrower(Borrower _b) {
		borrower_name = _b.borrower_name ;
		setPhone(phone);
		borrower_id = _b.borrower_id;
	}
	
	

	public String getBorrowerName() {
		return this.borrower_name;		
	}
	public int getBorrowerID() {
		return this.borrower_id;		
	}
	public String getName() {
		return this.borrower_name;
	}

		
	public void setPhone(String p) {
		this.phone = p; 
	}
}
