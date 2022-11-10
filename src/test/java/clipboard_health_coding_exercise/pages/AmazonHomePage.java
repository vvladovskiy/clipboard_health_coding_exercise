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

    // Action hover (vTrack project)

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[16]/a")
    public WebElement tvAppElec;

    // Action hover (vTrack project)

    @FindBy(xpath = "//*[@id='hmenu-content']/ul[9]/li[3]/a")
    public WebElement televisions;

    // Action hover (vTrack project)

    @FindBy(xpath = "//*[@id='s-refinements']/div[21]/ul/li[1]/span/a/div/label/i")
    public WebElement checkBoxSamsung;

    // Action hover (vTrack project)

    @FindBy(xpath = "//*[@id='a-autoid-0-announce']")
    public WebElement sortBy;

    // Action hover (vTrack project)

    @FindBy(xpath = "//*[@id='s-result-sort-select_2']")
    public WebElement highToLow;

@FindBy(xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[1]/span/a/div")
    public WebElement secondHighPrice;

// Switch window

    @FindBy(xpath = "//*[@id='feature-bullets']/h1")
    public WebElement aboutThisItem;


}
