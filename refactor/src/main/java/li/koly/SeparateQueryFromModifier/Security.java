package li.koly.SeparateQueryFromModifier;

public class Security {
    //this method is doing two things, the first one is returning a string, which is
    //the main responsibility, the sencond is to send alert, which is the 'side effect'
    String foundMiscreant(String[] people){
        for (int i = 0; i < people.length; i++){
            if (people[i].equals("Don")){
                sendAlert();
                return foundPerson(people);
            }
            if (people[i].equals("John")){
                sendAlert();
                return foundPerson(people);
            }
        }
        //since the return value is the result of the Query method,
        //so it's natural to substitute the returning value
        return foundPerson(people);
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
        foundMiscreant(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void someLaterCode(String s) {
        System.out.println("some later code");
    }
}
