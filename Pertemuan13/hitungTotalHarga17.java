package Pertemuan13;
import java.util.Scanner;
public class hitungTotalHarga17 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem; 
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo DISKON50 diterima! Anda mendapat diskon 50%.");
            hargaTotal -= hargaTotal * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo DISKON30 diterima! Anda mendapat diskon 30%.");
            hargaTotal -= hargaTotal * 30 / 100;
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();
    int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
    System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}