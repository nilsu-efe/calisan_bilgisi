/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calışanlar;

/**
 *
 * @author Nilsu
 */
public class çalışan {
    
     private String ad;
    private String soyad;
    private int id;

    public çalışan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    
    public void bilgileri_goster(){
        System.out.println("çalışan bilgileri..");
        System.out.println("isim:"+ad);
        System.out.println("soyisim:"+soyad);
        System.out.println("Id:"+id);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
