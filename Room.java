package gacontraints;

/**
 * Created by Gerrard on 1/22/2017.
 */
public class Room {
    private String roomNumber;
    private int capacity;

    public Room( String roomNumber, int capacity)
    {
        this.roomNumber=roomNumber;
        this.capacity=capacity;

    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
