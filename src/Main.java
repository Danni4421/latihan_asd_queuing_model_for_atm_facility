import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String name = sc.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String address = sc.nextLine();
                    System.out.print("Masukkan Umur : ");
                    int age = sc.nextInt();



                    break;
            }
        }
    }
}