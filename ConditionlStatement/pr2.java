import java.util.Scanner;

public class pr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("This is an Even number.");
        }
        else{
            System.out.println("This is an Odd number.");
        }
    }
}
