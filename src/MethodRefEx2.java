@FunctionalInterface
interface Calculator{
    void add(int x, int y);
}
public class MethodRefEx2 {

    public static void sum(int p, int q){
        System.out.println(p+q);
    }

    public static void main(String[] args) {
        //for instance method using lamda expression
        Calculator cal = (a,b) -> System.out.println(a+b);
        cal.add(5,6);

        Calculator cal2 =  MethodRefEx2::sum;
        cal2.add(3,4);



    }
}
