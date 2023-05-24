import Entity.Nasabah;
import EntityController.NasabahController;
import EntityController.WorkerController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NasabahController nController = new NasabahController();
        WorkerController wController = new WorkerController();
        Queue Q = new Queue(2, 5, 10, nController, wController);
        System.out.println(":::: BANK JOTOTORO ::::");
        while (true) {
            Menu();
            System.out.print("Masukkan Pilihan : ");
            switch (sc.nextInt()) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String name = sc.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    String address = sc.nextLine();
                    System.out.print("Masukkan Umur : ");
                    int age = sc.nextInt();

                    Nasabah newNasabah = new Nasabah(null, name, address, age, null);
                    nController.Enqueue(newNasabah);

                    if (newNasabah != null) {
                        System.out.println("Pilih hendak kemana? ");
                        bankService();
                        switch (sc.nextInt()) {
                            case 1:
                                Q.addToTeller();
                                break;
                        }
                    }

                    break;

                case 2:
                    System.out.println("Keluarkan Nasabah dari antrian : ");
                    bankService();
                    System.out.print("Pilih Service : ");
                    switch (sc.nextInt()) {
                        case 1:
                            Nasabah droppedFromTeller = Q.dropFromTeller();
                            if (droppedFromTeller != null) {
                                System.out.println("Name : " + droppedFromTeller.name );
                                System.out.println("Address : " + droppedFromTeller.address);
                                System.out.println("Age : " + droppedFromTeller.age);
                            }
                            break;
                    }
                    break;
            }

            System.out.println("Teruskan [y/n] ? ");
            if (sc.next().charAt(0) != 'y') {
                break;
            }
        }
    }

    public static void Menu() {
        System.out.println("[1] Masukkan Nasabah");
        System.out.println("[2] Keluarkan Nasabah dari Antrian");
        System.out.println("[3] Print Antrian Nasabah");
        System.out.println("[4] Daftarkan Pekerja");
        System.out.println("[5] Tutup Bank");
    }

    public static void bankService() {
        System.out.println("[1] Teller");
        System.out.println("[2] Customer Service");
        System.out.println("[3] ATM");
    }
}