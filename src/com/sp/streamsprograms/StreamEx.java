import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(1000);
        int size = 1000;
        Random ran = new Random();

        for(int i =0;i<=size; i++){
            nums.add(ran.nextInt(100));
            //System.out.println(nums);
        }

        int sum1 = nums.stream()
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);
        System.out.println(sum1);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(n -> n*2)
                .mapToInt(n -> n)
                .sum();
        long endSeq = System.currentTimeMillis();
        System.out.println(sum2);

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(n -> n*2)
                .mapToInt(n -> n)
                .sum();
        long endPara = System.currentTimeMillis();
        System.out.println(sum3);

        System.out.println("seq: " + (endSeq - startSeq));
        System.out.println("para: " + (endPara - startPara));
    }
}
