package com.plantilla.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TheResults implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor)
                .getDriver()
                .getTitle()
                .contains("iphone");
    }

    public static TheResults areDisplayed() {
        return new TheResults();
    }
}
