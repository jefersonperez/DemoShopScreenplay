package com.plantilla.tasks;

import com.plantilla.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class SearchFor implements Task {

    private final String term;

    public SearchFor(String term) {
        this.term = term;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(term).into(GoogleHomePage.SEARCH_INPUT),
                Hit.the(Keys.ENTER).into(GoogleHomePage.SEARCH_INPUT)
        );
    }

    public static SearchFor theTerm(String term) {
        return Tasks.instrumented(SearchFor.class, term);
    }
}
