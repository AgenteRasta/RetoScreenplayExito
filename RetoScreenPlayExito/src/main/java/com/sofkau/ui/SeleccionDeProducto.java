package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionDeProducto {

    public static final Target BUSCADOR = Target.the("Buscador de un producto")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));
    public static final Target COMPRA_RECOGE = Target.the("")
            .located(By.cssSelector(".exito-geolocation-3-x-active"));
}
