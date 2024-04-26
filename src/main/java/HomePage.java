import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

//    public WebElement NavigateToRegister(WebDriver driver){
//        WebElement navigateToRegister =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
//        return navigateToRegister;
//    }
    WebDriver driver;
    public WebElement search(WebDriver driver){
        WebElement locateSearch= driver.findElement(By.name("search"));
        return locateSearch ;
    }
    public WebElement iconSearch(WebDriver driver){
        WebElement Iconsearch= driver.findElement(By.className("input-group-btn"));
        return Iconsearch ;
    }

    public WebElement addtocard(WebDriver driver){
        WebElement AddToCard= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]"));
        return AddToCard ;
    }

    public WebElement successADD(WebDriver driver){
        WebElement Success= driver.findElement(By.xpath("//div[@id=\"common-home\"]/div[1]"));
        return Success ;
    }
}
