package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
    private WebDriver webDriver;
    @FindBy(xpath = "//button[2]")
    private WebElement forwardArrow;

    public TestPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public TestPage clickForwardArrowTimes(int slidesNumber) {
        for (int i = 0; i < slidesNumber; i++) {
            forwardArrow.click();

        }
        return this;
    }

    public boolean isButtonDisabled() {
        return forwardArrow.isEnabled();
    }
}
