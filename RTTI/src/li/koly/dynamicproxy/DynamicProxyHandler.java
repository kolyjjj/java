package li.koly.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private RealObject proxied;

    public DynamicProxyHandler(RealObject realObject) {
        this.proxied = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //this is what we add to the original object
        System.out.println("**** proxy: " + proxy.getClass() + "****method  " + method + "****args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);
        //this is to invoke the original method
        return method.invoke(proxied, args);
    }
}
