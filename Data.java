package gadriver;

import java.util.ArrayList;
import java.util.Arrays;

import gacontraints.*;

public class Data {
    private ArrayList<Room> rooms;
    private ArrayList<Timeslot> timeslots;
    private ArrayList<Lecturers> lecturers;
    private ArrayList<Courses> courses;
    private ArrayList<Department> departments;
    private ArrayList<Unit> units;
    private int NumberOfClasses = 0;
    private int numberOfConflicts=0;
    public Data(){
        initialize();}

    private Data initialize(){

        Room room1= new Room("A02",100);
        Room room2= new Room("B02",100);
        Room room3= new Room("C02",100);
        Room room4= new Room("D02",100);
        Room room5= new Room("C06",100);
        Room room6= new Room("C07",100);
        Room room7= new Room("C08",100);
        Room room8= new Room("D06",100);

        rooms=new ArrayList<Room>(Arrays.asList(room1,room2,room3,room4,room5,room6,room7,room8));

        Timeslot timeslot1 =new Timeslot(1,"MONDAY 0700-1000");
        Timeslot timeslot2 =new Timeslot(2,"MONDAY 1000-1300");
        Timeslot timeslot3 =new Timeslot(3,"MONDAY 1300-1600");
        Timeslot timeslot4 =new Timeslot(4,"MONDAY 1600-1900");
        Timeslot timeslot5 =new Timeslot(5,"TUESDAY 0700-1000");
        Timeslot timeslot6 =new Timeslot(6,"TUESDAY 1000-1300");
        Timeslot timeslot7 =new Timeslot(7,"TUESDAY 1300-1600");
        Timeslot timeslot8 =new Timeslot(8,"TUESDAY 1600-1900");
        Timeslot timeslot9 =new Timeslot(9,"WEDNESDAY 0700-1000");
        Timeslot timeslot10 =new Timeslot(10,"WEDNESDAY 1000-1300");
        Timeslot timeslot11 =new Timeslot(11,"WEDNESDAY 1300-1600");
        Timeslot timeslot12 =new Timeslot(12,"WEDNESDAY 1600-1900");
        Timeslot timeslot13 =new Timeslot(13,"THURSDAY 0700-1000");
        Timeslot timeslot14=new Timeslot(14,"THURSDAY 1000-1300");
        Timeslot timeslot15=new Timeslot(15,"THURSDAY 1300-1600");
        Timeslot timeslot16=new Timeslot(16,"THURSDAY 1600-1900");
        Timeslot timeslot17 =new Timeslot(17,"FRIDAY 0700-1000");
        Timeslot timeslot18 =new Timeslot(18,"FRIDAY 1000-1300");
        Timeslot timeslot19 =new Timeslot(19,"FRIDAY 1300-1600");
        Timeslot timeslot20 =new Timeslot(20,"FRIDAY 1600-1900");
        timeslots=new ArrayList<Timeslot>(Arrays.asList(timeslot1,timeslot2,timeslot3,timeslot4,timeslot5,timeslot6,timeslot7,timeslot8,
                timeslot9,timeslot10,timeslot11,timeslot12,timeslot13,timeslot14,timeslot14,timeslot15,timeslot16,timeslot17,timeslot18,
                timeslot19,timeslot20));

        Lecturers lecturer1 = new Lecturers("L1","Dr Bruce Wayne");
        Lecturers lecturer2 = new Lecturers("L2","Mr Clark Kent");
        Lecturers lecturer3 = new Lecturers("L3","Mr Oliver Queen");
        Lecturers lecturer4 = new Lecturers("L4","Dr Barry Allen");
        Lecturers lecturer5 = new Lecturers("L5","Dr Leo Snart");
        Lecturers lecturer6 = new Lecturers("L6","Mr Mike Lorrie");
        Lecturers lecturer7 = new Lecturers("L7","Ms Thea Queen");
        Lecturers lecturer8 = new Lecturers("L8","Ms Iris West");
        lecturers=new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer2,lecturer3,lecturer4,lecturer5,lecturer6,lecturer7,lecturer8));

        Courses course1 = new Courses("CRSE1","BCOM", 80,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Courses course2 = new Courses("CRSE2","BBIT", 70, new ArrayList<Lecturers>(Arrays.asList(lecturer2,lecturer4)));
        Courses course3 = new Courses("CRSE3","COMPUTER SCIENCE", 60,new ArrayList<Lecturers>(Arrays.asList(lecturer5,lecturer7)));
        Courses course4 = new Courses("CRSE4","I.T.",75,new ArrayList<Lecturers>(Arrays.asList(lecturer6,lecturer8)));
        Courses course5 = new Courses("CRSE5","Acturial Science.",75,new ArrayList<Lecturers>(Arrays.asList(lecturer6,lecturer8)));
        Courses course6 = new Courses("CRSE6","EEE",75,new ArrayList<Lecturers>(Arrays.asList(lecturer6,lecturer8)));
        Courses course7 = new Courses("CRSE7","Computer Engineering",75,new ArrayList<Lecturers>(Arrays.asList(lecturer6,lecturer8)));
        Courses course8 = new Courses("CRSE8","Software Engineering",75,new ArrayList<Lecturers>(Arrays.asList(lecturer6,lecturer8)));
        courses=new ArrayList<Courses>(Arrays.asList(course1,course2,course3,course4,course5,course6,course7,course8));

        Unit unit1 = new Unit("AI01","Artificial Intelligence", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit2 = new Unit("DL01","Digital Logic", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit3 = new Unit("BL01","Business Law", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit4 = new Unit("CL02","Calculus 2", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit5 = new Unit("ML01","Machine Learning", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit6 = new Unit("SP01","System Programming", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit7 = new Unit("AC01","Accounting", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        Unit unit8 = new Unit("0R01","Operations Research", 200,new ArrayList<Lecturers>(Arrays.asList(lecturer1,lecturer3)));
        units = new ArrayList<Unit>(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6, unit7, unit8));


        Department department1= new Department("Business",new ArrayList<Courses>(Arrays.asList(course1,course2,course5)));
        Department department2= new Department("CIT",new ArrayList<Courses>(Arrays.asList(course3,course4,course6,course7,course8)));
        departments=new ArrayList<Department>(Arrays.asList(department1,department2));
        departments.forEach(x-> NumberOfClasses +=x.getCourses().size());
        return this;

    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }
    public ArrayList<Lecturers> getLecturers() {
        return lecturers;
    }
    public ArrayList<Courses> getCourses()
    {
        return courses;
    }
    public ArrayList<Department> getDepartments()
    {
        return departments;
    }
    public int getNumberOfClasses()
    {
        return this.NumberOfClasses;
    }
}
