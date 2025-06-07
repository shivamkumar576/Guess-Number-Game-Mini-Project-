import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 100);  
        int myNum;
        Scanner sc = new Scanner(System.in);  

        do {
            System.out.print("Guess The Number: ");
            myNum = sc.nextInt();

            if (myNum == num) {
                System.out.println("Yeh!... Congratulations, You Win.");
                break;
            } else if (myNum > num) {
                System.out.println("Your Number is too Large.");
            } else {
                System.out.println("Your Number is too Small.");
            }
        } while (myNum >= 0);

        System.out.println("The number was: " + num);
        sc.close();
    }
}
