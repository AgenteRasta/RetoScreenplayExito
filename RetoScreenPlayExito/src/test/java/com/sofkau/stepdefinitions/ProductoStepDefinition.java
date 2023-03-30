package com.sofkau.stepdefinitions;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.logging.Logger;

import static com.sofkau.tasks.NavegarIniciarSesion.navegarIniciarSesion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
public class ProductoStepDefinition extends Configuracion {
    @Given("que el usuario registrado ya esta en la pagina inicial del exito")
    public void queElUsuarioRegistradoYaEstaEnLaPaginaInicialDelExito() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
    }

    @When("navega hasta poder iniciar sesion")
    public void navegaHastaPoderIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(
                navegarIniciarSesion()
        );
    }

    @When("navega hasta seleccionar una {string} y un {string} de menor costo")
    public void navegaHastaSeleccionarUnaYUnDeMenorCosto(String string, String string2) {

    }

    @Then("realiza todo el flujo de compra con envio a domicilio")
    public void realizaTodoElFlujoDeCompraConEnvioADomicilio() {

    }

    @Then("recibe un mensaje de confirmacion")
    public void recibeUnMensajeDeConfirmacion() {

    }
}
