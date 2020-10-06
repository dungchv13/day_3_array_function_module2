import java.util.Scanner;

public class Thuchanh_daonguoc_mang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("nhap chieu dai cua mang");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("mang ko vuot qua 20 phan tu");
            }
        }while(size > 20);
        System.out.println("nhap cac phan tu cua mang");
        int [] array = new int[size];
        for(int i = 0;i < size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("mang truoc khi dao nguoc");
        inMang(array);
        daoNguoc(array);
        System.out.println("mang sau khi dao nguoc");
        inMang(array);
    }
    public static void daoNguoc(int[] arr){
        for(int i = 0;i <= arr.length/2;i++){
            int tem = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=tem;
        }
    }
    public  static void inMang(int[] arr){
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
