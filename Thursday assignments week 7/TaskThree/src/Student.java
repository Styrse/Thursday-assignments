import java.util.ArrayList;

//3. b
public abstract class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentcourses;

    //3. c
    public Student(String name, ArrayList<String> passedCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentcourses = new ArrayList<>();
    }

    //3. d
    @Override
    public boolean addCourse(String course){
        if (passedCourses.contains(course)){
            return false;
        } else {
            currentcourses.add(course);
            return true;
        }
    }
}
