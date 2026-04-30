package com.plantilla.stepdefinitions;

import com.plantilla.questions.MensajeRegistroExitosoQuestion;
import com.plantilla.tasks.AbrirDemoWebShop;
import com.plantilla.tasks.RegistrarUsuarioTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroUsuarioStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver browser;

    Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(browser));
    }
    @Given("que el usuario ingresa a la pagina de Demo Web Shop")
    public void queElUsuarioIngresaALaPaginaDemoWebShop() {
        usuario.attemptsTo(
                AbrirDemoWebShop.onThePage()
        );
    }
    @When("realiza el registro con genero {string}, nombre {string}, apellido {string}, correo {string} y clave {string}")
    public void realizaElRegistro(String genero, String nombre, String apellido, String correo, String clave) {
        usuario.attemptsTo(
                RegistrarUsuarioTask.conDatos(
                        genero,
                        nombre,
                        apellido,
                        correo,
                        clave
                )
        );
    }
    @Then("valida que el registro fue exitoso")
    public void validaQueElRegistroFueExitoso() {
        usuario.should(
                seeThat(MensajeRegistroExitosoQuestion.esVisible())
        );
    }
}
