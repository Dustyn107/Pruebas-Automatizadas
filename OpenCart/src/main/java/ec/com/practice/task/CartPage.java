package ec.com.practice.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static ec.com.practice.ui.CarritodeCompras.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CartPage implements Task {

    public static Task Carrito(){
        return instrumented(CartPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                WaitUntil.the(BUTTON_CART2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_CART2),
                WaitUntil.the(BUTTON_VIEW_CART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_VIEW_CART),
                WaitUntil.the(BUTTON_AVANCE_CART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_AVANCE_CART)

        );


    }
}
