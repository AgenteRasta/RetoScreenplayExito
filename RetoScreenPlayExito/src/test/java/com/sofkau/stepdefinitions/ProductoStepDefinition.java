package com.sofkau.stepdefinitions;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.setup.Configuracion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.sikuli.script.ImagePath;

import java.util.logging.Logger;
import static com.sofkau.questions.MensajeConfirmacionCompra.mensajeConfirmacionCompra;
import static com.sofkau.tasks.NavegarIniciarSesion.navegarIniciarSesion;
import static com.sofkau.tasks.SeleccionarProducto.seleccionarProducto;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class ProductoStepDefinition extends Configuracion {

    String newPath = "src/test/resources/images/";
    public static java.util.logging.Logger LOGGER = Logger.getLogger(String.valueOf(ProductoStepDefinition.class));

    @Given("que el usuario registrado ya esta en la pagina inicial del exito")
    public void queElUsuarioRegistradoYaEstaEnLaPaginaInicialDelExito() {
        configurarNavegador();
        try {
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @When("navega hasta poder iniciar sesion")
    public void navegaHastaPoderIniciarSesion(){
        try {
            theActorInTheSpotlight().attemptsTo(
                    navegarIniciarSesion()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @When("navega hasta seleccionar una {string} y un {string} de menor costo")
    public void navegaHastaSeleccionarUnaYUnDeMenorCosto(String string, String string2) {
        ImagePath.setBundlePath(newPath);
        try{
            theActorInTheSpotlight().attemptsTo(
                    seleccionarProducto()
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }

    }

    @Then("realiza todo el flujo de compra con envio a domicilio")
    public void realizaTodoElFlujoDeCompraConEnvioADomicilio() {

    }

    @Then("recibe un mensaje de confirmacion")
    public void recibeUnMensajeDeConfirmacion() {
        try{
            theActorInTheSpotlight().should(
                    seeThat(mensajeConfirmacionCompra(), equalTo("Tu compra es 100% segura"))
            );
        }catch (Exception e){
            LOGGER.warning(e.getMessage());
        }
        quitarDriver();
    }
}
