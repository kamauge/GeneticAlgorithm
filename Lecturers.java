package gacontraints;

/**
 * Created by Gerrard on 1/22/2017.
 */
public class Lecturers {
    private final String lecturerId;
    private final String lecturerName;
    public Lecturers(String lecturerId,String lecturerName){
        this.lecturerId=lecturerId;
        this.lecturerName=lecturerName;
    }
    public String getLecturerId(){return this.lecturerId;}
    public String getLecturerName(){
        return this.lecturerName;
    }
    public String toString(){return lecturerName;}
}
