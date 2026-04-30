package com.plantilla.tasks;

import com.plantilla.userinterfaces.CompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesionTask implements Task {

    private final String correo;
    private final String clave;

    public IniciarSesionTask(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public static IniciarSesionTask conCredenciales(String correo, String clave) {
        return Tasks.instrumented(
                IniciarSesionTask.class,
                correo,
                clave
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CompraPage.BTN_LOGIN, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(CompraPage.BTN_LOGIN),
                Enter.theValue(correo).into(CompraPage.TXT_EMAIL_LOGIN),
                Enter.theValue(clave).into(CompraPage.TXT_PASSWORD_LOGIN),
                Click.on(CompraPage.BTN_LOGIN_FORM)
        );
    }
}
