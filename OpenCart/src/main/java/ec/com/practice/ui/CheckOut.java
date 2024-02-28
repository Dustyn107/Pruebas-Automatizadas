package ec.com.practice.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOut {


    public static final Target GUEST_CHECK = Target.the("Check de Guest Checkout").locatedBy("//input[@value='guest']");
    public static final Target BUTTON_ACCOUNT = Target.the("Boton para iniciar el diligenciamiento del formulario").located(By.id("button-account"));
    public static final Target FRIST_NAME = Target.the("first name").located(By.id("input-payment-firstname"));
    public static final Target LAST_NAME = Target.the("Last name").located(By.id("input-payment-lastname"));
    public static final Target ADDRESS = Target.the("address").located(By.id("input-payment-address-1"));
    public static final Target EMAIL = Target.the("email").located(By.id("input-payment-email"));
    public static final Target TELEPHONE = Target.the("telephone").located(By.id("input-payment-telephone"));
    public static final Target CITY = Target.the("city").located(By.id("input-payment-city"));
    public static final Target POSTCODE = Target.the("postcode").located(By.id("input-payment-postcode"));
    public static final Target COUNTRY = Target.the("country").located(By.id("input-payment-country"));
    public static final Target OPTION_COUNTRY = Target.the("option country").locatedBy("(//a[@class='btn btn-primary'])");

    public static final Target REGION = Target.the("country").located(By.id("input-payment-zone"));
    public static final Target OPTION_REGION = Target.the("option country").locatedBy("(//*[@id='input-payment-zone'])");

    public static final Target BUTTON_GUEST = Target.the("Boton de continuar").located(By.id("button-guest"));
    public static final Target BUTTON_DELIVERY = Target.the("Boton de continuar").located(By.id("button-shipping-method"));

    public static final Target CHECK_TERMINOS = Target.the("Terminos y condiciones").locatedBy("//input[@name='agree']");
    public static final Target BUTTON_PAYMENT = Target.the("Boton de payment").located(By.id("button-payment-method"));
    public static final Target BUTTON_CONFIRM = Target.the("Boton de confirmar orden").located(By.id("button-confirm"));


}
