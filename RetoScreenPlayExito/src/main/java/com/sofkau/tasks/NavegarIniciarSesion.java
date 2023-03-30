package com.sofkau.tasks;

import io.appium.java_client.android.nativekey.PressesKey;
import io.cucumber.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Key;

import java.time.Duration;

import static com.sofkau.ui.InicioDeSesion.*;
import static com.sofkau.ui.PaginaInicial.MI_CUENTA;

public class NavegarIniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MI_CUENTA),
                Click.on(INGRESAR_CON_EMAIL_CC),
                Enter.theValue("email").into(CAMPO_EMAIL)
                //Hit.the(Keys.TAB).into(CAMPO_EMAIL),

                //Click.on(VER_CONTRASENIA)
                //Click.on(BOTON_ENTRAR)
            );


    }
    public static NavegarIniciarSesion navegarIniciarSesion(){
        return new NavegarIniciarSesion();
    }
}
