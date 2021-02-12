package com.demoqa.utilities;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {


    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void dragAndDrop(WebElement element1,WebElement element2) {
        Actions actions = new Actions(Driver.get());
        actions.dragAndDrop(element1,element2).perform();
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }


}