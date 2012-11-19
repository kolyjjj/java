package li.koly.ClassObject;


import java.lang.reflect.InvocationTargetException;

public class SweetShop {
    public String create() {
        String result = "Start!\n" + new Candy().getCandy() + "\n";
        try {
            Class<?> aClass = Class.forName("li.koly.ClassObject.Gum");
//            Class<?> aClass = Class.forName("Gum");  //this line will not pass the test
            Object anObject = aClass.newInstance();
            result += aClass.getMethod("getGum").invoke(anObject) + "\n";
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        result += new Cookie().getCookie();
        return result;
    }
}
