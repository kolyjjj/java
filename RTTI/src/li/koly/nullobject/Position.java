package li.koly.nullobject;

public class Position {
    private String jobTitle;
    private Person person;

    public Position(String jobTitle, Person person) {
        this.jobTitle = jobTitle;
        this.person = person;
        setPersonToNullPerson();
    }

    @Override
    public String toString() {
        return "Position: " + jobTitle + " " + person;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        setPersonToNullPerson();
    }

    private void setPersonToNullPerson() {
        if (this.person == null){
            this.person = Person.NULL;
        }
    }
}
