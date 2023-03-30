package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDeSesion {

    public static final Target EMAIL_CONTRASENNA = Target.
            the("Boton email y contrasenna")
            .located(By.cssSelector("div[class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn'] span"));

    public static final Target CAMPO_EMAIL = Target.
            the("Campo del email")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));

    public static final Target CAMPO_CONTRASENNA = Target.
            the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_ENTRAR = Target.
            the("Boton entrar")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));



}
