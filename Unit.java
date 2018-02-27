package gacontraints;

import java.util.ArrayList;
public class Unit {
    private final String unitCode;
    private final String unitName;
    private final int maxStudents;
    private ArrayList<Lecturers> lecturers;

    public Unit(String unitCode, String unitName, int maxStudents, ArrayList<Lecturers> lecturers){
        this.unitCode=unitCode;
        this.unitName=unitName;
        this.maxStudents=maxStudents;
        this.lecturers=lecturers;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public ArrayList<Lecturers> getLecturers() {
        return lecturers;
    }
    public String toString()
    {
        return unitName;

    }
}
