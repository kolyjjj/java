package li.koly.SeparateQueryFromModifier;

public class Security {
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
