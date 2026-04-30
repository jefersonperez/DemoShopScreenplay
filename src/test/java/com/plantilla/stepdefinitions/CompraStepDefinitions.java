package com.plantilla.stepdefinitions;

import com.plantilla.questions.MensajeOrdenExitosa;
import com.plantilla.tasks.IniciarSesionTask;
import com.plantilla.tasks.RealizarCompraTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver browser;

    Actor usuario = Actor.named("Usuario");

    @Before
    public void setUp() {
        usuario.can(BrowseTheWeb.with(browser));
    }

    @When("inicia sesion con usuario {string} y clave {string}")
    public void iniciarSesion(String correo, String clave) {
        usuario.attemptsTo(
                IniciarSesionTask.conCredenciales(correo, clave)
        );
    }

    @And("realiza la compra con ciudad {string}, direccion {string}, zip {string}, telefono {string}, tarjeta {string}, titular {string}, numero {string}, mes {string}, anio {string} y codigo {string}")
    public void realizaCompra(String ciudad, String direccion, String zip, String telefono,
                              String tarjeta, String titular, String numero,
                              String mes, String anio, String cvv) {

        usuario.attemptsTo(
                RealizarCompraTask.conDatos(
                        ciudad,
                        direccion,
                        zip,
                        telefono,
                        tarjeta,
                        titular,
                        numero,
                        mes,
                        anio,
                        cvv
                )
        );
    }

    @Then("valida que la orden fue procesada exitosamente")
    public void validaOrdenExitosa() {
        usuario.should(
                seeThat(MensajeOrdenExitosa.esVisible())
        );
    }
}