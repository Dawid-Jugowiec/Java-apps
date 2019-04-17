public class BankAccount {

    private String firstname;
    private String lastname;
    double balance;


    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String firstname, String lastname, double balance, int accountType) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double deposit(double ammount, boolean branch) {
        this.balance += ammount;

        return balance;

    }

    public double withdraw(double ammount, boolean branch) {
        if (ammount > 500 && !branch)
        {
            throw new IllegalArgumentException();
        }
        this.balance -= ammount;

        return balance;

    }
 public boolean isChecking ()
 {
     return accountType == CHECKING;
 }

}
