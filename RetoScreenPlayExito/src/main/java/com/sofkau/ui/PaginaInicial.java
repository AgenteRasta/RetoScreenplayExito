package com.sofkau.ui;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class PaginaInicial extends PageObject {

    public static final Target MI_CUENTA=Target.the("Ingresar a mi cuenta")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));
}
