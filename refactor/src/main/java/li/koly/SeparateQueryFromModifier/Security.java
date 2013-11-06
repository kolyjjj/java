package li.koly.SeparateQueryFromModifier;

public class Security {
    //this method is doing two things, the first one is returning a string, which is
    //the main responsibility, the sencond is to send alert, which is the 'side effect'
    void sendALert(String[] people){
        for (int i = 0; i < people.length; i++){
            if (people[i].equals("Don")){
                sendAlert();
                return;
            }
            if (people[i].equals("John")){
                sendAlert();
                return;
            }
        }
    }

    String foundPerson(String[] people){
        for (int i = 0; i < people.length; i++){
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
        System.out.println("sending alert!");
    }

    public void checkSecurity(String[] people){
        sendALert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void someLaterCode(String s) {
        System.out.println("some later code");
    }
}
