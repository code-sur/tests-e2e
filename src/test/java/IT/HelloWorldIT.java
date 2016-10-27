package IT;


import org.junit.After;
import org.junit.Test;

public class HelloWorldIT {

    private WebClient webClient = new WebClient();

    @Test public void welcome() {
        webClient.goToBegin();
        webClient.showsText("Hello World!");
    }

    @After
    public void stop() {
        webClient.quit();
    }
}
