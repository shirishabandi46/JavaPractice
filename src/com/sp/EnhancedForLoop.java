public class EnhancedForLoop {

    int num[] = new int[4];

    public void m1(){
        num[0] = 2;
        num[1] = 5;
        num[2] = 7;
        num[3] = 9;

        for(int n : num){
            System.out.println(n);
        }

    }
    public static void main(String[] args){

        EnhancedForLoop obj = new EnhancedForLoop();
        obj.m1();

    }
}
