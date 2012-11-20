package li.koly.dynamicproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleProxyTest {
    @Test
    public void should_show_proxy_information() {
        SimpleProxy simpleProxy = new SimpleProxy(new RealObject());
        assertThat(simpleProxy.doSomething(), is("simple proxy do something!\ndo something!"));
        assertThat(simpleProxy.doAnotherThing(), is("simple proxy do another thing!\ndo another thing!"));
    }

    @Test
    public void can_use_simple_proxy_wherever_use_real_object() {
        assertThat(consume(new RealObject()), is("do something!\ndo another thing!"));
        assertThat(consume(new SimpleProxy(new RealObject())), is("simple proxy do something!\ndo something!\n" +
                "simple proxy do another thing!\ndo another thing!"));
    }

    //this is not a test, really dont' know how to test the DynamicProxyHandler class
    @Test
    public void should_show_proxy_message_use_dynamic_proxy() {
        assertThat(consume(new RealObject()), is("do something!\ndo another thing!"));
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class},
                new DynamicProxyHandler(new RealObject()));
        consume(proxy);
    }

    private String consume(Interface anInterface) {
        return anInterface.doSomething() + "\n" + anInterface.doAnotherThing();
    }
}
