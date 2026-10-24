public class pr14 {
    public static void main(String[] args){
        int n = 4;

        for (int i = 1; i <= n ; i++){
            // Spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // 1st half of the pattern
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        

        // Lower half of the pattern
        for (int i = n; i >= 1 ; i--){
            // Spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // 1st half of the pattern
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}   
