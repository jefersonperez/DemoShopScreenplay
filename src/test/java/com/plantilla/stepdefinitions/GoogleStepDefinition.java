package com.plantilla.stepdefinitions;
import com.plantilla.questions.TheResults;
import com.plantilla.tasks.OpenGoogle;
import com.plantilla.tasks.SearchFor;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefinition {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(browser));
    }

    @Given("que el usuario abre Google")
    public void queElUsuarioAbreGoogle() {
        usuario.attemptsTo(
                OpenGoogle.onThePage()
        );
    }

    @When("busca Serenity BDD")
    public void buscaSerenityBDD() {
        usuario.attemptsTo(
                SearchFor.theTerm("Serenity BDD")
        );
    }

    @Then("debería ver resultados")
    public void deberiaVerResultados() {
        assertTrue(
                TheResults.areDisplayed().answeredBy(usuario)
        );
    }
}