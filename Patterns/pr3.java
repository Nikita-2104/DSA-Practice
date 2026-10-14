// Pattern 2: Hollow Rectangle
package Patterns;

public class pr3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 4 || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

