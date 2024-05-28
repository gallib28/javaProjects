
package Banking;

public class Bank_Account {
	String bank_id ; 
	double balance ; 
	String holder_name ; 
	
	public String getBank_id() {
		return this.bank_id;
	}
	public double getBalance() {//checks the account balance 
		return this.balance;
	}
	public String getHolder_name() {
		return this.holder_name;
	}
	public void setHolder_name(String s) {
		this.holder_name= s ;
	}
	public void setFirstBalance(double b) {
		this.balance= b ;
	}
	public void setBank_id(String id) {
		if (bank_id == null && id.length() == 10 )
			this.bank_id= id;
		else 
			System.out.println("this account has an id and you cant change it!!");
	}

	Bank_Account(String bank_id ,double money ,String holder_name){
		setBank_id(bank_id);
		setFirstBalance(money);
		setHolder_name(holder_name);
	}
	
	private double deposit(double in) {
		balance += in ;
		return balance;
	}
	public double withdraw(double out) {
		balance -= out ;
		return balance;
	}
	private void accountInfo() {
		this.toString();
	}
	public String toString() {
		return "account holder: " +this.holder_name +"\n" 
				+ "bank account number: "+this.bank_id+"\n" 
				+ "and the balance is: "+this.balance ; 
		
		
	}
}
