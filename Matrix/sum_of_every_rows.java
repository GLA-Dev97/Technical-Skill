import java.util.Scanner;

public class sum_of_every_rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            int sum = 0;
            for(int j=0; j<cols; j++){
                sum+= matrix[i][j];
            }
            System.out.println(" Sum of Row " + sum);

    }
}
}
