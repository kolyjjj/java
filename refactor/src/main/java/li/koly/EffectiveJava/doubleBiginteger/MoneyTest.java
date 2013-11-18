package li.koly.EffectiveJava.doubleBiginteger;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MoneyTest {

    @Test
    public void should_wrong_using_double(){
        double funds = 1.00;
        int itemsBought = 0;

        for (double price = .10; funds >= price; price += .10){
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);

        assertThat(funds, is(0.));
    }
    
    @Test
    public void should_be_fine_using_big_decimal(){
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");

        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0;
                price = price.add(TEN_CENTS)){
            itemsBought++;
            funds = funds.subtract(price);
        }
        System.out.println(itemsBought + "items bought.");
        System.out.println("Money left over: $" + funds);

        assertThat(funds, is(new BigDecimal("0.00")));
    }

    @Test
    public void should_right_using_int(){
        int itemsBought = 0;
        int funds = 100;
        for (int price = 10; funds >= price; price += 10){
            itemsBought++;
            funds -= price;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: " + funds + " cents");
        assertThat(funds, is(0));
    }
}
