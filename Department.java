package gacontraints;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Courses>courses;
    public Department(String name, ArrayList<Courses> courses){
        this.name=name;
        this.courses=courses;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Courses> getCourses()
    {
        return courses;
    }
}
