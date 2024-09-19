package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import base.BaseClass;
import pom.AdactinLoginPage;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LoginStep extends BaseClass {
    AdactinLoginPage adLogin = new AdactinLoginPage();
    @Given("User launch the Adactin Login Page {string}")
    public void user_launch_the_adactin_login_page(String url) {
        tolaunchUrl(url);
    }
    @When("User enter valid username {string} and password {string}")
    public void user_enter_valid_username_and_password(String username, String password) throws InterruptedException, IOException {
       tofillText(adLogin.getTxtUserName(),username);
       tofillText(adLogin.getTxtPassword(), password);
       screenShot("LoginPage");
    }
    @When("User click the login button")
    public void user_click_the_login_button() {
        toClick(adLogin.getBtnLogin());
    }
    @Then("User should be redirected to SearchHotel Page")
    public void user_should_be_redirected_to_search_hotel_page() throws IOException {
        screenShot("RedirectedPage");
        assertEquals("Success", "https://adactinhotelapp.com/SearchHotel.php", (driver.getCurrentUrl()));
    }
}
