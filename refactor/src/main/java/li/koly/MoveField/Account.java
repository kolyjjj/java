package li.koly.MoveField;

public class Account {
    private AccountType type;
    private double interest;

    double interestForAmount_days(double amount, int days){
        return interest * amount * days / 365;
    }
}
