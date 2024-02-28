package ec.com.practice.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigatorTo {
    public static Performable SauceUrl(){
        return Task.where("{0} open the home page",
                Open.browserOn().the(OpenCartUrl.class));

    }
}
