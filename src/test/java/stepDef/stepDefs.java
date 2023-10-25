package stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class stepDefs {
    WebDriver driver;
    @Given("I Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver",dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website saucedemo")
    public void openWebsiteSaucedemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
    }

    @And("Located on saucedemo website")
    public void locatedOnSaucedemoWebsite() {
        driver.findElement(By.name("login-button")).isDisplayed();
    }

    @And("I Input valid email")
    public void iInputValidEmail() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    @And("I Input Valid password")
    public void iInputValidPassword() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        driver.findElement(By.name("login-button")).click();
    }

    @Then("redirect page to home page")
    public void redirectPageToHomePage() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
    }

    @And("I Input invalid password")
    public void iInputInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("invalid_password");
    }

    @Then("i should see see an error message {string}")
    public void iShouldSeeSeeAnErrorMessage(String errorMessage) {
        WebElement errorElement = driver.findElement(By.cssSelector(".error-message-container.error"));
        assert(errorElement.getText().contains(errorMessage));
        driver.close();

    }

    @Given("user in home page")
    public void userInHomePage() {
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
    }

    @And("user click add to cart item")
    public void userClickAddToCartItem() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @When("all item added to cart")
    public void allItemAddedToCart() {
        driver.findElement(By.name("remove-sauce-labs-backpack")).isDisplayed();
    }

    @Then("cart item increase")
    public void cartItemIncrease() {
        driver.findElement(By.cssSelector(".shopping_cart_badge")).isDisplayed();
        int a = Integer.parseInt(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText());
        boolean b = a >= 0;
    }

    @Given("success login and go to homepage")
    public void successLoginAndGoToHomepage() {
        login.initLogin();
    }

    @Then("click cart and go to cart page")
    public void clickCartAndGoToCartPage() {
    }

    @And("redirect page to home page2")
    public void redirectPageToHomePage2() {
        login.driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed();
    }

    @And("user done adding item to cart")
    public void userDoneAddingItemToCart() {
            login.driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
            login.driver.findElement(By.name("remove-sauce-labs-backpack")).isDisplayed();
            login.driver.findElement(By.cssSelector(".shopping_cart_badge")).isDisplayed();
            int a = Integer.parseInt(login.driver.findElement(By.cssSelector(".shopping_cart_badge")).getText());
            boolean b = a >= 0;
    }

    @When("user click cart and go to cart page")
    public void userClickCartAndGoToCartPage() {
        login.driver.findElement(By.id("shopping_cart_container")).click();
        login.driver.findElement(By.linkText("Sauce Labs Backpack")).isDisplayed();
    }

    @Then("user can see displayed selected item")
    public void userCanSeeDisplayedSelectedItem() {
        login.driver.findElement(By.id("item_4_title_link")).isDisplayed();
    }

    @And("user click checkout and directed to your-information-page")
    public void userClickCheckoutAndDirectedToYourInformationPage() {
        login.driver.findElement(By.id("checkout")).click();
    }

    @And("user fill first name")
    public void userFillFirstName() {
        login.driver.findElement(By.id("first-name")).sendKeys("Aditya");
    }

    @And("user fill last name")
    public void userFillLastName() {
        login.driver.findElement(By.id("last-name")).sendKeys("Naufal");
    }

    @And("user fill postal code")
    public void userFillPostalCode() {
        login.driver.findElement(By.id("postal-code")).sendKeys("1997nf");
    }

    @When("user click continue")
    public void userClickContinueAndDirectedToOverviewPage() {
        login.driver.findElement(By.id("continue")).click();
    }

    @Then("directed to overview-page and user can see all item and information")
    public void userCanSeeAllItemAndInformation() {
        login.driver.findElement(By.id("item_4_title_link")).isDisplayed();
    }

    @When("user click continue and directed to finished-page")
    public void userClickContinueAndDirectedToFinishedPage() {
        login.driver.findElement(By.id("finish")).click();
    }

    @Then("user located in finished-page")
    public void userLocatedInFinishedPage() {
        login.driver.findElement(By.id("back-to-products")).isDisplayed();
    }

    @Then("user should see error message {string}")
    public void userShouldSeeErrorMessage(String errorMessage) {
        WebElement errorElement = login.driver.findElement(By.cssSelector(".error-message-container.error"));
        assert(errorElement.getText().contains(errorMessage));
        login.driver.close();
    }
}
