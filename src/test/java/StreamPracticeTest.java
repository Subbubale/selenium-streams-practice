import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StreamPracticeTest extends BaseTest {

    @Test
    public void practiceStreams() {

        launchBrowser();

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));

        //Sample First Filter
        
//        List<String> filteredProducts = products.stream()
//                .map(WebElement::getText)
//                .filter(name -> name.contains("Bolt"))
//                .collect(Collectors.toList());

//        filteredProducts.forEach(System.out::println);
        
        //Understanding Map which Basically Transforms Data in this case Webelement -> String
        
//        products.stream()
//        		.map(WebElement::getText)
//        		.forEach(System.out::println);
        
        // Now We got multiple data now we should Filter out only few data out of all data So:
        
//        products.stream()
//        .map(WebElement::getText)
//        .filter(name -> name.length()>10)
//        .forEach(System.out::println);
        
        //Practice how to Count
//        long count = products.stream()
//        		.filter(WebElement::isDisplayed)
//        		.count();
//        System.out.println(count);
        
        //Filtering out first element
//        products.stream()
//        .filter(e -> e.getText().contains("Bike"))
//        .findFirst()
//        .ifPresent(e -> System.out.println(e.getText()));
        
        //Sorting
//        products.stream()
//        .map(WebElement::getText)
//        .sorted()
//        .forEach(System.out::println);
        
        products.stream()
      .map(WebElement::getText)
      .min(Comparator.comparing(String::length))
      .ifPresent(System.out::println);
        
        		

//        closeBrowser();
    }
}
