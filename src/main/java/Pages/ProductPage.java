package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver webDriver){

        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add to cart')]")
    private WebElement addToCartBtn;

    @FindBy(how = How.XPATH, using = "//div[@id='more-information']")
    private WebElement prodDescription;

    @FindBy(how = How.XPATH, using = "//body/div[5]/div[1]/div[2]/h3[1]")
    private WebElement prodPrice;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Samsung galaxy s6')]")
    private WebElement prodTitle;

    @FindBy(how = How.XPATH, using = "//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    private WebElement prodImg;

    public WebElement getProdImg() {
        return prodImg;
    }

    public WebElement getProdTitle() {
        return prodTitle;
    }

    public WebElement getProdPrice() {
        return prodPrice;
    }

    public WebElement getProdDescription() {
        return prodDescription;
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }


}
