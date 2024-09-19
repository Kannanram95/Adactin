package step;

import base.BaseClass;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pom.AdactinBookingPage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelSelection extends BaseClass {
    AdactinBookingPage adBooking = new AdactinBookingPage();
    LocalDate today = LocalDate.now();
    @Then("User select the location {string}")
    public void user_select_the_location(String location) {
        select(adBooking.getLocation(),location);
    }
    @Then("User select the hotel {string}")
    public void user_select_the_hotel(String hotel) {
        select(adBooking.getHotel(), hotel);
    }
    @Then("User select the room type {string}")
    public void user_select_the_room_type(String roomType) {
        select(adBooking.getRoomType(),roomType);
    }
    @Then("User select the no of rooms {string}")
    public void user_select_the_no_of_rooms(String roomNos) {
        select(adBooking.getRoomNos(),roomNos);
    }
    @Then("User enter the checkkin date seven days after today")
    public void user_enter_the_checkkin_date_seven_days_after_today() throws InterruptedException {
        adBooking.getCheckInDate().clear();
        LocalDate dateAfterSevenDays = today.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateAfterSevenDays.format(formatter);
        tofillText(adBooking.getCheckInDate(), formattedDate);
    }
    @Then("User enter the checkout date seven days after today")
    public void user_enter_the_checkout_date_seven_days_after_today() throws InterruptedException {
        adBooking.getCheckOutDate().clear();
        LocalDate dateAfterSevenDays = today.plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateAfterSevenDays.format(formatter);
        tofillText(adBooking.getCheckOutDate(), formattedDate);
        toClick(adBooking.getBtnSearch());
    }
    @Then("User should get the error message")
    public void user_should_get_the_error_message() throws IOException {
        screenShot("Hotel_Selection");
        Assert.assertTrue("Error is displayed",adBooking.getCheckOutError().isDisplayed());
    }
}
