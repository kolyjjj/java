package li.koly.EffectiveJava.useFunctionObjectsToRepresentStrategies;

public class StringLengthComparator {

    private StringLengthComparator(){

    }

    public static final StringLengthComparator stringLengthComparator = new StringLengthComparator();

    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}
