package uaslp.enginering.exam.model;

public class Reservation {
    private Integer roomNumber;
    private String arrivalDate;
    private Guest guest;
    private Integer nights;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public Integer getNights() {
        return nights;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }
}
