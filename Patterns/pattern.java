// Code for printing the pattern
// package Patterns;
// public class pattern {
//     public static void main(String[] args){
//         System.out.print("*\n**\n***\n****\n*****");
//     }
// }

// Pattern 1: Rectangle
package Patterns;

public class pattern{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}