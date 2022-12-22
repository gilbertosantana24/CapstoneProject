package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[@id='cartur']")
    private WebElement cart;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Place Order')]")
    private WebElement placeOrderBtn;

    @FindBy(how = How.XPATH, using = "//h3[@id='totalp']")
    private WebElement totalPrice;

    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/img[1]")
    private WebElement imgProdOne;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Samsung galaxy s6')]")
    private WebElement titleProdOne;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'360')]")
    private WebElement priceProdOne;

    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[4]/a[1]")
    private WebElement delProdOne;

    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/img[1]")
    private WebElement imgProdTwo;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Nokia lumia 1520')]")
    private WebElement titleProdTwo;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'820')]")
    private WebElement priceProdTwo;

    @FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[4]/a[1]")
    private WebElement delProdTwo;


    public WebElement goCart(){
        return cart;
    }

    public WebElement getPlaceOrderBtn() {
        return placeOrderBtn;
    }

    public WebElement getCartTotal(){
        return totalPrice;
    }

    public WebElement getImgItemOne(){
        return imgProdOne;
    }

    public WebElement getTitleItemOne(){
        return titleProdOne;
    }

    public WebElement getPriceItemOne() {
        return priceProdOne;
    }

    public WebElement getDeleteItemOne() {
        return delProdOne;
    }

    public WebElement getImgItemTwo(){
        return imgProdTwo;
    }

    public WebElement getTitleItemTwo(){
        return titleProdTwo;
    }

    public WebElement getPriceItemTwo() {
        return priceProdTwo;
    }

    public WebElement getDeleteItemTwo() {
        return delProdTwo;
    }




}
