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
        return "(" + telephoneNumber.getOfficeAreaCode() + ")" + telephoneNumber.getOfficeNumber();
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
