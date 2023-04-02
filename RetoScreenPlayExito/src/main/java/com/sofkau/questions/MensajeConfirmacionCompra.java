package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.SeleccionDeProducto.FIN_COMPRA;

public class MensajeConfirmacionCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return FIN_COMPRA.resolveFor(actor).getText();
    }

    public static MensajeConfirmacionCompra mensajeConfirmacionCompra(){
        return new MensajeConfirmacionCompra();
    }
}
