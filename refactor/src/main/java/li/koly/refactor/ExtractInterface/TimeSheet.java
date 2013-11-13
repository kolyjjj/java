package li.koly.refactor.ExtractInterface;

public class TimeSheet {
    double charge(Billable emp, int days){
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill()){
            return base * 1.05;
        }
        else return base;
    }
}
