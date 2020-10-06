import java.util.Scanner;

public class Tim_min_mang2Chieu {
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
        System.out.println("min cua matrix la:");
        System.out.println(findMin(matrix));
    }
    public static int findMin(int[][]matrix){
        int min = matrix[0][0];
        for(int[]x: matrix){
            for(int y: x){
                if(min > y){
                    min = y;
                }
            }
        }
        return min;
    }
}
