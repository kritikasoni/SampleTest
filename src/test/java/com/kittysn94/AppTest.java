package com.kittysn94;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        //chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\IdeaProjects\\SampleTest\\chromedriver.exe");//set path of driver//ใช้ chrome driver เพื่อสั่งการ chrome browser
        WebDriver driver = new ChromeDriver(); //สร้าง driver จาก path ด้านบน
        driver.manage().window().maximize();//ขยายหน้าจอ
        driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);//set timeout to wait for 30 sec, if nothing happens, then show error
        String baseUrl = "http://www.seleniumhq.org";//the url which we will navigate  to
        driver.get(baseUrl);//สั่งให้ไปหน้านี้นะ
        assertEquals("Selenium - Web Browser Automation", driver.getTitle()); //assert quals is to test that the expected=actual value
        driver.quit();//ปิด browser
    }
}
