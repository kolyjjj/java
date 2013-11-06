package li.koly.SeparateQueryFromModifier;

public class Security {
    //this method is doing two things, the first one is returning a string, which is
    //the main responsibility, the sencond is to send alert, which is the 'side effect'
    String foundMiscreant(String[] people){
        for (int i = 0; i < people.length; i++){
            if (people[i].equals("Don")){
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")){
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
        System.out.println("sending alert!");
    }
}
