import java.util.Scanner;

public class Tinh_tong_duong_cheo_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang cua matrix vuong");
        int x = scanner.nextInt();

        int [][] matrix = new int[x][x];

        for(int i = 0;i < x;i++){
            for(int j = 0;j < x;j++){
                System.out.print("nhap matrix[" + i + "][" + j + "]=");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("tong cac phan tu thuoc duong cheo chinh tu trai sang phai la:"+sum1(matrix));
        System.out.println("tong cac phan tu thuoc duong cheo chinh tu phai sang trai la:"+sum2(matrix));
    }
    public static int sum1(int[][]matrix){
        int sum = 0;
        for(int i = 0;i < matrix.length;i++){
            sum += matrix[i][i];
        }
        return sum;
    }
    public static int sum2(int[][]matrix){
        int sum = 0;
        for(int i = 0;i < matrix.length;i++){
            sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
}
