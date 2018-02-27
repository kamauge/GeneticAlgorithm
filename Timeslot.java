package gacontraints;
public class Timeslot {
    private final int id;
    private final String time;
    public Timeslot(int id, String time){
        this.id=id;
        this.time=time;
    }
    public int getTimeId(){
        return this.id;
    }
    public String getTimeSlot(){
        return this.time;
    }
}
