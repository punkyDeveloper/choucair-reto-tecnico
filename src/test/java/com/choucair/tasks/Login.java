package com.choucair.tasks;

import com.choucair.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String email;
    private final String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Login withCredentials(String email, String password) {
        return instrumented(Login.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LINK_LOGIN),
                Enter.theValue(email).into(LoginPage.INPUT_EMAIL),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)
        );
    }
}