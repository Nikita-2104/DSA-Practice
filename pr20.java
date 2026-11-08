public class pr20 {
    public static void main(String[]args){
        int number = 4;
        number++;
        for (int i = 1; i <= number; i++){
            // Spaces
            for (int j = 1; j < number - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            // for (int j = 1; j <= n - i; j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
    
}
