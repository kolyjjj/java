package li.koly.nullobject;

public class Person {
    private String address;
    private String first;
    private String last;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    //why should we implements Null?
    //kind of special Class, why make it inner private?
    private static class NullPerson extends Person implements Null{

        public NullPerson() {
            super("none", "none", "none");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }
    //kind of special Object
    public static final Person NULL = new NullPerson();
}
