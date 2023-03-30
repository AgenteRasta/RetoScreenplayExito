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
import static com.sofkau.ui.PaginaInicial.BOTON_CUENTA;


public class NavegarIniciarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_CUENTA),
                Click.on(EMAIL_CONTRASENNA),
                Click.on(CAMPO_EMAIL),
                Enter.theValue("estiven.tr96@gmail.com").into(CAMPO_EMAIL),
                Click.on(CAMPO_CONTRASENNA),
                Enter.theValue("Queserauff1").into(CAMPO_CONTRASENNA),
                Click.on(BOTON_ENTRAR)
                //Hit.the(Keys.TAB).into(CAMPO_EMAIL)
                //Enter.theValue("wenastardes").into(CAMPO_CONTRASENIA.waitingForNoMoreThan(Duration.ofSeconds(5)))
                //webDriver.timeouts.implicitlywait,
            );


    }
    public static NavegarIniciarSesion navegarIniciarSesion(){
        return new NavegarIniciarSesion();
    }
}
