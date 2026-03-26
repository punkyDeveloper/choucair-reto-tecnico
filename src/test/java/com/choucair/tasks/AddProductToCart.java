package com.choucair.tasks;

import com.choucair.ui.ProductPage;
import com.choucair.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {

    public static AddProductToCart fromDesktops() {
        return instrumented(AddProductToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(ProductPage.MENU_COMPUTERS),
                Click.on(ProductPage.SUBMENU_DESKTOPS),

                Click.on(ProductPage.FIRST_PRODUCT),

                Click.on(ProductPage.BTN_ADD_TO_CART),

                Click.on(ProductPage.LINK_SHOPPING_CART),

                Click.on(ProductPage.CHECKBOX_TERMS),

                Click.on(ProductPage.BTN_CHECKOUT),

                Click.on(CheckoutPage.BTN_CHECKOUT_AS_GUEST)
        );
    }
}