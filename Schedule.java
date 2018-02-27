package gadriver;

import java.util.ArrayList;
import gacontraints.Department;
import gacontraints.Class;

public class Schedule {
    private ArrayList<Class> classes;
    private boolean isFitnessChanged =true;
    private double fitness= -1;
    private int classNumb=0;
    private int numberOfConflicts=0;
    private Data data;
    public Data getData(){return  data;}
    public Schedule(Data data)
    {
        this.data=data;
        classes = new ArrayList<Class>(data.getNumberOfClasses());
    }
    public Schedule initialize()
    {
        new ArrayList<Department>(data.getDepartments()).forEach(department -> {
            department.getCourses().forEach(courses -> {
                Class newClass= new Class(classNumb++, department,courses);
                newClass.setTimeslot(data.getTimeslots().get((int) (data.getTimeslots().size()*Math.random())));
                newClass.setRoom(data.getRooms().get((int) (data.getRooms().size()*Math.random())));
                newClass.setLecturers(courses.getLecturers().get((int)(courses.getLecturers().size()*Math.random())));
            classes.add(newClass);
            });
        });
return this;
    }

public int getNumberOfConflicts() {return numberOfConflicts;}
    public ArrayList<Class> getClasses() {
    isFitnessChanged = true;
    return classes;

}
    public double getFitness() {
        if (isFitnessChanged == true) {
            fitness = calculateFitness();
            isFitnessChanged = false;
        }
        return fitness;
    }
    private double calculateFitness() {
    numberOfConflicts =0;
    classes.forEach(( x) -> {
        if(x.getRoom().getCapacity() < x.getCourse().getMaxStudents()) numberOfConflicts++;
        classes.stream().filter(y-> classes.indexOf(y) >= classes.indexOf(x)).forEach(y ->
        {
            if (x.getTimeslot() == y.getTimeslot() && x.getId() !=y.getId())
            {
                if (x.getRoom() == y.getRoom()) numberOfConflicts++;
                if (x.getLecturers() == y.getLecturers()) numberOfConflicts++;
            }
        });
    });
    return 1/(double)(numberOfConflicts +1);
}
public String toString()
{
    String returnValue = new String();
    for (int x=0; x < classes.size()-1; x++) returnValue += classes.get(x)+",";
    returnValue += classes.get(classes.size()-1);
    return returnValue;
}
}
