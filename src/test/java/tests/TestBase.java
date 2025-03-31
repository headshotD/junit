package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    @BeforeAll
    static void browserConfiguration() {
        Configuration.baseUrl = "https://auth.niffler.qa.guru";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @AfterEach
    void closeChromeWebDriver() {
        Selenide.closeWebDriver();
    }
}