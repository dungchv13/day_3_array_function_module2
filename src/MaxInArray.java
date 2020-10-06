import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("nhap lan luot cac phan tu cho mang");

        for(int i = 0;i < size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int a:
             arr) {
            if(max < a){
                max = a;
            }
        }
        return max;
    }
    public static void showArr(int[] arr){
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
