package com.choucair.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver driver;

    Actor user = Actor.named("User");

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(driver));
    }
}