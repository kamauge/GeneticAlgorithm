package gacontraints;

import java.util.ArrayList;
public class Courses {
    private  String courseId =null;
    private  String courseName =null;
    private ArrayList<Lecturers> lecturers;
    private final int maxStudents;

    public Courses(String courseId, String courseName, int maxStudents, ArrayList<Lecturers> lecturers) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.lecturers = lecturers;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public ArrayList<Lecturers> getLecturers() {
        return lecturers;
    }

    public String toString() {
        return courseName;
    }
}
