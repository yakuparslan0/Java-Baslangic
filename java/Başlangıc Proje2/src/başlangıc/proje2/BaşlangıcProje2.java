/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package başlangıc.proje2;

import java.util.Scanner; //(Scanner işleminin yapılabilmesi için gerekli kutuphane)

/**
 *
 * @author Yakup Arslan
 */
public class BaşlangıcProje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { //Kullanıcıdan gelen string ifadeyi okuyup yazdırma
         Scanner gelen=new Scanner(System.in);
     System.out.println("deger giriniz");
     String metin1=gelen.nextLine();    
     System.out.println("deger giriniz");
     String metin2=gelen.nextLine();
    }
    
}
