package com.plantilla.questions;

import com.plantilla.userinterfaces.CompraPage;
import net.serenitybdd.screenplay.Question;

public class MensajeOrdenExitosa {
    public static Question<Boolean> esVisible() {
        return actor -> CompraPage.LBL_ORDEN_EXITOSA.resolveFor(actor).isVisible();
    }
}
