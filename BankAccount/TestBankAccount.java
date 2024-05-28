package Banking;





import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBankAccount {

    private BankAccount account1;
    private BankAccount account2;

    @Before
    public void setUp() {
        account1 = new BankAccount("1234567890", 1000.0, "John Doe");
        account2 = new BankAccount("0987654321", 2000.0, "Jane Doe");
    }

    @Test
    public void testConstructor() {
        assertEquals("1234567890", account1.getBank_id());
        assertEquals(1000.0, account1.getBalance(), 0.001);
        assertEquals("John Doe", account1.getHolder_name());
    }

    @Test
    public void testGetters() {
        assertEquals("1234567890", account1.getBank_id());
        assertEquals(1000.0, account1.getBalance(), 0.001);
        assertEquals("John Doe", account1.getHolder_name());
    }

    @Test
    public void testSetters() {
        account1.setHolder_name("Alice");
        assertEquals("Alice", account1.getHolder_name());

        account1.setBalance(500.0);
        assertEquals(500.0, account1.getBalance(), 0.001);

        account1.setBank_id("1122334455");
        assertEquals("1234567890", account1.getBank_id()); // ID should not change
    }

    @Test
    public void testDeposit() {
        account1.deposit(500.0);
        assertEquals(1500.0, account1.getBalance(), 0.001);

        account1.deposit(-100.0); // should not allow
        assertEquals(1500.0, account1.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        account1.withdraw(500.0);
        assertEquals(500.0, account1.getBalance(), 0.001);

        account1.withdraw(-100.0); // should not allow
        assertEquals(500.0, account1.getBalance(), 0.001);
    }

    @Test
    public void testTransfer() {
        account1.transfer(account1, account2, 500.0);
        assertEquals(500.0, account1.getBalance(), 0.001);
        assertEquals(2500.0, account2.getBalance(), 0.001);

        account1.transfer(account1, account2, -100.0); // should not allow
        assertEquals(500.0, account1.getBalance(), 0.001);
        assertEquals(2500.0, account2.getBalance(), 0.001);
    }

    @Test
    public void testDeleteAccount() {
        account1.deleteAccount();
        assertNull(account1.getBank_id());
        assertEquals(0.0, account1.getBalance(), 0.001);
        assertNull(account1.getHolder_name());
    }

    @Test
    public void testToString() {
        String expected = "account holder: John Doe\n" +
                          "bank account number: 1234567890\n" +
                          "and the balance is: 1000.0";
        assertEquals(expected, account1.toString());
    }
}
