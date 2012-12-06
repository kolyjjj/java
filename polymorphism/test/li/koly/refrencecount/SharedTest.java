package li.koly.refrencecount;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 12/6/12
 * Time: 7:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class SharedTest {
    @Test
    public void shouldBeTheFirstObject(){
        Shared shared = new Shared();
        assertThat(shared.toString(), is("shared: 1"));
    }

    @Test
    public void shouldBeSecondObject(){
        Shared.clear();
        //this way is no good, will make you failed
//        Shared shared1 = new Shared();
//        Shared shared2 = new Shared();
//
//        assertThat(shared1.toString(), is("shared: 1"));
//        assertThat(shared2.toString(), is("shared: 2"));

        Shared shared1 = new Shared();
        assertThat(shared1.toString(), is("shared: 1"));
        Shared shared2 = new Shared();
        assertThat(shared2.toString(), is("shared: 2"));

    }

    @Test
    public void shouldCreateOneAndDispose(){
        Shared.clear();
        Shared shared = new Shared();
        assertThat(shared.dispose(), is("shared 1 disposed,count:0"));
    }

    @Test
    public void shouldCreateTwoAndDispose(){
        Shared.clear();
        Shared shared1 = new Shared();
        Shared shared2 = new Shared();
        assertThat(shared1.dispose(), is("shared 1 disposed,count:1"));
        assertThat(shared2.dispose(), is("shared 2 disposed,count:0"));
    }

    @Test
    public void shouldPrintNothingIfNotDisposedProperly(){
        Shared.clear();
        Shared shared1  = new Shared();
        System.gc();
        //check the console
    }

    @Test
    public void shouldPrintSomething(){
        new Shared();
        System.gc();
    }

}
