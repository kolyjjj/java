package li.koly.refactor.ExtractClass;

public class TelephoneNumber {


    private String officeAreaCode;
    private String officeNumber;

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }


    public String getOfficeNumber() {
        return officeNumber;
    }

    public String getTelephoneNumber(){
        return "(" + getOfficeAreaCode() + ")" + getOfficeNumber();
    }
}
