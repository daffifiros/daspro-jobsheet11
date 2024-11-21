    package Pertemuan13;

    import java.util.Scanner;

    public class Kafe17 {

        public static void Menu(String namaPelanggan, boolean isMember) {
            System.out.println("Selamat datang, " + namaPelanggan + "!");
            
            if (isMember) {
                System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            }
            System.out.println("==== MENU RESTO KAFE ====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Capuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System.out.println("============================");
            System.out.println("Silahkan pilih menu yang anda inginkan! ");
        }

        public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
            
            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
            
            if ("DISKON50".equals(kodePromo)) {
                hargaTotal *= 0.5; 
                System.out.println("Anda mendapatkan diskon 50%!");
            } else if ("DISKON30".equals(kodePromo)) {
                hargaTotal *= 0.7; 
                System.out.println("Anda mendapatkan diskon 30%!");
            } else if (!kodePromo.isEmpty()) {
                System.out.println("Kode promo invalid, tidak ada pengurangan total harga.");
            }

            return hargaTotal;
        }

        public static void main(String[] args) {
            Menu("Andi", true);
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            System.out.print("Masukkan kode promo (jika ada): ");
            String kodePromo = sc.next();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total harga untuk pesanan anda: Rp " + totalHarga);
        }
    }