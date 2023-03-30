package com.sofkau.tasks;

import com.sofkau.util.Sikulix;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;

import static com.sofkau.ui.SeleccionDeProducto.BUSCADOR;
import static com.sofkau.ui.SeleccionDeProducto.COMPRA_RECOGE;


public class SeleccionarProducto implements Task {
    private double precioMenor;
    private String precioMenorTarget;
    private String precioActualTarget;
    private double precioActual;
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(4000);
            Sikulix.typeInto("BUSCADOR.png","atun");
            Sikulix.click("BUSCAR.png");
            Thread.sleep(6000);
            Sikulix.click("CERRAR_MENSAJE");
            Sikulix.click("CERRAR_MENSAJE");
            precioMenor=Double.parseDouble(Target.the("")
                    .located(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > \n" +
                            "section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > \n" +
                            "div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > \n" +
                            "a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > \n" +
                            "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)")).resolveFor(actor).getText().substring(2));
            precioMenorTarget="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > \n" +
                    "section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > \n" +
                    "div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > \n" +
                    "a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > \n" +
                    "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)";
            for(int i=2;i<=10;i++){
                precioActual=Double.parseDouble(Target.the("Buscador de un producto")
                        .located(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > \n" +
                                "section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > \n" +
                                "div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child("+String.valueOf(i)+") > section:nth-child(1) > \n" +
                                "a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > \n" +
                                "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)")).resolveFor(actor).getText().substring(2));
                precioActualTarget="body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > \n" +
                        "section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > \n" +
                        "div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child("+String.valueOf(i)+") > section:nth-child(1) > \n" +
                        "a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > \n" +
                        "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > span:nth-child(1)";
                //System.out.println(precioMenor);
                System.out.println(precioActual);
                System.out.println(precioActualTarget);
                if(precioMenor<=precioActual){
                    precioMenor=precioMenor;
                }else{
                    precioMenor=precioActual;
                    precioMenorTarget=precioActualTarget;
                }
                //System.out.println(precioMenor);
            }


        } catch (FindFailed e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(precioMenorTarget);
        actor.attemptsTo(
                Scroll.to(Target.the("")
                        .located(By.cssSelector(precioMenorTarget))),
                Click.on(Target.the("")
                        .located(By.cssSelector(precioMenorTarget)))
        );

    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
