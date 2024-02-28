package ec.com.practice.steps;


import ec.com.practice.navigation.NavigatorTo;
import ec.com.practice.question.Success;
import ec.com.practice.task.CartPage;
import ec.com.practice.task.Product_1;
import ec.com.practice.task.Product_2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static ec.com.practice.task.CheckOutPage.withData;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class OpenCartSteps {
    String user;

    @Given("^el (.*) Ingresa en la Web$")
    public void el_usuarioIngresaEnLaWeb(String usuario) {
        this.user = usuario;
        theActorCalled(user).attemptsTo(
               NavigatorTo.SauceUrl()
        );
    }

    @When("Selecciona dos productos")
    public void SeleccionaDosProductos() {
        theActorCalled(user).attemptsTo(

                Product_1.selectProduct_1(),
                Product_2.selectProduct_2()
        );
    }

    @Then("los agrega en el carrito de compras y los ve en el carrito")
    public void loAgregaEnElCarritoDeComprasyLosVeEnElCarrito() {
        theActorCalled(user).attemptsTo(

                CartPage.Carrito()
        );
    }

    @When("^diligencia el formulario con los datos (.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void diligenciaElFormularioConLosDatos(String fristName, String lastName, String email, String telephone, String address, String city, String postcode) {
       theActorInTheSpotlight().attemptsTo(
                withData(fristName, lastName, address, email, telephone, city, postcode)
        );

    }

    @And("completa su compra")
    public void completaSuCompra() {
        theActorInTheSpotlight().should(
                seeThat("the displayed test", Success.tituloFinal(), equalTo("Your order has been placed!"))

        );

    }
}
