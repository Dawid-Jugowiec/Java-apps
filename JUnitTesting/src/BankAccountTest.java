import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount bank;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass ()
    {
        System.out.println("This executes before any test + Count: " + count++);
    }

    @org.junit.Before
    public void setup(){
        bank = new BankAccount("Dawid", "Jugowiec", 1000, BankAccount.CHECKING);
        System.out.println("Running a test");
    }




    @org.junit.Test
    public void getBalance_deposit() {


        bank.deposit(200,true);
        assertEquals(1200.00, bank.balance, 0);


    }
    @org.junit.Test
    public void getBalance_withdraw() {


        bank.withdraw(200,true);
        assertEquals(800.00, bank.balance, 0);

    }
    @org.junit.Test
    public void deposit() {

        double balance = bank.deposit(200,true);
        assertEquals(1200.00, balance, 0);


    }

    @org.junit.Test
    public void withdraw_branch() {
       double balance = bank.withdraw(600,true);
       assertEquals(400,balance,0);

    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdrawn_notbranch ()
    {
        double balance = bank.withdraw(600,false);
        assertEquals(400,balance,0);
    }

    @org.junit.Test
    public void isCheckingTrue () {
        assertTrue(" 1234", bank.isChecking());

    }
    @org.junit.AfterClass
    public static void afterClass ()
    {
        System.out.println("This prints after tests + Count: " + count++);

    }

 @org.junit.After
    public void teardown ()
 {
     System.out.println("Count: " + count++);
 }

}