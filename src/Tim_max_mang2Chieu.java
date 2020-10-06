import java.util.Scanner;

public class Tim_max_mang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so hang cua matran");
        int x = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran");
        int y = scanner.nextInt();

        int [][] matrix = new int[x][y];

        for (int i = 0;i < x;i++){
            for (int j = 0;j < x;j++){
                System.out.println("nhap matrix["+i+"]["+j+"]=");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("max cua matrix la:");
        System.out.println(findMax(matrix));
    }
    public static int findMax(int[][]matrix){
        int max = matrix[0][0];
        for (int[]x: matrix) {
            for (int m: x) {
                if(max < m){
                    max = m;
                }
            }
        }
        return max;
    }
}
