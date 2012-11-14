package li.koly;

public abstract class Shape {
    public String draw(){
        return this + ".draw";
    }
    public abstract String toString();

    public String rotate(){
        if (this.getClass().equals(Triangle.class)){
            return "Triangle.rotate";
        }
        return "";
    }
}
