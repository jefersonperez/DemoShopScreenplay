package com.plantilla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenGoogle implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.google.com")
        );
    }

    public static OpenGoogle onThePage() {
        return Tasks.instrumented(OpenGoogle.class);
    }
}
