import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shireesha","Pashi","Abhi","Pavani");
        Optional<String> name = names.stream()
                .filter(str -> str.contains("P"))
                .findFirst();
        System.out.println(name.orElse("Not found"));

       String name1 = names.stream()
                .filter(str -> str.contains("S"))
                .findFirst()
                .orElse("Not found");
        System.out.println(name1);

    }
}
