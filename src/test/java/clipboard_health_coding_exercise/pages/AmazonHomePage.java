package clipboard_health_coding_exercise.pages;

import clipboard_health_coding_exercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    public AmazonHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[16]/a")
    public WebElement tvAppElec;

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[9]/li[3]/a")
    public WebElement televisions;

    @FindBy(xpath = "//*[@id='s-refinements']/div[21]/ul/li[1]/span/a/div/label/i")
    public WebElement checkBoxSamsung;

    @FindBy(xpath = "//*[@id='a-autoid-0-announce']")
    public WebElement sortBy;

    @FindBy(xpath = "//*[@id='s-result-sort-select_2']")
    public WebElement highToLow;




}
