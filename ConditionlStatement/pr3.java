import java.util.Scanner;

public class pr3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("The number " + a + " is greater than " + b);
        }
        else{
            System.out.println("The number " + b + " is greater than " + a);
        }
    }
}