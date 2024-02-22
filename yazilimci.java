/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calışanlar;

/**
 *
 * @author Nilsu
 */
public class yazilimci extends çalışan {
    
     private String diller;

    public yazilimci(String ad, String soyad, int id , String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    
    public void format_at(String isletim_sistemi){
        System.out.println(getAd()+" "+isletim_sistemi+"ni yüklüyor...");
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("yazılımcının bildiği diller:"+diller);
    }
    
    
}
