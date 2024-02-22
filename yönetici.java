/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calışanlar;

/**
 *
 * @author Nilsu
 */
public class yönetici extends çalışan {
    
    private int sorumlu_kisi_sayisi;

    public yönetici(int sorumlu_kisi_sayisi, String ad, String soyad, int id) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("yöneticinin sorumlu olduğu kişi sayisi:"+sorumlu_kisi_sayisi);
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println(getAd()+" çalışanlara "+zam_miktari+" kadar zam yapıyor..");
    }
    
    
}
