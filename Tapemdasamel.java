/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tapemdasamel;

import java.util.Scanner;

/**
 *
 * @author ASUS A442U
 */
public class Tapemdasamel {
//prak11
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean kondisi = true;
        int jumlah = in.nextInt();
        String[] barang = new String[jumlah];

        for (int i = 0; i < barang.length; i++) {
            barang[i] = in.next();
            if (!(barang.equals("pedang")) && !(barang.equals("narkoba")) && !(barang.equals("racun"))) {
                kondisi = false;
            }

        }
        if (kondisi) {
            System.out.println("Tidak ada barang di semua loker!");
        }
        int kurang = -1;
        for (int j = 0; j < barang.length; j++) {
            if (barang.equals("pedang") || barang.equals("narkoba") || barang.equals("racun")) {
                continue;
            } else {
                kurang++;
            }
            if (kurang == 0) {
                System.out.println("List Barang : ");
            }

            System.out.println((kurang + 1) + ". " + barang[j] + " pada loker ke-" + kurang);
        }
    }

}
