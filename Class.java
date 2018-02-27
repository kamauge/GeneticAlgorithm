package gacontraints;

/**
 * Created by Gerrard on 1/22/2017.
 */
public class Class {
    private int id;
    private Department department;
    private Courses course;
    private Lecturers lecturers;
    private Timeslot timeslot;
    private Room room;

    public Class(int id, Department department, Courses course)
    {
        this.id=id;
        this.department=department;
        this.course=course;

    }
public void setLecturers(Lecturers lecturers){
        this.lecturers=lecturers;
}
public void setTimeslot(Timeslot timeslot)
{
    this.timeslot=timeslot;
}
public void setRoom(Room room)
{
    this.room=room;
}
public int getId() {return id;}

    public Department getDepartment() {
        return department;
    }

    public Courses getCourse() {
        return course;
    }

    public Lecturers getLecturers() {
        return lecturers;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public Room getRoom() {
        return room;
    }
    public String toString()
    {
        return "["+department.getName()+","+course.getMaxStudents()+","+room.getRoomNumber()+","+lecturers.getLecturerId()+","+timeslot.getTimeId()+"]";
    }

}

