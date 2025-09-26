import java.util.Scanner;
public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[3][3];
            matrix [0][0] = 1;
            matrix [0][1] = 5;
            matrix [0][2] = 7;
            matrix [1][0] = 9;
            matrix [1][1] = 8;
            matrix [1][2] = 12;
            matrix [2][0] = 2;
            matrix [2][1] = 4;
            matrix [2][2] = 6;

            for (int i = 0; i < matrix.length;i++){
                for (int j = 0; j < matrix[i].length;j++){
                    System.out.print(matrix[i][j] + " ");

                }
                System.out.println();
            }

    }
}