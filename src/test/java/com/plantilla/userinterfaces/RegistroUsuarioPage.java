package com.plantilla.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPage {
    public static final Target BTN_REGISTER = Target.the("boton Register menu principal")
            .locatedBy("//a[@href='/register' and contains(@class,'ico-register')]");

    public static final Target RADIO_MALE = Target.the("radio button male")
            .locatedBy("//input[@id='gender-male']");

    public static final Target RADIO_FEMALE = Target.the("radio button female")
            .locatedBy("//input[@id='gender-female']");

    public static final Target TXT_FIRSTNAME = Target.the("campo First Name")
            .locatedBy("//input[@id='FirstName']");

    public static final Target TXT_LASTNAME = Target.the("campo Last Name")
            .locatedBy("//input[@id='LastName']");

    public static final Target TXT_EMAIL = Target.the("campo Email")
            .locatedBy("//input[@id='Email']");

    public static final Target TXT_PASSWORD = Target.the("campo Password")
            .locatedBy("//input[@id='Password']");

    public static final Target TXT_CONFIRM_PASSWORD = Target.the("campo Confirm Password")
            .locatedBy("//input[@id='ConfirmPassword']");

    public static final Target BTN_REGISTER_FORM = Target.the("boton Register del formulario")
            .locatedBy("//input[@id='register-button']");

    public static final Target LBL_REGISTRO_EXITOSO = Target.the("mensaje de registro exitoso")
            .locatedBy("//div[@class='result' and contains(text(),'Your registration completed')]");
}
