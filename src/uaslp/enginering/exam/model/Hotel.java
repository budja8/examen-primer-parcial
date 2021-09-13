package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();
    private Integer pools;
    private Integer gyms;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Hotel(String name, Integer pools, Integer gyms) {
        this.name = name;
        this.pools = pools;
        this.gyms = gyms;
    }

    public Integer getPools() {
        return pools;
    }

    public Integer getGyms() {
        return gyms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }


    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public void addRoom(Room room) {
        room.getNumber();
        room.getStatus();

        rooms.add(room);
    }
}
