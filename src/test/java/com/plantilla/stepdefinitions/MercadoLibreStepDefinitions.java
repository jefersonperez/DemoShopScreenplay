package com.plantilla.stepdefinitions;

import com.plantilla.tasks.BuscarProductoMercadoLibre;
import com.plantilla.tasks.OpenGoogle;
import com.plantilla.tasks.OpenMercadoLibre;
import com.plantilla.tasks.SearchFor;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class MercadoLibreStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(browser));
    }

    @Given("que el usuario abre mercado libre")
    public void queElUsuarioAbreMercadoLibre() {
        usuario.attemptsTo(
                OpenMercadoLibre.onThePage()
        );
    }

    @When("busca iphone")
    public void buscaIphone() {
        usuario.attemptsTo(
                BuscarProductoMercadoLibre.theTerm("iphone 15")
        );
    }
}
