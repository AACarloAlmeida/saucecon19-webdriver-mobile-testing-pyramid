package it.ding.webdriver.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BookingComPage extends BasePage {

    private static final String BOOKING_COM = "http://www.booking.com";
    private static final By BOOKING_APP_ICON = By.cssSelector(".app-icon");

    public BookingComPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void visit() {
        visit(BOOKING_COM);
    }

    public boolean isBookingAppDisplayed() {
        scrollIntoView(BOOKING_APP_ICON);
        return isDisplayed(BOOKING_APP_ICON);
    }

}