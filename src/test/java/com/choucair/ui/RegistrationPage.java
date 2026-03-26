package com.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {

    public static final Target LINK_REGISTER = Target.the("Register link")
            .locatedBy("//a[contains(text(),'Register')]");

    public static final Target RADIO_MALE = Target.the("male gender radio")
            .locatedBy("#gender-male");

    public static final Target INPUT_FIRSTNAME = Target.the("first name field")
            .locatedBy("#FirstName");

    public static final Target INPUT_LASTNAME = Target.the("last name field")
            .locatedBy("#LastName");

    public static final Target INPUT_EMAIL = Target.the("email field")
            .locatedBy("#Email");

    public static final Target INPUT_PASSWORD = Target.the("password field")
            .locatedBy("#Password");

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("confirm password field")
            .locatedBy("#ConfirmPassword");

    public static final Target BTN_REGISTER = Target.the("register button")
            .locatedBy("#register-button");

    public static final Target REGISTRATION_MESSAGE = Target.the("registration success message")
            .locatedBy(".result");
}