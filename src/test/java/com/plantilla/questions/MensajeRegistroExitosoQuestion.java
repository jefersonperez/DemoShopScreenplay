package com.plantilla.questions;

import com.plantilla.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRegistroExitosoQuestion implements Question<Boolean> {

    public static MensajeRegistroExitosoQuestion esVisible() {
        return new MensajeRegistroExitosoQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RegistroUsuarioPage.LBL_REGISTRO_EXITOSO
                .resolveFor(actor)
                .isVisible();
    }
}
