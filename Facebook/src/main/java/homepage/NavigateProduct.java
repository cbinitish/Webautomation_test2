package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class NavigateProduct extends CommonAPI {
    public void productinfo(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']"," plastic bottle");
        clickOnElementByXpath("//input[@type='submit']");
        sleepFor(2);
        clickOnElementByXpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS " +
                "widgetId=search-results index=1']//img[@class='s-image']");
        System.out.println(driver.findElement(By.xpath("//div[@id='feature-bullets']")).getText());
    }
}
