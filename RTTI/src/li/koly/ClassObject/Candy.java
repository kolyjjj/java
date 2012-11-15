package li.koly.ClassObject;

public class Candy {
    private static String i;
    static {
        i = "Loading Candy!";
    }

    public String getCandy(){
        return i;
    }
}
