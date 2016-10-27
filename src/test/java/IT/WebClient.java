package IT;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class WebClient {

    private final WebDriver driver;

    WebClient() {
        driver = new FirefoxDriver();
    }

    void goToBegin() {
        driver.navigate().to("http://localhost:8080/tests-e2e");
    }

    void showsText(String text) {
        assert driver.getPageSource().contains(text);
    }

    void quit() {
        driver.quit();
    }
}
