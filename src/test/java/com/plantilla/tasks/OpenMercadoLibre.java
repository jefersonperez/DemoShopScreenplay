package com.plantilla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenMercadoLibre implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.mercadolibre.com.co")
        );
    }

    public static OpenMercadoLibre onThePage() {
        return Tasks.instrumented(OpenMercadoLibre.class);
    }
}
