package Pertemuan13;
import java.util.Scanner;;
public class Kubus17 {
    public static int hitungVolume(int sisi){
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Volume kubus dengan sisi" + sisi + " adalah: " + volume);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}
