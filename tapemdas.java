
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ASUS A442U
 */
public class tapemdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesanan, jumlah;
        double suhu, totalAkhir, total = 0, totalKeseluruhan, diskon, pajak;
        String jawaban1 = null, jawaban2;

        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------"
                + "\t\n                          Selamat Datang di Depot ALAM!"
                + "\n====================================================================================="
                + "\n                       DISKON UNTUK SETIAP TOTAL PEMBELIAN"
                + "\n           BAGI PEMBELI YANG MEMBAYAR DENGAN MENGGUNAKAN KARTU MEMBER"
                + "\n\t\t                   DISKON 20%"
                + "\n=====================================================================================");
        System.out.println(" ");
        System.out.println("Sebelum masuk ke tempat makan, mohon jawab pertanyaan berikut.");
        System.out.println("Berapa suhu tubuh Anda?");
        suhu = input.nextDouble();
        System.out.println("Jawaban : " + suhu);
        System.out.println(" ");

        if (suhu > 33 && suhu <= 37) {

            int[] stok = {50, 45, 55, 40, 38, 46, 60, 70, 50, 30};
            do {

                System.out.println("---------------------------------------------------------------------"
                        + "\t\n|                         SELAMAT DATANG!\t\t            |"
                        + "\n---------------------------------------------------------------------"
                        + "\n|           Silakan pilih paket menu yang ada di bawah ini:\t    |"
                        + "\n---------------------------------------------------------------------"
                        + "\n|  1.    Nasi Goreng\t\t | \tRp10.000\t | \t" + stok[0] + "  |"
                        + "\n|  2.    Nasi Mawut\t\t | \tRp11.000\t | \t" + stok[1] + "  |"
                        + "\n|  3.    Bakmi Goreng\t\t | \tRp10.000\t | \t" + stok[2] + "  |"
                        + "\n|  4.    Bakmi Kuah\t\t | \tRp12.000\t | \t" + stok[3] + "  |"
                        + "\n|  5.    Capcay\t\t         | \tRp10.000\t | \t" + stok[4] + "  |"
                        + "\n|  6.    Telur Dadar/Ceplok\t | \tRp3.000\t\t | \t" + stok[5] + "  |"
                        + "\n|  7.    Telur Asin\t\t | \tRp4.000\t\t | \t" + stok[6] + "  |"
                        + "\n|  8.    Es Teh/Teh Hangat\t | \tRp3.000\t\t | \t" + stok[7] + "  |"
                        + "\n|  9.    Es Jeruk/Jeruk Hangat\t | \tRp3.000\t\t | \t" + stok[8] + "  |"
                        + "\n|  10.   Kopi Hitam\t\t | \tRp4.000\t\t | \t" + stok[9] + "  |"
                        + "\n---------------------------------------------------------------------");
                totalAkhir = total;
                System.out.println("\nMasukkan nomor dari menu:");
                do {
                    pesanan = input.nextInt();
                    if (pesanan > 10 || pesanan < 1) {
                        System.out.println("Mohon masukkan angka sesuai menu paket yang tersedia:");
                    }
                } while (pesanan > 10 || pesanan < 1);

                System.out.println("Berapa jumlah yang ingin di pesan?");
                jumlah = input.nextInt();//JUMLAH

                int pesanan1 = pesanan - 1;
                
                if (stok[pesanan1] < 1) {
                    stok[pesanan1] = 0;
                }
                if (jumlah > stok[pesanan1]) {
                    System.out.println("#MOHON MAAF PESANAN ANDA MELEBIHI JUMLAH STOK KAMI#");
                    if (stok[pesanan1] < 0){
                        System.out.println("MOHON MAAF MENU YANG ANDA PILIH TELAH HABIS");
                        continue;
                    }
                    continue;
                }
                
                stok[pesanan1] = stok[pesanan1] - jumlah;
                
                

                String[] nama = {"Nasi Goreng", "Nasi Mawut", "Bakmi Goreng", "Bakmi Kuah", "Capcay", "Telur Dadar/Ceplok", "Telur Asin", "Es Teh/Teh Hangat", "Es Jeruk/Jeruk Hangat", "Kopi Hitam"};
                int[] harga = {10000, 11000, 10000, 12000, 10000, 3000, 4000, 3000, 3000, 4000};

                switch (pesanan) {
                    case 1 -> {
                        System.out.println("Anda memesan " + nama[0] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[0] + ",-");
                        total = totalAkhir + (harga[0] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 2 -> {
                        System.out.println("Anda memesan " + nama[1] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[1] + ",-");
                        total = totalAkhir + (harga[1] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 3 -> {
                        System.out.println("Anda memesan " + nama[2] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[2] + ",-");
                        total = totalAkhir + (harga[2] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 4 -> {
                        System.out.println("Anda memesan " + nama[3] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[3] + ",-");
                        total = totalAkhir + (harga[3] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 5 -> {
                        System.out.println("Anda memesan " + nama[4] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[4] + ",-");
                        total = totalAkhir + (harga[4] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 6 -> {
                        System.out.println("Anda memesan " + nama[5] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[5] + ",-");
                        total = totalAkhir + (harga[5] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 7 -> {
                        System.out.println("Anda memesan " + nama[6] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[6] + ",-");
                        total = totalAkhir + (harga[6] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 8 -> {
                        System.out.println("Anda memesan " + nama[7] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[7] + ",-");
                        total = totalAkhir + (harga[7] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 9 -> {
                        System.out.println("Anda memesan " + nama[8] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[8] + ",-");
                        total = totalAkhir + (harga[8] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    case 10 -> {
                        System.out.println("Anda memesan " + nama[9] + " sebanyak " + jumlah + " porsi");
                        System.out.println("Harga per porsi = Rp" + harga[9] + ",-");
                        total = totalAkhir + (harga[9] * jumlah);
                        System.out.println("Total = Rp" + (int) total + ",-");
                    }
                    default -> System.out.println("Input tidak valid");
                }

                System.out.println("\nApakah anda ingin memesan lagi? \"Ya\" atau \"Tidak\"");
                jawaban1 = input.next();
                System.out.println(" ");
            } while (jawaban1.equalsIgnoreCase("Ya"));
            if (jawaban1.equalsIgnoreCase("Tidak")) {
                pajak = total * 0.1;
                totalKeseluruhan = total + pajak;
                System.out.println("Apakah Anda memiliki kartu member? \"Punya\" atau \"Tidak\"");
                jawaban2 = input.next();
                if (jawaban2.equalsIgnoreCase("Punya")) {
                    System.out.println("\n=====================================================================================");
                    System.out.println("Selamat Anda mendapatkan diskon 20%");
                    diskon = total * 0.2;
                    total -= diskon;
                    totalKeseluruhan = total + pajak;
                    System.out.println("Total pembayaran Anda menjadi = Rp" + (int) total + ",- + pajak sebesar Rp" + (int) pajak + ",- ==> Rp" + (int) totalKeseluruhan + ",-");
                    System.out.println("=====================================================================================");
                } else if (jawaban2.equalsIgnoreCase("Tidak")) {
                    System.out.println("\n=====================================================================================");
                    System.out.println("Total pembayaran Anda menjadi = Rp" + (int) total + ",- + pajak sebesar Rp" + (int) pajak + ",- ==> Rp" + (int) totalKeseluruhan + ",-");
                    System.out.println("=====================================================================================");
                }

                System.out.println(" ");
                System.out.println("Silakan bayar sesuai dengan bill Anda");
                int bayar = input.nextInt();
                double sisa;
                double kurang = 0;
                if (bayar == totalKeseluruhan) {
                    System.out.println("Jumlah uang Anda pas");
                } else if (bayar < totalKeseluruhan) {
                    sisa = totalKeseluruhan - bayar;
                    do {
                        sisa -= kurang;
                        System.out.println("Uang Anda kurang Rp" + sisa);
                        kurang = input.nextInt();
                        if (kurang > sisa) {
                            kurang -= sisa;
                            System.out.println("Kembalian Anda Rp" + kurang);
                        }
                    } while (kurang != sisa);
                } else if (bayar > totalKeseluruhan) {
                    sisa = bayar - totalKeseluruhan;
                    System.out.println("Kembalian Anda Rp" + sisa);

                }
            }
            mainmenu();
        } else {
            suhu();
        }
    }

    public static void mainmenu() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("    Terima kasih sudah memesan, silakan menunggu, pesanan akan segera diantarkan.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void suhu() {
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            Mohon maaf, Anda tidak dapat masuk ke dalam tempat makan.");
        System.out.println("                                    TERIMA KASIH");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    
}