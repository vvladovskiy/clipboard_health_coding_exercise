package clipboard_health_coding_exercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenu;

    // Action hover (vTrack project)

    @FindBy(xpath = "//div[.='TV, Appliances, Electronics']/..")
    public WebElement tvAppliancesElectronicsLink;


    @FindBy(xpath = "//a[.='Televisions']")
    public WebElement televisionsLink;



// Switch window

//    @FindBy(xpath = "//*[@id='feature-bullets']/h1")
//    public WebElement aboutThisItem;
//

}
