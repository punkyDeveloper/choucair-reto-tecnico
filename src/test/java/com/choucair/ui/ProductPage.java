package com.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static final Target MENU_COMPUTERS = Target.the("Computers menu")
            .locatedBy("//ul[contains(@class,'top-menu')]//a[normalize-space()='Computers']");

    public static final Target SUBMENU_DESKTOPS = Target.the("Desktops submenu")
            .locatedBy("//ul[contains(@class,'top-menu')]//a[normalize-space()='Desktops']");

    public static final Target FIRST_PRODUCT = Target.the("first product in list")
            .locatedBy("(//div[contains(@class,'product-item')]//h2[@class='product-title']/a)[1]");

    public static final Target BTN_ADD_TO_CART = Target.the("add to cart button")
            .locatedBy("//input[contains(@id,'add-to-cart-button') or @value='Add to cart']");

    public static final Target LINK_SHOPPING_CART = Target.the("shopping cart link")
            .locatedBy("//a[contains(@href,'/cart')]");

    public static final Target CHECKBOX_TERMS = Target.the("terms of service checkbox")
            .locatedBy("#termsofservice");

    public static final Target BTN_CHECKOUT = Target.the("checkout button")
            .locatedBy("#checkout");
    public static final Target SUCCESS_NOTIFICATION = Target.the("product added notification")
            .locatedBy("//p[contains(@class,'content') and contains(text(),'The product has been added')]");

}