package li.koly.dynamicproxy;

public class RealObject implements Interface{
    @Override
    public String doSomething() {
        return "do something!";
    }

    @Override
    public String doAnotherThing() {
        return "do another thing!";
    }
}
