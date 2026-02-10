import java.util.Scanner;

public class sum_of_upper_diagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and element: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i<j){
                    sum = sum +matrix[i][j];
                    
                }
            }
        }
        System.out.println("Sum of upper triangle is: " + sum);
        
    }
}