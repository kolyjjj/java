package li.koly.EffectiveJava.useFunctionObjectsToRepresentStrategies;

public class Host {

    private static class StrLenCmp implements Comparator<String>{

        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
    }

    public static final Comparator STR_LEN_CMP = new StrLenCmp();
}
