import java.util.Scanner;

public class demoPegawai { 
    public static void menu(){
        System.out.println("===== PROGRAM MENGHITUNG GAJI =====");
        System.out.println("1. Memasukkan data pegawai");
        System.out.println("2. Mencetak gaji pegawai");
        System.out.println("3. Keluar dari sistem");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pegawai p1 = new pegawai("Andi Atmaja", "PGW01", 7);
        pegawai p2 = new pegawai("Retno Raharja", "PGW02", 8);
        pegawai p3 = new pegawai("Joko Anjasmara", "PGW03", 9);
        int pilih = 0;
        do{
            System.out.println("");
            menu();
            System.out.print("Pilih menu : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Data pegawai berhasil dimasukkan");
                break;
                case 2:
                    p1.cetakPenghasilan();
                    System.out.println("");
                    p2.cetakPenghasilan();
                    System.out.println("");
                    p3.cetakPenghasilan();
                break;
                case 3:
                    System.out.println("Berhasil keluar dari sistem");
                    System.exit(0);
                break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
