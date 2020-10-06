import java.util.Scanner;

public class Chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double c;
        double f;
        int choice;
        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap do F:");
                    f = scanner.nextDouble();
                    System.out.println(fToC(f));
                    break;
                case 2:
                    System.out.println("nhap do C:");
                    c = scanner.nextDouble();
                    System.out.println(cToF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);

    }
    public static double cToF(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double fToC(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}

