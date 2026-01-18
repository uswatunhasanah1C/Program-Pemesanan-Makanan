import java.util.Scanner;
public class PemesananMakanan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int pilihanMenu;
        int harga = 0;
        int stok;
        char lanjut;
        boolean pesan = false;

        System.out.println("====================================");
        System.out.println("   SELAMAT DATANG DI RUMAH MAKAN");
        System.out.println("====================================");

        // Perulangan utama (while)
        while (!pesan) {
            System.out.println("\nDaftar Menu:");
            System.out.println("1. Nasi Goreng  - Rp15000");
            System.out.println("2. Mie Ayam     - Rp12000");
            System.out.println("3. Ayam Bakar  - Rp20000");
            System.out.print("Pilih menu (1-3): ");
            pilihanMenu = input.nextInt();

            // Percabangan switch-case
            switch (pilihanMenu) {
                case 1:
                    harga = 15000;
                    System.out.println("Anda memilih Nasi Goreng");
                    break;
                case 2:
                    harga = 12000;
                    System.out.println("Anda memilih Mie Ayam");
                    break;
                case 3:
                    harga = 20000;
                    System.out.println("Anda memilih Ayam Bakar");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    continue;
            }

            System.out.print("Stok menu tersedia? (masukkan jumlah stok): ");
            stok = input.nextInt();

            // Percabangan if-else
            if (stok > 0) {
                System.out.print("Jadi pesan? (y/n): ");
                lanjut = input.next().charAt(0);

                if (lanjut == 'y' || lanjut == 'Y') {
                    pesan = true;
                } else {
                    System.out.println("Silakan pilih menu kembali.");
                }
            } else {
                System.out.println("Maaf, stok habis. Silakan pilih menu lain.");
            }
        }

        // Proses pemesanan
        System.out.println("\nPesanan sedang diproses...");
        System.out.println("Silakan melakukan pembayaran di kasir.");

        System.out.print("Masukkan uang pembayaran: Rp");
        int bayar = input.nextInt();

        // Perulangan do-while (validasi pembayaran)
        do {
            if (bayar < harga) {
                System.out.println("Uang tidak cukup!");
                System.out.print("Masukkan uang pembayaran lagi: Rp");
                bayar = input.nextInt();
            }
        } while (bayar < harga);

        int kembalian = bayar - harga;

        System.out.println("\n========= KWITANSI =========");
        System.out.println("Total Harga : Rp" + harga);
        System.out.println("Bayar       : Rp" + bayar);
        System.out.println("Kembalian   : Rp" + kembalian);
        System.out.println("============================");

        System.out.println("\nTerima kasih, konsumen meninggalkan rumah makan.");
        input.close();
		

	}

}
