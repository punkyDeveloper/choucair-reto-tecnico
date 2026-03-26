package com.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target INPUT_FIRSTNAME = Target.the("first name billing")
            .locatedBy("#BillingNewAddress_FirstName");

    public static final Target INPUT_LASTNAME = Target.the("last name billing")
            .locatedBy("#BillingNewAddress_LastName");

    public static final Target INPUT_EMAIL = Target.the("email billing")
            .locatedBy("#BillingNewAddress_Email");

    public static final Target INPUT_CITY = Target.the("city billing")
            .locatedBy("#BillingNewAddress_City");

    public static final Target INPUT_ADDRESS1 = Target.the("address billing")
            .locatedBy("#BillingNewAddress_Address1");

    public static final Target INPUT_ZIPCODE = Target.the("zip code billing")
            .locatedBy("#BillingNewAddress_ZipPostalCode");

    public static final Target INPUT_PHONE = Target.the("phone billing")
            .locatedBy("#BillingNewAddress_PhoneNumber");

    public static final Target BTN_CONTINUE_BILLING = Target.the("continue billing")
            .locatedBy("//div[@id='billing-buttons-container']//input[@value='Continue']");

    public static final Target BTN_CONTINUE_SHIPPING = Target.the("continue shipping")
            .locatedBy("//div[@id='shipping-buttons-container']//input[@onclick='Shipping.save()']");

    public static final Target BTN_CONTINUE_SHIPPING_METHOD = Target.the("continue shipping method")
            .locatedBy("//div[@id='shipping-method-buttons-container']//input[contains(@onclick,'ShippingMethod.save')]");

    public static final Target RADIO_CREDIT_CARD = Target.the("credit card radio")
            .locatedBy("//input[@id='paymentmethod_2']");

    public static final Target BTN_CONTINUE_PAYMENT_METHOD = Target.the("continue payment method")
            .locatedBy("//div[@id='payment-method-buttons-container']//input[@value='Continue']");

    public static final Target SELECT_CARD_TYPE = Target.the("credit card type")
            .locatedBy("#CreditCardType");

    public static final Target INPUT_CARD_HOLDER = Target.the("card holder name")
            .locatedBy("#CardholderName");

    public static final Target INPUT_CARD_NUMBER = Target.the("card number")
            .locatedBy("#CardNumber");

    public static final Target SELECT_EXP_MONTH = Target.the("expiration month")
            .locatedBy("#ExpireMonth");

    public static final Target SELECT_EXP_YEAR = Target.the("expiration year")
            .locatedBy("#ExpireYear");

    public static final Target INPUT_CARD_CODE = Target.the("card security code")
            .locatedBy("#CardCode");

    public static final Target BTN_CONTINUE_PAYMENT_INFO = Target.the("continue payment info")
            .locatedBy("//div[@id='payment-info-buttons-container']//input[@value='Continue']");

    public static final Target BTN_CONFIRM_ORDER = Target.the("confirm order button")
            .locatedBy("//div[@id='confirm-order-buttons-container']//input[@value='Confirm']");

    public static final Target ORDER_SUCCESS_MESSAGE = Target.the("order success message")
            .locatedBy("//div[@class='title']/strong");
    public static final Target SELECT_BILLING_ADDRESS = Target.the("billing address dropdown")
            .locatedBy("#billing-address-select");
    public static final Target SELECT_COUNTRY = Target.the("country dropdown")
            .locatedBy("#BillingNewAddress_CountryId");
    public static final Target BILLING_FORM = Target.the("billing form")
            .locatedBy(".enter-address");
    public static final Target BTN_CHECKOUT_AS_GUEST = Target.the("checkout as guest")
            .locatedBy("//input[@value='Checkout as Guest']");


}