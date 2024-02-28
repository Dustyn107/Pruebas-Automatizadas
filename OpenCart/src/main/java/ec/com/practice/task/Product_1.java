package ec.com.practice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static ec.com.practice.ui.HomeProducts.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Product_1 implements Task{

    public static Task selectProduct_1(){
        return instrumented(Product_1.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_PRODUCT_01, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MENU_PRODUCT_01),
                WaitUntil.the(PRODUCT_01, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(PRODUCT_01),
                WaitUntil.the(BUTTON_CART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_CART)

        );

    }
}
