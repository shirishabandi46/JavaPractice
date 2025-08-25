public class ExceptionExample {

    public static void main(String[] args) {
        int i = 2;  //0
        int j = 0;
        String str = "Pashi";  //null
        int nums[] = new int[6]; //5

        try{
            j= 18/i;
            System.out.println(str.length());
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("can not divide with zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("trying to access array value out of it's limit" + ae);
        }
        catch (Exception e) {
            System.out.println("Something is wrong" + e);
        }
        System.out.println("Bye");


    }
}
