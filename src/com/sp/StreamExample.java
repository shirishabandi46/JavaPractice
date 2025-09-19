import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,8,7,6,5,4,3,2,1);
//        Stream<Integer> s1 = list.stream(); //stream method returns object of Stream
//        //s1.forEach(n -> System.out.println(n)); // prints all numbers
//        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
//        //s2.forEach(n -> System.out.println(n)); //prints even numbers
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        //s3.forEach(n -> System.out.println(n)); // prints stream of multiplied values
//        int result = s3.reduce(0,(c,e) -> (c+e));
//        System.out.println(result); //output 40
            //below we can simplify the above steps

//        System.out.println("how filter works "); //filter needs a Predicate obj(funtional interface) which has boolean test(T t);
//        Predicate<Integer> p = new Predicate<Integer>() {  //we can pass this p in below filter()
//            public boolean test(Integer n) {               // we can use lambda expression as well
//                return n%2 == 0;
//            }
//        };//filter(p)

//        System.out.println("how map works");
//        Function<Integer, Integer> fun = new Function<Integer, Integer>() {  //we can use this fun in below map
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        }; //map(fun)

//        System.out.println("How reduce works with BiFunction Interface");
//        BiFunction<Integer, Integer, Integer> bi = new BiFunction<Integer, Integer, Integer>() {
//            public Integer apply(Integer c, Integer e) {
//                return c+e;
//            }
//        }; //I should use reduce(0,bi::apply); if I work with BiFunction, we have one more way to use apply()

//        BinaryOperator<Integer> bi = new BinaryOperator<Integer>() { //BinaryOperator extends BiFunction
//            public Integer apply(Integer c, Integer e) {
//                return c+e;
//            }
//        }; // reduce(0,bi);



        int result = list.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .reduce(0,(c,e) -> (c+e));
        System.out.println(result); //output 40

        Stream<Integer> sortedValues = list.stream()
                .filter(n -> n%2 ==0)
                .sorted();
        sortedValues.forEach(n -> System.out.println(n));

        //parallelStream() if we want to filter it with multiple threads for fast response
        // note : we shouldn't use sorted(); with parallelStream()
        Stream<Integer> sortedValues1 = list.parallelStream()
                .filter(n -> n%2 ==0);
        sortedValues1.forEach(n -> System.out.println(n));

    }
}
