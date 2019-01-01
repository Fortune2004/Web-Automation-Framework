package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMacy extends CommonAPI {

    @Test

    public void test(){
        driver.findElement(By.id("globalSearchInputField")).sendKeys("Cosmetics");




    }
}
