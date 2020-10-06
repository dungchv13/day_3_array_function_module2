import java.util.Scanner;

public class Thuchanh_timkiem_trongmang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ten hoc sinh");
        String studentName = scanner.nextLine();
        if(check(studentName,students)){
            System.out.println("co hoc sinh nay trong lop");
        }else{
            System.out.println("ko co hoc sinh nay trong lop");
        }
    }
    public static boolean check(String name,String[] students){
        for (String nameS:
             students) {
            if(nameS.equals(name)){
                return true;
            }
        }
        return false;
    }
}
