package ec.com.practice.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class Success implements Question<String> {
    public static Question<String> tituloFinal(){ return new Success(); }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).findBy("//*[@id='content']/h1").getText();


    }
}
