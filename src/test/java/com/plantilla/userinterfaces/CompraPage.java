package com.plantilla.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompraPage {
    public static final Target BTN_LOGIN = Target.the("boton login")
            .locatedBy("//a[@href='/login']");

    public static final Target TXT_EMAIL_LOGIN = Target.the("email login")
            .locatedBy("//input[@id='Email']");

    public static final Target TXT_PASSWORD_LOGIN = Target.the("password login")
            .locatedBy("//input[@id='Password']");

    public static final Target BTN_LOGIN_FORM = Target.the("submit login")
            .locatedBy("//input[@value='Log in']");

    public static final Target MENU_COMPUTERS = Target.the("menu computers")
            .locatedBy("//a[@href='/computers']");

    public static final Target SUBMENU_DESKTOPS = Target.the("submenu desktops")
            .locatedBy("//a[@href='/desktops' and @title='Show products in category Desktops']");

    public static final Target BTN_PRIMER_ADD_CART = Target.the("primer add cart")
            .locatedBy("(//input[@value='Add to cart'])[1]");

    public static final Target BTN_ADD_CART_DETALLE = Target.the("add cart detalle")
            .locatedBy("//input[contains(@id,'add-to-cart-button')]");

    public static final Target BTN_CART = Target.the("shopping cart")
            .locatedBy("//a[@href='/cart']");

    public static final Target SELECT_COUNTRY = Target.the("country")
            .locatedBy("//select[@id='CountryId']");

    public static final Target BTN_ESTIMATE = Target.the("estimate shipping")
            .locatedBy("//input[@value='Estimate shipping']");

    public static final Target CHK_TERMS = Target.the("terms")
            .locatedBy("//input[@id='termsofservice']");

    public static final Target BTN_CHECKOUT = Target.the("checkout")
            .locatedBy("//button[@id='checkout']");

    public static final Target BTN_CONTINUE_BILLING = Target.the("continue billing")
            .locatedBy("(//input[@value='Continue'])[1]");

    public static final Target BTN_CONTINUE_SHIPPING = Target.the("continue shipping")
            .locatedBy("(//input[@value='Continue'])[2]");

    public static final Target BTN_CONTINUE_METHOD = Target.the("continue shipping method")
            .locatedBy("(//input[@value='Continue'])[3]");

    public static final Target RADIO_CREDIT_CARD = Target.the("credit card")
            .locatedBy("//input[@id='paymentmethod_2']");

    public static final Target BTN_CONTINUE_PAYMENT_METHOD = Target.the("continue payment method")
            .locatedBy("//input[contains(@class,'payment-method-next-step-button')]");

    public static final Target SELECT_CARD_TYPE = Target.the("card type")
            .locatedBy("//select[@id='CreditCardType']");

    public static final Target TXT_CARDHOLDER = Target.the("cardholder")
            .locatedBy("//input[@id='CardholderName']");

    public static final Target TXT_CARD_NUMBER = Target.the("card number")
            .locatedBy("//input[@id='CardNumber']");

    public static final Target SELECT_MONTH = Target.the("expire month")
            .locatedBy("//select[@id='ExpireMonth']");

    public static final Target SELECT_YEAR = Target.the("expire year")
            .locatedBy("//select[@id='ExpireYear']");

    public static final Target TXT_CVV = Target.the("cvv")
            .locatedBy("//input[@id='CardCode']");

    public static final Target BTN_CONTINUE_PAYMENT_INFO = Target.the("continue payment info")
            .locatedBy("//input[contains(@class,'payment-info-next-step-button')]");

    public static final Target BTN_CONFIRM_ORDER = Target.the("confirm order")
            .locatedBy("//input[contains(@class,'confirm-order-next-step-button')]");

    public static final Target LBL_ORDEN_EXITOSA = Target.the("orden exitosa")
            .locatedBy("//div[@class='title']//strong[contains(text(),'Your order has been successfully processed!')]");

    public static final Target SELECT_BILLING_COUNTRY = Target.the("billing country")
            .locatedBy("//select[@id='BillingNewAddress_CountryId']");

    public static final Target TXT_BILLING_CITY = Target.the("billing city")
            .locatedBy("//input[@id='BillingNewAddress_City']");

    public static final Target TXT_BILLING_ADDRESS = Target.the("billing address")
            .locatedBy("//input[@id='BillingNewAddress_Address1']");

    public static final Target TXT_BILLING_ZIP = Target.the("billing zip")
            .locatedBy("//input[@id='BillingNewAddress_ZipPostalCode']");

    public static final Target TXT_BILLING_PHONE = Target.the("billing phone")
            .locatedBy("//input[@id='BillingNewAddress_PhoneNumber']");
}