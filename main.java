
package calışanlar;

import java.util.Scanner;

/**
 *
 * @author Nilsu
 */
public class main {
    public static void main (String args[]){
    
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("çalışanlar programına hoşgeldiniz");
    
    String islemler="islemler...\n"
            +"1.yazılımcı islemler\n"
            +"2.yönetici islemleri\n"
            +"3.çıkış için q ya basınız\n";
    
    
        System.out.println(islemler);
        
        while(true){
            System.out.println("işlemi seçiniz:");
            String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                
                yazilimci yazilimci=new yazilimci("nilsu", "efe",235, "Java");
                String yazilimci_islem ="1.format at\n"
                        +"2.bilgileri göster\n"
                        +"çıkış için q ya basınız";
                System.out.println(yazilimci_islem);
                
                while(true){
                    System.out.println("islemi seçiniz:");
                    String y_islem=scanner.nextLine();
                    
                    if(y_islem.equals("1")){
                        System.out.println("işletim sistemi:");
                        String isletim_sistemi=scanner.nextLine();
                        
                        yazilimci.format_at(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgileri_goster();
                    }
                    else if(y_islem.equals("q")){
                        System.out.println("sistemden çıkılıyor..");
                        break;
                    }
                    else{
                        System.out.println("yanlış tuşlama yaptınız..");
                    }
                }
                
                
            }
            else if(islem.equals("2")){
                
                yönetici yönetici=new yönetici(200, "nil", "nehir", 10);
                String yonetici_islem="1.bilgileri göster\n"
                        +"2.zam yap\n"
                        +"çıkış için q ya basınız";
                
                System.out.println(yonetici_islem);
                
                while(true){
                    System.out.println("işlemi seçiniz:");
                    String yo_islem=scanner.nextLine();
                    
                    if(yo_islem.equals("q")){
                        System.out.println("çıkış yapılıyor..");
                        break;
                    }
                    else if(yo_islem.equals("1")){
                        yönetici.bilgileri_goster();
                    }
                    else if(yo_islem.equals("2")){
                        System.out.println("yapılacak zam miktarını giriniz:");
                        int zam =scanner.nextInt();
                        
                        yönetici.zam_yap(zam);
                    }
                    else{
                        System.out.println("yanlış tuşlama yaptınız..");
                    }
                }
                
            }
            
        }
        
        
}
    
}
