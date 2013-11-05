package li.koly.MoveField;

public class Account {
    private AccountType type;
    private double interest;

    double interestForAmount_days(double amount, int days){
        return type.getInterestRate() * amount * days / 365;
    }
}
