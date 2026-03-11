import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClassEx {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        //before java 1.5 (reading values from user,files...etc
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//        String input = bf.readLine(); // Read input as string
//        int number = Integer.parseInt(input); // Convert to integer
//        System.out.println(number);

        //from java 1.5version taking the values from user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
