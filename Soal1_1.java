import java.util.Scanner;

public class Soal1_1 {

    public static void main(String[] args) {
        // 1. Inisialisasi Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // 2. Input data paket
        System.out.println("=== Perhitungan Biaya Pengiriman ===");
        System.out.print("Masukkan Berat Paket (kg): ");
        double berat = scanner.nextDouble();

        System.out.print("Masukkan Jarak Tempuh (km): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan Panjang Paket (cm): ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan Lebar Paket (cm): ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan Tinggi Paket (cm): ");
        double tinggi = scanner.nextDouble();

        // 3. Perhitungan
        
        // a. Hitung Volume
        double volume = panjang * lebar * tinggi;

        // b. Hitung Biaya Berdasarkan Jarak
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250; // Rp 4250 per kg untuk jarak <= 10 km
        } else {
            biayaPerKg = 6000; // Rp 6000 per kg untuk jarak > 10 km
        }
        double biayaBerat = berat * biayaPerKg;

        // c. Hitung Biaya Volume Tambahan
        double biayaVolumeTambahan = 0;
        if (volume > 100) {
            biayaVolumeTambahan = 50000; // Biaya tambahan Rp 50.000,- jika volume > 100 cm^3
        }
        
        // d. Hitung Biaya Total
        double totalBiaya = biayaBerat + biayaVolumeTambahan;

        // 4. Tampilkan Hasil
        System.out.println("\n=== Detail Biaya ===");
        System.out.printf("Berat Paket: %.2f kg\n", berat);
        System.out.printf("Jarak Tempuh: %.2f km\n", jarak);
        System.out.printf("Volume Paket: %.2f cm^3\n", volume);
        System.out.printf("Biaya Berat (%.0f/kg): Rp %,.2f\n", biayaPerKg, biayaBerat);
        System.out.printf("Biaya Volume Tambahan: Rp %,.2f\n", biayaVolumeTambahan);
        System.out.printf("TOTAL BIAYA PENGIRIMAN: Rp %,.2f\n", totalBiaya);

        // Tutup scanner
        scanner.close();
    }
}
