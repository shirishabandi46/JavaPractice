import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(4);
        nums.add(2);
        nums.add(9);
        nums.add(6); //it won't allow duplicates
        for (int n : nums){
            System.out.println(n);
        }

        // to get the not duplicate sorted values
        System.out.println("tree set");
        Collection<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(61);
        nums1.add(44);
        nums1.add(22);
        nums1.add(90);

//        for (int n : nums1){
//            System.out.println(n);
//        }
        Iterator<Integer> values = nums1.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
