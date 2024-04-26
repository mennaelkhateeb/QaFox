import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    public WebElement ValidEmail(WebDriver driver){
        WebElement vEmail= driver.findElement(By.id("input-email"));
        return vEmail ;
    }
    public WebElement ValidPassword(WebDriver driver){
        WebElement validPass= driver.findElement(By.id("input-password"));
        return validPass ;
    }
    public WebElement submit(WebDriver driver){
        WebElement Submit= driver.findElement(By.cssSelector("input[value=\"Login\"]"));
        return Submit ;
    }

    public WebElement invalidemail(WebDriver driver){
        WebElement InvalidEmail= driver.findElement(By.xpath("//div[@id=\"account-login\"]/div[1]"));
        return InvalidEmail ;
    }

    public WebElement invalidpasswordd(WebDriver driver){
        WebElement InvalidPassword= driver.findElement(By.xpath("//div[@id=\"account-login\"]/div[1]"));
        return InvalidPassword ;
    }


}
