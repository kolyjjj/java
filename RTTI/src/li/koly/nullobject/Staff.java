package li.koly.nullobject;

import java.util.ArrayList;

public class Staff extends ArrayList<Position>{
    public Staff(String title, Person person) {
        add(new Position(title, person));
    }

    public Staff(String... titles){
        add(titles);
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title, null));
        }
    }

    public boolean positionAvailable(String title) {
        for (Position p : this) {
            if (p.getJobTitle().equals(title) && p.getPerson() instanceof Null){
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person person) {
        for (Position p : this){
            if (p.getJobTitle() == title && p.getPerson() instanceof Null){
                p.setPerson(person);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available!");
    }
}
