package Pertemuan13;
import java.util.Scanner;
public class Percobaan617 {    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan Panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang Adalah: "+L);
        vol = L*t;  
        System.out.println("Volume Balok Adalah: "+vol);

    }
    static int hitungLuas(int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;

    }
}
