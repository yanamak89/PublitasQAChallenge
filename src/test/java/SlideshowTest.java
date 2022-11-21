import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TestPage;

public class SlideshowTest extends BaseTest {
    private TestPage testPage;
    private int slideNumber = Integer.valueOf(config.getProperty("slideNumber"));

    @BeforeTest
    public void setupTestPage() {
        testPage = new TestPage(driver);
    }

    @Test
    public void forwardArrowShouldBeEnabled() {
        testPage.clickForwardArrowTimes(slideNumber);

        Assert.assertFalse(testPage.isButtonDisabled());
    }

}
