package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingPage extends BaseClass {
    public AdactinBookingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "location")
    private WebElement location;

    @FindBy(id = "hotels")
    private WebElement hotel;

    @FindBy(id = "room_type")
    private WebElement roomType;

    @FindBy(id = "room_nos")
    private WebElement roomNos;

    @FindBy(name = "datepick_in")
    private WebElement checkInDate;

    @FindBy(name = "datepick_out")
    private WebElement checkOutDate;

    @FindBy(id = "checkout_span")
    private WebElement checkOutError;

    @FindBy(id = "Submit")
    private WebElement btnSearch;

    public WebElement getLocation(){
        return this.location;
    }

    public WebElement getHotel(){
        return this.hotel;
    }

    public WebElement getRoomType(){
        return this.roomType;
    }

    public WebElement getRoomNos(){
        return this.roomNos;
    }

    public WebElement getCheckInDate(){
        return this.checkInDate;
    }

    public WebElement getCheckOutDate(){
        return this.checkOutDate;
    }

    public  WebElement getCheckOutError(){
        return this.checkOutError;
    }

    public WebElement getBtnSearch(){
        return  this.btnSearch;
    }
}
