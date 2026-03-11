import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student3{

    private int id;
    private String name;

    public Student3() {
    }

    public Student3(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ConstructorReferenceEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pashi","Shireesha","Pavani","Abhi");
        List<Student3> students = new ArrayList<>();


        for(String name : names){
            students.add(new Student3(name));
        }
        System.out.println(students);

        //using stream to convert a list of students to list of objects
        List<Student3> list = names.stream()
                .map(name -> new Student3(name))
                .toList();
        list.forEach(System.out::println);

        //constructor reference
        System.out.println("constructor ref");
        List<Student3> list1 = names.stream()
                .map(Student3::new)   //constructor reference
                .toList();
        list1.forEach(System.out::println);

    }
}
