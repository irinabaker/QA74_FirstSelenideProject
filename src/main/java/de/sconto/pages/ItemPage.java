package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    private static final String itemNumber = PropertiesLoader.loadProperty("item");

    public ItemPage clickOnItem() {
        $("li:nth-child(" + itemNumber + ")>article>a").click();
        return Selenide.page(this);
    }
}
