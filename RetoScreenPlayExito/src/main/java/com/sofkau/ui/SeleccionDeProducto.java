package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionDeProducto {

    public static final Target BUSCADOR = Target.the("Buscador de un producto")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));
    public static final Target COMPRA_RECOGE = Target.the("")
            .located(By.cssSelector(".exito-geolocation-3-x-active"));

    public static final Target COMBOBOX_ORDENAR_POR=Target.the("Combobox para ordenar")
            .located(By.xpath("(//span[@class='vtex-search-result-3-x-orderByText c-muted-2'])[1]"));

    public static final Target COMPRAR_AHORA=Target.the("Comprar ahora")
            .located(By.cssSelector("div[class='exito-vtex-components-4-x-mainBuyButton exito-vtex-components-4-x-mainBuyButtonNow'] div[class='exito-vtex-components-4-x-blockBuyButton']"));

    public static final Target SELECCIONAR_ALMACEN=Target.the("Seleecionar almacen")
            .located(By.cssSelector("span[class='c-muted-2']"));

    public static final Target FIN_COMPRA=Target.the("Fin compra")
            .located(By.cssSelector("body > div:nth-child(9) > div:nth-child(2) > p:nth-child(2)"));


}
