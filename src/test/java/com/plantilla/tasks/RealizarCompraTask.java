package com.plantilla.tasks;
import com.plantilla.userinterfaces.CompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarCompraTask implements Task {

    private final String ciudad;
    private final String direccion;
    private final String zip;
    private final String telefono;
    private final String tarjeta;
    private final String titular;
    private final String numero;
    private final String mes;
    private final String anio;
    private final String cvv;

    public RealizarCompraTask(String ciudad, String direccion, String zip, String telefono,
                              String tarjeta, String titular, String numero,
                              String mes, String anio, String cvv) {

        this.ciudad = ciudad;
        this.direccion = direccion;
        this.zip = zip;
        this.telefono = telefono;
        this.tarjeta = tarjeta;
        this.titular = titular;
        this.numero = numero;
        this.mes = mes;
        this.anio = anio;
        this.cvv = cvv;
    }

    public static RealizarCompraTask conDatos(String ciudad, String direccion, String zip, String telefono,
                                              String tarjeta, String titular, String numero,
                                              String mes, String anio, String cvv) {

        return Tasks.instrumented(
                RealizarCompraTask.class,
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
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CompraPage.MENU_COMPUTERS, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(CompraPage.MENU_COMPUTERS),
                Click.on(CompraPage.SUBMENU_DESKTOPS),
                Click.on(CompraPage.BTN_PRIMER_ADD_CART),
                Click.on(CompraPage.BTN_ADD_CART_DETALLE),
                WaitUntil.the(CompraPage.BTN_CART, isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(CompraPage.BTN_CART),

                SelectFromOptions.byVisibleText("Colombia")
                        .from(CompraPage.SELECT_COUNTRY),

                Click.on(CompraPage.BTN_ESTIMATE),
                Click.on(CompraPage.CHK_TERMS),
                Click.on(CompraPage.BTN_CHECKOUT),

                SelectFromOptions.byVisibleText("Colombia")
                        .from(CompraPage.SELECT_BILLING_COUNTRY),

                Enter.theValue(ciudad)
                        .into(CompraPage.TXT_BILLING_CITY),

                Enter.theValue(direccion)
                        .into(CompraPage.TXT_BILLING_ADDRESS),

                Enter.theValue(zip)
                        .into(CompraPage.TXT_BILLING_ZIP),

                Enter.theValue(telefono)
                        .into(CompraPage.TXT_BILLING_PHONE),

                Click.on(CompraPage.BTN_CONTINUE_BILLING),
                Click.on(CompraPage.BTN_CONTINUE_SHIPPING),
                Click.on(CompraPage.BTN_CONTINUE_METHOD),

                Click.on(CompraPage.RADIO_CREDIT_CARD),
                Click.on(CompraPage.BTN_CONTINUE_PAYMENT_METHOD),

                SelectFromOptions.byVisibleText(tarjeta)
                        .from(CompraPage.SELECT_CARD_TYPE),

                Enter.theValue(titular)
                        .into(CompraPage.TXT_CARDHOLDER),

                Enter.theValue(numero)
                        .into(CompraPage.TXT_CARD_NUMBER),

                SelectFromOptions.byVisibleText(mes)
                        .from(CompraPage.SELECT_MONTH),

                SelectFromOptions.byVisibleText(anio)
                        .from(CompraPage.SELECT_YEAR),

                Enter.theValue(cvv)
                        .into(CompraPage.TXT_CVV),

                Click.on(CompraPage.BTN_CONTINUE_PAYMENT_INFO),
                Click.on(CompraPage.BTN_CONFIRM_ORDER)
        );
    }
}