package li.koly.ExtractClass;

public class Person {

    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber(){
        return "(" + officeAreaCode + ")" + officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}
