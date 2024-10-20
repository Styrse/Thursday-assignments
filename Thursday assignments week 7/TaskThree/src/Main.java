import java.util.ArrayList;
import java.util.Arrays;

//3. f
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();

        Student student1 = new Student("Styrbjørn", new ArrayList<String>(Arrays.asList("Java", "Python"))) {
        };
        Student student2 = new Student("Alex", new ArrayList<String>(Arrays.asList("Java 1.0"))) {
        };

        Teacher teacher1 = new Teacher("Tess", new ArrayList<String>(Arrays.asList("Java", "Python", "C++", "Business intelligence"))) {
        };
        Teacher teacher2 = new Teacher("Jesper", new ArrayList<String>(Arrays.asList("Java 1.0"))) {
        };

        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        System.out.println(student1.addCourse("Java"));
        System.out.println(student1.addCourse("Business intelligence"));

        System.out.println(teacher1.addCourse("C++"));
        System.out.println(teacher1.addCourse("Cyber security"));

        //3. g
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).addCourse("Java 1.0") == false) {
                if (persons.get(i) instanceof Student) {
                    System.out.println(persons.get(i).getName() + " has already passed the course.");
                } else {
                    System.out.println(persons.get(i).getName() + " cannot teach this course.");
                }
            }
        }
    }
}