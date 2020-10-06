import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6,1,1,1,1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so ban muon xoa khoi mang");
        int n = scanner.nextInt();


        array = xoaN(n,array);
        System.out.println("mang sau khi xoa");
        for (int a:
             array) {
            System.out.print(a+" ");
        }
    }
    public static int[] xoaN(int n ,int[] arr){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == n){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1] = 0;
            }
        }
        return arr;

    }
}
