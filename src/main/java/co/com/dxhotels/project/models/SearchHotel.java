package co.com.dxhotels.project.models;

public class SearchHotel {
    private String location;
    private String checkIn;
    private String checkOut;
    private String roomsNumber;
    private String adultsNumber;
    private String childrenNumber;

    public SearchHotel(String location, String checkIn, String checkOut, String roomsNumber,
                       String adultsNumber, String childrenNumber) {
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomsNumber = roomsNumber;
        this.adultsNumber = adultsNumber;
        this.childrenNumber = childrenNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(String roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public String getAdultsNumber() {
        return adultsNumber;
    }

    public void setAdultsNumber(String adultsNumber) {
        this.adultsNumber = adultsNumber;
    }

    public String getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(String childrenNumber) {
        this.childrenNumber = childrenNumber;
    }
}
