import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(9); //It'll take duplicates

        System.out.println(nums.indexOf(8)); //2
        System.out.println(nums.get(3)); //9
        System.out.println(nums);
        //to print one by one element
        for(Object n : nums){
            int num = (Integer)n;
            System.out.println(num*2);

        }
        for(Object n : nums){
            System.out.println(n);
        }

    }
}
