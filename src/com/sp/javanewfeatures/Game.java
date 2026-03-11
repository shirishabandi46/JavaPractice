import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        for (int i = 0; i < 3; i++) {
            int ranNum = (int) (Math.random()*10);
            System.out.println("enter your number");
            int userinput = scanner.nextInt();
            if (userinput == ranNum) {
                System.out.println("you won");
                break;
            } else {
                if(i==0)
                    System.out.println("2 more chances"+ " " +ranNum);
                else if(i==1){
                    System.out.println("one more chance"+ " " + ranNum);
                }
                else{
                    System.out.println("you lost the game" + " " + ranNum);
                }
            }

        }
        scanner.close();
    }

}
