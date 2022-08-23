import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String value1 = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(value1, "-1", "Entering from buttons doesn't work");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String value2 = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(value2, "1", "Entering from buttons doesn't work");

    }
}
