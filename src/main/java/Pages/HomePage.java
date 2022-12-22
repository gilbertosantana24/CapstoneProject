package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(how = How.LINK_TEXT, using = "Samsung galaxy s6")
    private WebElement samsungGalaxy;

    @FindBy(how = How.LINK_TEXT, using = "Nokia lumia 1520")
    private WebElement nokiaLumia;

    @FindBy(how = How.XPATH, using = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement home;

    @FindBy(how = How.XPATH, using = "//body/div[@id='contcont']/div[1]/div[1]/div[1]")
    private WebElement categoriesBox;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Phones')]")
    private WebElement phonesCtg;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Laptops')]")
    private WebElement laptopsCtg;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Monitors')]")
    private WebElement monitorsCtg;

    public WebElement getSamsungGalaxy(){
        return samsungGalaxy;
    }
    public WebElement getNokiaLumia(){
        return nokiaLumia;
    }
    public WebElement goHome(){
        return home;
    }

    public WebElement getCategoriesBox() {
        return categoriesBox;
    }

    public WebElement getPhonesCtg() {
        return phonesCtg;
    }

    public WebElement getLaptopsCtg() {
        return laptopsCtg;
    }

    public WebElement getMonitorsCtg() {
        return monitorsCtg;
    }



    }

