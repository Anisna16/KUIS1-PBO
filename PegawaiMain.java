/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KUISPegawai;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PegawaiMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        
       System.out.println("=================================");
       System.out.println("=== Masukan Jumlah Pegawai === : ");
       int jmlPegawai = sc.nextInt();
       System.out.println("=================================");
       for (i = 0; i < jmlPegawai; i++){
           System.out.println("=== Nama Pegawai : === ");
           String Nama = sc.next();
           System.out.println("=== NIP : === ");
           String NIP = sc.next();
           System.out.println("=== Jumlah Jam Kerja : === ");
           int jmlJamKerja = sc.nextInt();
           System.out.println("==============================");
           Pegawai pegawaiA = new Pegawai(NIP,Nama,jmlJamKerja);
           
           pegawaiA.gajiPokok();
           pegawaiA.setLembur();
           pegawaiA.uangMakan();
           pegawaiA.uangTransport();
           pegawaiA.cetakPenghasilan();
       }
    }
}
