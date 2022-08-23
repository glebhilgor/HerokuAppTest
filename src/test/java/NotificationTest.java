import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class NotificationTest extends BaseTest {

    @Test
    public void notificationTest() {

        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a [text() = 'Click here']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean result = driver.findElement(By.xpath("//div[@class='flash notice']")).isDisplayed();
        assertTrue(result, "Message is not displayed");

    }
}
