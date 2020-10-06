public class Gop_mang {
    public static void main(String[] args) {
        int[] array1 = {10,4,6,7,8,6,0,0,0,0};
        int[] array2 = {10,4,6,7,8,0,0,0,0,0};

        Them_phanTu_vaoMang.showArray(noiMang(array1,array2));

    }
    public static int[] noiMang(int[] arr1,int[] arr2){
        int[] newArr = new int[arr1.length+arr2.length];
        for (int i = 0;i < arr1.length;i++){
            newArr[i]=arr1[i];
        }
        for (int i = arr1.length;i < arr1.length+arr2.length;i++){
            newArr[i]=arr2[i-arr1.length];
        }
        return newArr;
    }
}
