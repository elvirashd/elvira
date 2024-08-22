/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class HandphoneBeraksi {
    public static void main(String[] args){
        Handphone handphoneberaksi = new Handphone();
        
        handphoneberaksi.hidupkan = " Handphone hidup...";
        handphoneberaksi.lakukanpanggilan = " Kring Krig Kring... panggilan dilakukan";
        handphoneberaksi.kirimSMS = " Dung Dung SMS berhasil terkirim";
        handphoneberaksi.matikan = " Handphone mati";
        
        System.out.println("hidupkan:" + handphoneberaksi.hidupkan);
        System.out.println("lakukan panggilan:" + handphoneberaksi.lakukanpanggilan);
        System.out.println("kirim SMS:" + handphoneberaksi.kirimSMS);
        System.out.println("matikan:" + handphoneberaksi.matikan);
    }
    
}
