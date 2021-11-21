/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2021;

import java.util.Scanner;

/**
 *
 * @author Siwa
 */
public class SimpleSolitude {
    private static int totalGaji;
    private static int gajiBersih;

    public static void main() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama pegawai: ");
        String pegawai = input.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        String gajiPokok = input.nextLine();
        System.out.print("Masukkan Golongan: ");
        String golongan = input.nextLine().toLowerCase();
            
        System.out.println("====================");
        System.out.println("Nama Pegawai: " + pegawai);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Golongan: " + golongan);
        
        switch(golongan) {
            case "a":
                totalGaji = Integer.parseInt(gajiPokok) + 5000;
                if(totalGaji >= 20000) {
                    gajiBersih = totalGaji - 3000;
                    System.out.println("Potongan: Rp3000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                } else {
                    gajiBersih = totalGaji - 2000;
                    System.out.println("Potongan: Rp2000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                }
                break;
            case "b":
                totalGaji = Integer.parseInt(gajiPokok) + 7000;
                if(totalGaji >= 20000) {
                    gajiBersih = totalGaji - 3000;
                    System.out.println("Potongan: Rp3000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                } else {
                    gajiBersih = totalGaji - 2000;
                    System.out.println("Potongan: Rp2000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                }
                
                break;
            case "c":
                totalGaji = Integer.parseInt(gajiPokok) + 10000;
                if(totalGaji >= 20000) {
                    gajiBersih = totalGaji - 3000;
                    System.out.println("Potongan: Rp3000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                } else {
                    gajiBersih = totalGaji - 2000;
                    System.out.println("Potongan: Rp2000");
                    System.out.println("Gaji Bersih: Rp" + gajiBersih);
                }
                break;
            default:
                System.out.println("Pilih Golongan antara: [A, B, C] !");
        }
    }
}
