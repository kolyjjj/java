package li.koly.ExtractClass;

public class Person {

    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }
}
