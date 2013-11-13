package li.koly.refactor.MoveField;

public class Account {
    private AccountType type;

    double interestForAmount_days(double amount, int days){
        return type.getInterestRate() * amount * days / 365;
    }

}
