package li.koly.ExtractInterface;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Billable {
    private int rate;
    private List<String> specialSkills = new ArrayList<String>();

    public int getRate() {
        return rate;
    }

    public boolean hasSpecialSkill() {
        return !specialSkills.isEmpty();
    }
}
