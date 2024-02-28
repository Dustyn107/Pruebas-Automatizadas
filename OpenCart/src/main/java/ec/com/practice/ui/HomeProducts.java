package ec.com.practice.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeProducts {

    public static final Target MENU_PRODUCT_01 = Target.the("menu product 1").locatedBy("//a[normalize-space()='Phones & PDAs']");
    public static final Target PRODUCT_01 = Target.the("menu product 1").locatedBy("//img[@title='HTC Touch HD']");
    public static final Target MENU_PRODUCT_02 = Target.the("menu product 2").locatedBy("//a[normalize-space()='Cameras']");
    public static final Target PRODUCT_02 = Target.the("product 2").locatedBy("//a[normalize-space()='Nikon D300']");
    public static final Target BUTTON_CART = Target.the("product 2").located(By.id("button-cart"));


}
