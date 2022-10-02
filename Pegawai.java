/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KUISPegawai;

/**
 *
 * @author User
 */
public class Pegawai {
    public String Nama, NIP;
    public double gajiPokok, lembur, uangMakan, Transport;
    public int jmlJamKerja;
    public double totalGaji;
    public double totalGajiPegawai;
    
    Pegawai (String Nama, String NIP, int jmlhJamKerja ){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jmlJamKerja = jmlJamKerja;
    }
    public void setJamKerja(int jmlhJamKerja){
        this.jmlJamKerja = jmlJamKerja;
        this.Nama = Nama;
    }
    public void gajiPokok(){
        gajiPokok = jmlJamKerja *  2000;
    }
    public void setLembur(){
        if(jmlJamKerja > 7){
            lembur = (jmlJamKerja - 7)*(gajiPokok  *1.5);
        }else{
            lembur = 0;
        }  
    }
    
    public void uangMakan(){
        if (jmlJamKerja >= 8){
            uangMakan = 3500;
        }else{
            uangMakan = 0;
        }
    }
    
    public void uangTransport(){
        if (jmlJamKerja >= 9){
            Transport = 4000;
        }else{
            Transport = 0;
        }
    }
    
    public void cetakPenghasilan(){
        totalGajiPegawai = (gajiPokok + lembur + uangMakan + Transport);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Gaji Lembur : "+lembur);
        System.out.println("Uang Makan : "+uangMakan);
        System.out.println("Uang Transportasi : "+Transport);
        System.out.println("Total Gaji Pegawai : "+totalGajiPegawai);
    }
}