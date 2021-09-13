package uaslp.enginering.exam.model;

public class Room {
    private Integer number;
    private String bedType;
    private RoomStatus status;

    public Room(int number, String bedType, RoomStatus roomStatus) {
        this.number = number;
        this.bedType = bedType;
        this.status = roomStatus;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
