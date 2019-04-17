import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BookAccountTestParameterized {

    private BankAccount account;
    private double ammount;
    private boolean branch;
    private double expected;

    public BookAccountTestParameterized(double ammount, boolean branch, double expected) {
        this.ammount = ammount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup ()
    {
        account = new BankAccount("Dawid", "Jugowiec", 1000 ,BankAccount.CHECKING);
        System.out.println("Starting testing..");
    }

    @Parameterized.Parameters
    public static Collection<Object []> testConditions ()
    {
        return Arrays.asList(new Object [] [] {{100, true, 1100}, {200, true, 1200},{ 300, true, 1300}, {489.33, true, 1489.33}, {1000, true, 2000} });



    }

    @org.junit.Test
    public void deposit() {

        double balance = account.deposit(ammount,branch);
        assertEquals(expected, balance, 0);


    }

}
