import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //Comparable interface has compareTo method
    @Override
    public int compareTo(Student1 that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student1> studs = new ArrayList<Student1>();
        studs.add(new Student1(21, "Shireesha"));
        studs.add(new Student1(28, "Pashi"));
        studs.add(new Student1(18, "Abhi"));
        studs.add(new Student1(17, "Pavani"));

        System.out.println(studs);

//        Comparator<Student1> com = new Comparator<Student1>() {
//            @Override
//            public int compare(Student1 o1, Student1 o2) {
//                if(o1.age > o2.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        Collections.sort(studs); //we can directly sort studs if we write compareTo()
        //Collections.sort(studs,com); //using compare method
        for (Student1 s : studs){
            System.out.println(s);
        }


    }
}
