import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap size cua mang");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("nhap lan luot cac phan tu cua mang");
        for(int i = 0;i < size;i++){
            array[i] = scanner.nextInt();;
        }
        System.out.println(findMin(array));
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int a:
             arr) {
            if(min > a){
                min = a;
            }
        }
        return min;
    }
}
