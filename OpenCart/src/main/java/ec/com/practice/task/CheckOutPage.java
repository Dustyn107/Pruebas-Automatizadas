package ec.com.practice.task;

import ec.com.practice.ui.CheckOut;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CheckOutPage implements Task {
    private final String FRIST_NAME;
    private final String LAST_NAME;
    private final String ADDRESS;
    private final String EMAIL;
    private final String TELEPHONE;
    private final String CITY;
    private final String POSTCODE;


    public CheckOutPage(String fristName, String lastName, String address, String email, String telephone, String city, String postcode) {
        this.FRIST_NAME = fristName;
        this.LAST_NAME = lastName;
        this.ADDRESS = address;
        this.EMAIL = email;
        this.TELEPHONE = telephone;
        this.CITY = city;
        this.POSTCODE = postcode;

    }

    public static Task withData(String fristName, String lastName, String address, String email, String telephone, String city, String postcode) {
        return instrumented(CheckOutPage.class, fristName, lastName, address, email, telephone, city, postcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CheckOut.GUEST_CHECK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.GUEST_CHECK),
                WaitUntil.the(CheckOut.BUTTON_ACCOUNT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.BUTTON_ACCOUNT),

                //==========Formulario==============

                WaitUntil.the(CheckOut.FRIST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(FRIST_NAME).into(CheckOut.FRIST_NAME),
                WaitUntil.the(CheckOut.LAST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(LAST_NAME).into(CheckOut.LAST_NAME),
                WaitUntil.the(CheckOut.EMAIL, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(ADDRESS).into(CheckOut.EMAIL),
                WaitUntil.the(CheckOut.ADDRESS, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(EMAIL).into(CheckOut.ADDRESS),

                WaitUntil.the(CheckOut.TELEPHONE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(TELEPHONE).into(CheckOut.TELEPHONE),
                WaitUntil.the(CheckOut.CITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(CITY).into(CheckOut.CITY),
                WaitUntil.the(CheckOut.POSTCODE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(POSTCODE).into(CheckOut.POSTCODE),
                WaitUntil.the(CheckOut.REGION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.REGION),
                WaitUntil.the(CheckOut.OPTION_REGION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.OPTION_REGION),

                SelectFromOptions.byValue("3513").from(CheckOut.OPTION_REGION),


                WaitUntil.the(CheckOut.BUTTON_GUEST, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.BUTTON_GUEST),

                WaitUntil.the(CheckOut.BUTTON_DELIVERY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.BUTTON_DELIVERY),

                WaitUntil.the(CheckOut.CHECK_TERMINOS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.CHECK_TERMINOS),

                WaitUntil.the(CheckOut.BUTTON_PAYMENT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.BUTTON_PAYMENT),

                WaitUntil.the(CheckOut.BUTTON_CONFIRM, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckOut.BUTTON_CONFIRM)

        );

    }
}
