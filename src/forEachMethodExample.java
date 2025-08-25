import java.util.Arrays;
import java.util.List;

public class forEachMethodExample {
    public static void main(String[] args) {
        //List<Integer> nums = new ArrayList<>();  //one way
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.forEach(n -> System.out.println(n));
        //Anonymous inner class
//        Consumer<Integer> con = new Consumer<Integer>(){
//            public void accept(Integer n){
//                System.out.println(n);
//
//            }
//        };
        //lamba expression
//        Consumer<Integer> con = (Integer n) -> System.out.println(n);
//        Consumer<Integer> con = n -> System.out.println(n);
//        nums.forEach(con);

//        System.out.println("normal for loop");
//        for(int i=0;i<nums.size();i++){
//            System.out.println(nums.get(i));
//        }
//
//        System.out.println("enhanced for loop");
//        for(int n : nums){
//            System.out.println(n);
//        }
//
//        System.out.println("for each and lambda expression");
//        nums.forEach(n -> System.out.println(n));
//
//        System.out.println("using method reference");
//        nums.forEach(System.out::println);
//        int sum = 0;
//        for(int n: nums){
//            if(n%2 == 0){
//                n = n*2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
    }
}
