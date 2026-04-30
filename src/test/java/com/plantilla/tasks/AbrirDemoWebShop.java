package com.plantilla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirDemoWebShop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://demowebshop.tricentis.com/")
        );
    }

    public static AbrirDemoWebShop onThePage() {
        return Tasks.instrumented(AbrirDemoWebShop.class);
    }
}
