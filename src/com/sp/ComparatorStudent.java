import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studnt{
    int age;
    String name;

    public Studnt(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studnt{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparatorStudent {
    public static void main(String[] args) {
        List<Studnt> st = new ArrayList<Studnt>();
        st.add(new Studnt(21, "Pashi"));
        st.add(new Studnt(18, "Siri"));
        st.add(new Studnt(30, "SHireesha"));

        System.out.println(st);

        //using lambda expression as this is functional interface (shortcut/simple farm)
        Comparator<Studnt> comp = (Studnt o1, Studnt o2) -> o1.age > o2.age?1:-1;

//        Comparator<Studnt> comp = new Comparator<Studnt>() {
//            @Override
//            public int compare(Studnt o1, Studnt o2) {
//                if(o1.age > o2.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        Collections.sort(st,comp);
        System.out.println(st);
        for(Studnt s : st){
            System.out.println(s);
        }

    }
}
