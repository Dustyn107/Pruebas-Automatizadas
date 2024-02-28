package ec.com.practice.task;

import ec.com.practice.ui.HomeProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Product_2 implements Task {

    public static Task selectProduct_2(){
        return instrumented(Product_2.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(HomeProducts.MENU_PRODUCT_02, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeProducts.MENU_PRODUCT_02),
                WaitUntil.the(HomeProducts.PRODUCT_02, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeProducts.PRODUCT_02),
                WaitUntil.the(HomeProducts.BUTTON_CART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(HomeProducts.BUTTON_CART)
        );

    }
}
