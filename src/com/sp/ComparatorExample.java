import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> com  = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(33);
        nums.add(75);
        nums.add(81);
        nums.add(109);
        Collections.sort(nums);
        System.out.println(nums); //based on value
        Collections.sort(nums, com);
        System.out.println(nums); //based on last digit

    }
}
