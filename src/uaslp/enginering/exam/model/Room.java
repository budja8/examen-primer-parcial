package uaslp.enginering.exam.model;

public class Room {
    private Integer number;
    private String bedType;
    private RoomStatus status;

    public Room(Integer number, String bedType, RoomStatus status) {
        this.number = number;
        this.bedType = bedType;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public String getBedType() {
        return bedType;
    }

    public RoomStatus getStatus() {
        return status;
    }

}
