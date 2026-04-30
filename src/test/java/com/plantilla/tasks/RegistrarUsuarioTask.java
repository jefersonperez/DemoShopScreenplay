package com.plantilla.tasks;

import com.plantilla.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegistrarUsuarioTask implements Task {

    private final String genero;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String clave;

    public RegistrarUsuarioTask(String genero, String nombre, String apellido, String correo, String clave) {
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.clave = clave;
    }

    public static RegistrarUsuarioTask conDatos(String genero, String nombre, String apellido, String correo, String clave) {
        return Tasks.instrumented(
                RegistrarUsuarioTask.class,
                genero,
                nombre,
                apellido,
                correo,
                clave
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegistroUsuarioPage.BTN_REGISTER)
        );

        if (genero.equalsIgnoreCase("male")) {
            actor.attemptsTo(
                    Click.on(RegistroUsuarioPage.RADIO_MALE)
            );
        } else {
            actor.attemptsTo(
                    Click.on(RegistroUsuarioPage.RADIO_FEMALE)
            );
        }

        actor.attemptsTo(
                Enter.theValue(nombre).into(RegistroUsuarioPage.TXT_FIRSTNAME),
                Enter.theValue(apellido).into(RegistroUsuarioPage.TXT_LASTNAME),
                Enter.theValue(correo).into(RegistroUsuarioPage.TXT_EMAIL),
                Enter.theValue(clave).into(RegistroUsuarioPage.TXT_PASSWORD),
                Enter.theValue(clave).into(RegistroUsuarioPage.TXT_CONFIRM_PASSWORD),
                Click.on(RegistroUsuarioPage.BTN_REGISTER_FORM)
        );
    }
}