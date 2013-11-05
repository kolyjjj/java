package li.koly.MoveField;

public class Account {
    private AccountType type;
    private double interest;

    double interestForAmount_days(double amount, int days){
        return getInterest() * amount * days / 365;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
