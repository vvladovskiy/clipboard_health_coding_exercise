package clipboard_health_coding_exercise.step_definitions;

import clipboard_health_coding_exercise.pages.AmazonHomePage;
import clipboard_health_coding_exercise.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class AmazonSearch {

    AmazonHomePage amazonHomePage =new AmazonHomePage();

    @Given("User is on Amazon.in Home page")
    public void user_is_on_amazon_in_home_page() {
        Driver.getDriver().get("https://www.amazon.in");
    }

    @When("Click on the hamburger menu in the top left corner.")
    public void click_on_the_hamburger_menu_in_the_top_left_corner() {
        amazonHomePage.hamburgerMenu.click();
    }
    @When("Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department section.")
    public void scroll_down_and_then_click_on_the_tv_appliances_and_electronics_link_under_shop_by_department_section() {
        amazonHomePage.tvAppElec.click();
    }
    @Then("Click on Televisions under Tv, Audio & Cameras sub section.")
    public void click_on_televisions_under_tv_audio_cameras_sub_section() {
        amazonHomePage.televisions.click();
    }
    @Then("Scroll down and filter the results by Brand ‘Samsung’.")
    public void scroll_down_and_filter_the_results_by_brand_samsung() {
        amazonHomePage.checkBoxSamsung.click();
    }
    @Then("Sort the Samsung results with price High to Low.")
    public void sort_the_samsung_results_with_price_high_to_low() {
        amazonHomePage.sortBy.click();
    }
    @Then("Click on the second highest priced item \\(whatever that maybe at the time of automating).")
    public void click_on_the_second_highest_priced_item_whatever_that_maybe_at_the_time_of_automating() {
        amazonHomePage.highToLow.click();

    }
    @Then("Switch the Window")
    public void switch_the_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Assert that “About this item” section is present and log this section text to console\\/report.")
    public void assert_that_about_this_item_section_is_present_and_log_this_section_text_to_console_report() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




















  //------------------------------------------
    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        amazonHomePage.hamburgerMenu.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {

        Assert.assertEquals("Title verification is failed!","apple - Google Search",Driver.getDriver().getTitle());
    }
    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyword) {

        amazonHomePage.hamburgerMenu.sendKeys(searchKeyword + Keys.ENTER);
    }
    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {

        Assert.assertEquals("Title verification is failed!",expectedTitle,Driver.getDriver().getTitle());
      //TODO: you need to fix this later
    }
}
