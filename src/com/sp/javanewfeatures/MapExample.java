import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students1 = new Hashtable<>(); // HashTable is synchronized
        students.put("Pashi", 24);
        students.put("Shireesha", 25);
        students.put("Abhi", 16);
        students.put("Pavani", 20);
        //students.put("Pavani", 30); //key can not be repeated
        students1.put("Pashi", 24);
        students1.put("Shireesha", 25);
        students1.put("Abhi", 16);
        students1.put("Pavani", 20);

        System.out.println(students);
        System.out.println(students1);
        System.out.println(students.values());
        System.out.println(students.get("Pashi"));
        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }
    }
}
