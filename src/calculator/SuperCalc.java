package calculator;

public class SuperCalc extends AdvCalc {
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }

    public static void main(String[] args) {
        SuperCalc sc = new SuperCalc();
        double r1 = sc.power(5,4);
        int r2 = sc.add(2,3);
        int r3 = sc.sub(7,2);
        int r4 = sc.mul(2,3);
        int r5 = sc.div(15,3);

        System.out.println(r1 + " " +r2 + " " +r3 + " " +r4 + " " +r5);

    }
}
