import java.util.Scanner;

public class Them_phanTu_vaoMang {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};

        Scanner scanner = new Scanner(System.in);

        System.out.println("hay nhap phan tu ban muon chen vao mang");
        int x = scanner.nextInt();

        System.out.println("hay nhap vi tri ban muon chen phan tu vao");
        int index = scanner.nextInt();

        showArray(themX(x,index,arr));

    }
    public static int[] themX(int x,int index,int[] arr){
        for(int i = arr.length-1;i > index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        return arr;
    }
    public static void showArray(int[] arr){
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }
}
