import java.util.Scanner;

public class pr4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter button number (1-3) :");
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else{
            System.out.println("Bonjour");
        }
    }
}

