package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.apache.commons.io.FileUtils;

import base.BaseClass;

public class ScreenshotUtils {

    public static void takeScreenshot(String fileName) {

        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("screenshots/" + fileName + ".png");

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved: " + fileName);
        } catch (IOException e) {
            System.out.println("Error taking screenshot");
        }
    }
}