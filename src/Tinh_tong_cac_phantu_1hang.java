import java.util.Scanner;

public class Tinh_tong_cac_phantu_1hang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so hang cua matran");
        int x = scanner.nextInt();
        System.out.println("nhap so cot cua ma tran");
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("nhap matrix[" + i + "][" + j + "]=");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhap hang ban muon tinh tong:");
        int n = scanner.nextInt();
        System.out.println("sum = "+sumRow(n,matrix));

    }
    public static int sumRow(int n,int[][]matrix){
        int sum = 0;
        for(int i = 0;i < matrix[n-1].length;i++){
            sum += matrix[n-1][i];
        }
        return sum;
    }
}
