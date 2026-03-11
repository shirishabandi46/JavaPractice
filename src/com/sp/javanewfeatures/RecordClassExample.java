import java.util.Objects;

//class RecordClass{
//    private final int id;
//    private final String name;
//    public RecordClass(int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "RecordClass{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        RecordClass that = (RecordClass) o;
//        return id == that.id && Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}
// the above code is to store two values and use them
// above we need to override toString,hashCode and equals method and constructor to initialize
// we can do above everything in one line using recorded classes

record RecordClass (int id, String name){}

public class RecordClassExample {
    public static void main(String[] args) {
        RecordClass r1 = new RecordClass(1, "Shireesha");
        RecordClass r2 = new RecordClass(1, "Shireesha");
        System.out.println(r1.equals(r2));
        System.out.println(r1);

    }
}
