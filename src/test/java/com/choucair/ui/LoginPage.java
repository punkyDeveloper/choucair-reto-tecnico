package com.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target LINK_LOGIN = Target.the("Log in link")
            .locatedBy("//a[contains(text(),'Log in')]");

    public static final Target INPUT_EMAIL = Target.the("email login field")
            .locatedBy("#Email");

    public static final Target INPUT_PASSWORD = Target.the("password login field")
            .locatedBy("#Password");

    public static final Target BTN_LOGIN = Target.the("login button")
            .locatedBy(".login-button");
}