package li.koly.dynamicproxy;

public class SimpleProxy implements Interface{
    private RealObject proxied;
//    private Interface proxed;


    public SimpleProxy(RealObject proxied) {
        this.proxied = proxied;
    }

    public String doSomething() {
        return "simple proxy do something!" + "\n" + proxied.doSomething();
    }

    public String doAnotherThing() {
        return "simple proxy do another thing!" + "\n" + proxied.doAnotherThing();
    }
}
