package com.plantilla.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MercadoLibrePage {

    public static final Target SEARCH_INPUT_MERCADO_LIBRE = Target.the("campo de búsqueda mercado libre")
            .located(By.id("cb1-edit"));


}
