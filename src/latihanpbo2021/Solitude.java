/*
 * Copyright 2021 Siwa
 * PBO
 * SMK TI BALI GLOBAL DENPASAR
 */
package latihanpbo2021;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Siwa
 */
public class Solitude {
    private static String nama, golongan, gajiPokok, reqRep;
    
    private static final int 
            a = 5000, 
            b = 7000, 
            c = 10000;
    
    private static int gajiKotor;
    
    private static void daftarPegawai(ArrayList<String> dataPegawai) {
        System.out.println("+-----------------------------------------------------------------------+"); // 71
        System.out.println("|\tNama Pegawai\t|\tGolongan\t|\tGaji Bersih\t|");
        System.out.println("+-----------------------------------------------------------------------+"); // 71

        for(String data: dataPegawai) {
            System.out.print(data);
        }
        System.out.print("\n\n");
    }
    
    public static void main() {
        Scanner input = new Scanner(System.in); // intance scanner
        ArrayList<String> dataPegawai = new ArrayList<>(); // data pegawai
       
        do {
            System.out.print("Masukkan nama pegawai\t: ");
            nama = input.nextLine();
            System.out.print("Gaji Pokok\t\t: Rp");
            gajiPokok = input.nextLine();
            System.out.print("Golongan\t\t: ");
            golongan = input.nextLine().toLowerCase();
            
            // cek golongan
            switch(golongan) {
                case "a":
                    gajiKotor = a + Integer.parseInt(gajiPokok);
                    break;
                case "b":
                    gajiKotor = b + Integer.parseInt(gajiPokok);
                    break;
                case "c":
                    gajiKotor = c + Integer.parseInt(gajiPokok);
                    break;
                default:
                    System.out.println("Pilih antara A, B, C !");
                    reqRep = "n";
            }

            // cek apakah switch case berhasil
            if(reqRep != "n") {
                // cek gaji
                if(gajiKotor >= 20000) {
                    System.out.println("----------------------------------------"); // 40
                    int gajiBersih = gajiKotor - 3000;
                    System.out.println("Tunjangan golongan\t: " + golongan);
                    System.out.println("Hitung gaji bersih\t: Rp" + gajiKotor + " - " + "Rp3000");
                    System.out.println("Gaji bersih\t\t: Rp" + gajiBersih);
                    System.out.println("----------------------------------------"); // 40

                    dataPegawai.add("|\t" + nama + "\t|");
                    dataPegawai.add("\t" + golongan + "\t|");
                    dataPegawai.add("\t Rp" + String.valueOf(gajiBersih) + "\t|\n");
                } else {
                    System.out.println("----------------------------------------"); // 40
                    int gajiBersih = gajiKotor - 2000;
                    System.out.println("Tunjangan golongan\t: " + golongan);
                    System.out.println("Hitung gaji bersih\t: Rp" + gajiKotor + "-" + "Rp2000");
                    System.out.println("Gaji bersih\t\t: Rp" + gajiBersih);
                    System.out.println("----------------------------------------"); // 40

                    dataPegawai.add("|\t" + nama + "\t|");
                    dataPegawai.add("\t" + golongan + "\t|");
                    dataPegawai.add("\t Rp" + String.valueOf(gajiBersih) + "\t|\n");
                }
                
                System.out.print("Ingin menambah data? (y/n): ");
                reqRep = input.nextLine().toLowerCase();
            }
            
        } while (reqRep.equals("y"));
        
        System.out.print("\n\n");
        daftarPegawai(dataPegawai);
    }
}
