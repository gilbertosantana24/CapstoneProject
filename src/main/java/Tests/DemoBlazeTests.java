package Tests;

import Steps.BlazeDemoSteps;
import Steps.CartSteps;
import Steps.HomeSteps;
import Steps.ProductSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class DemoBlazeTests extends BaseTest {

    BlazeDemoSteps baseDemoSteps = new BlazeDemoSteps(driver);
    HomeSteps homeSteps = new HomeSteps(driver);
    ProductSteps productSteps = new ProductSteps(driver);
    CartSteps cartSteps = new CartSteps(driver);


    @Test(description = "Test opening the page there must be three categories displayed")
    public void testCategories() throws InterruptedException {
       homeSteps.getNumOfCategories();
    }

    @Test(description = "Clicking any of the products in the catalog displayed in the homepage\n" +
            "will display:\n" +
            "Add to cart button\n" +
            "Product description\n" +
            "Price\n" +
            "Name of the products\n" +
            "Image of the products\n")
    //"SRS-12120")
    public void testProductInfo() throws InterruptedException {
        homeSteps.getSamsungGalaxy();
        productSteps.getAllInfo();
    }

    @Test(description = "Clicking add to cart button will display browser alert with\n" +
            "below info:\n" +
            "Product added\n" +
            "Ok button to accept")
    public void clickAddToCart() throws InterruptedException {
        homeSteps.getSamsungGalaxy();
        productSteps.clickAddToCart();
        productSteps.catchAlertMessage();
    }

    @Test(description = "Clicking the cart link will display below information:\n" +
            " - List of items added including picture, title, price and delete\n" +
            "link\n" +
            "- Total of items prices\n" +
            "- Place order button")
    public void cartCheck() throws InterruptedException {
        homeSteps.getSamsungGalaxy();
        productSteps.clickAddToCart();
        productSteps.catchAlertMessage();
        homeSteps.goHomePage();
        homeSteps.getNokiaLumia();
        productSteps.clickAddToCart();
        productSteps.catchAlertMessage();
        cartSteps.goCartpage();
        cartSteps.checkCartInfo();
    }
}
