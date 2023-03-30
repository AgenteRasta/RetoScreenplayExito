package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDeSesion {

    public static Target INGRESAR_CON_EMAIL_CC=Target.the("Ingresar con email y contrasenia")
            .located(By.cssSelector("div[class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn'] span"));

    public static Target CAMPO_EMAIL=Target.the("Campo de email para iniciar sesion")
            .located(By.cssSelector("input[placeholder='Ingresa tu email']"));

    public static Target CAMPO_CONTRASENIA=Target.the("Campo de contrasenia para iniciar sesion")
            .located(By.cssSelector("div[class='relative'] label[class='vtex-input w-100']"));

    public static Target CAMPO_CONTRASENIA_XPATH=Target.the("Campo")
            .located(By.xpath("//input[@placeholder='Ingresa tu contraseña']"));

    public static Target VER_CONTRASENIA=Target.the("Ver contrasenia")
            .located(By.cssSelector("body > div:nth-child(87) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(3) > div:nth-child(1) > label:nth-child(1) > div:nth-child(1) > span:nth-child(2)"));

    public static Target BOTON_ENTRAR=Target.the("Iniciar sesion")
            .located(By.cssSelector("span[class='t-small']"));
}
