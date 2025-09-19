import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prashanth","Shireesha","Pavani","Abhi");
        List<String> uNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(uNames);
        List<String> uNames1 = names.stream()
                .map(String::toUpperCase)    //method reference
                .toList();
        uNames1.forEach(System.out::println);  //method reference

    }
}
