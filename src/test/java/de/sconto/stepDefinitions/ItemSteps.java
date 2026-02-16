package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CartPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.ItemPage;
import io.cucumber.java.en.And;

public class ItemSteps {

    HomePage home;
    ItemPage item;
    CartPage cart;

    @And("User clicks on first category")
    public void click_on_category() {
        home = Selenide.page(HomePage.class);
        home.clickOnCategory();
    }

    @And("User clicks on first item")
    public void click_on_item() {
        item = Selenide.page(ItemPage.class);
        item.clickOnItem();
    }
}
