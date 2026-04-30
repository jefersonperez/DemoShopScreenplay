package com.plantilla.tasks;

import com.plantilla.userinterfaces.GoogleHomePage;
import com.plantilla.userinterfaces.MercadoLibrePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class BuscarProductoMercadoLibre implements Task {

    private final String term;

    public BuscarProductoMercadoLibre(String term) {
        this.term = term;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(term).into(MercadoLibrePage.SEARCH_INPUT_MERCADO_LIBRE),
                Hit.the(Keys.ENTER).into(MercadoLibrePage.SEARCH_INPUT_MERCADO_LIBRE)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static BuscarProductoMercadoLibre theTerm(String term) {
        return Tasks.instrumented(BuscarProductoMercadoLibre.class, term);
    }
}

