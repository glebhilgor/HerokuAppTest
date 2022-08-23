import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hovers() {

        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement jpg = driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
        action.moveToElement(jpg).moveToElement(driver.findElement(By.xpath("//a[text() = 'View profile']"))).click().build().perform();

    }
}
