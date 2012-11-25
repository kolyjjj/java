package li.koly.packageaccess.onepackage;

class B implements A {
    @Override
    public String doSomething() {
        return "I am B!";
    }

    public String doAnotherThing(){
        return "I am doing another thing!";
    }
}

