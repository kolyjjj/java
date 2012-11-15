package li.koly.ClassObject;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SweetShopTest {
    @Test
    public void should_print_creation_sequence_string() {
        SweetShop sweetShop = new SweetShop();
        assertThat(sweetShop.create(), is("Start!\nLoading Candy!\nLoading Gum!\nLoading Cookie!"));
    }


}
