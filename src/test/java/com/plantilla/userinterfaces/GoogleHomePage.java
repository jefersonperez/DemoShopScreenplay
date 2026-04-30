package com.plantilla.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleHomePage {
    public static final Target SEARCH_INPUT = Target.the("campo de búsqueda")
            .located(By.name("q"));
}
