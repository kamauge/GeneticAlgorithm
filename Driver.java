package gadriver;
import java.util.ArrayList;
import gacontraints.Class;
public class Driver {
    public static final int POPULATION_SIZE=9;
    public static final double MUTATION_RATE =0.1;
    public static final double CROSSOVER_RATE =0.9;
    public static final int TOURNAMENT_SELECTION_SIZE =3;
    public static final int NUMB_OF_ELITE_SCHEDULES=1;
    private int scheduleNumb =0;
    private int classNumb=1;
    private Data data;
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.data = new Data();
        int generationNumber = 0;
        driver.printAvailableData();
        System.out.println("> Generation #" + generationNumber);
        System.out.print("  Schedule # |");
        System.out.print("Classes [dept,class,room,lecturer,time slot]      ");
        System.out.println("                                    | Fitness | Conflicts");
        System.out.print(".....................................................................");
        System.out.println("................................................................................");
        GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(driver.data);
        Population population = new Population(Driver.POPULATION_SIZE, driver.data).sortByFitness();
        population.getSchedules().forEach(schedule -> System.out.println("      " + driver.scheduleNumb++ +
                                                                         "      | " + schedule + " | " +
                                                                        String.format("%.5f", schedule.getFitness()) +
                                                                          " | " + schedule.getNumberOfConflicts()));
        driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);
        driver.classNumb=1;
        while (population.getSchedules().get(0).getFitness() != 1.0) {
            System.out.println("> Generation # "+ ++generationNumber);
            System.out.print(" Schedule # |"                                      );
            System.out.print("Classes [department,class,room,lecturer,time-slot]        ");
            System.out.println("                                        |   Fitness | Conflicts");
            System.out.print(".........................................................................");
            System.out.println("................................................................................");
            population = geneticAlgorithm.evolve(population).sortByFitness();
            driver.scheduleNumb = 0;
            population.getSchedules().forEach(schedule -> System.out.println("      " + driver.scheduleNumb++ +
                    "       |" + schedule + " | " +
                    String.format("%.5f", schedule.getFitness()) +
                    "   | " + schedule.getNumberOfConflicts()));
            driver.printScheduleAsTable(population.getSchedules().get(0), generationNumber);
            driver.classNumb = 1;
        }


    }
    private void printScheduleAsTable(Schedule schedule, int generation){
        ArrayList<Class> classes= schedule.getClasses();
        System.out.print("\n        ");
        System.out.println("Class number | Department | Course(number, max number of students) Room(capacity) | Lecturer(Id) | Time slot(Id)");
        System.out.print("                ");
        System.out.print("...........................................................");
        System.out.println("..................................................................................");
        classes.forEach(x->{
            int majorIndex = data.getDepartments().indexOf(x.getDepartment());
            int coursesIndex= data.getCourses().indexOf(x.getCourse());
            int roomsIndex= data.getRooms().indexOf(x.getRoom());
            int lecturersIndex= data.getLecturers().indexOf(x.getLecturers());
            int timeslotsIndex= data.getTimeslots().indexOf(x.getTimeslot());
            System.out.print("                  ");
            System.out.print(String.format(" %1$02d  ",classNumb) + " | ");
            System.out.print(String.format(" %1$4s",data.getDepartments().get(majorIndex).getName())+" | ");
            System.out.print(String.format(" %1$21s",data.getCourses().get(coursesIndex).getCourseName())+" " +
                    "               ("+data.getCourses().get(coursesIndex).getCourseId()+", "+
                    x.getCourse().getMaxStudents()+")       | ");
            System.out.print(String.format(" %1$10s",data.getRooms().get(roomsIndex).getRoomNumber()+" " +
                    " ("+x.getRoom().getCapacity())+")  |" );
            System.out.print(String.format(" %1$15s",data.getLecturers().get(lecturersIndex).getLecturerName()+" " +
                    " ("+data.getLecturers().get(lecturersIndex).getLecturerId())+")  |" );
            System.out.println(data.getTimeslots().get(timeslotsIndex).getTimeSlot()+
                    " ("+data.getTimeslots().get(timeslotsIndex).getTimeId()+")" );

            classNumb++;
        });
        if(schedule.getFitness() ==1) System.out.println("> Solution Found in "+(generation + 1)+" generations");
        System.out.print("..............................................");
        System.out.println("........................................................................");
    }

    private void printAvailableData()
    {
        System.out.println("Available Departments ==>");
        data.getDepartments().forEach(x->System.out.println("name: "+x.getName()+", courses: "+x.getCourses()));
        System.out.println("\nAvailable Courses ==>");
        data.getCourses().forEach(x->System.out.println("Course code: "+x.getCourseId()+", Name: "+x.getCourseName()
                +"\tNumber of Students: "+x.getMaxStudents()+", Lecturers:"+x.getLecturers()));
        System.out.println("\nAvailable Rooms ==>");
        data.getRooms().forEach(x->System.out.println("Room number: "+x.getRoomNumber()+", Max Capacity: "+x.getCapacity()));
        System.out.println("\nAvailable Lecturers ==>");
        data.getLecturers().forEach(x->System.out.println("Lec Id: "+x.getLecturerId()+", Lec Name: "+x.getLecturerName()));
        System.out.println("\nAvailable Timeslots==>");
        data.getTimeslots().forEach(x->System.out.println("id: "+x.getTimeId()+",Time slot: "+x.getTimeSlot()));
        System.out.print(".................................................................");
        System.out.println("..................................................................................");
    }
}

