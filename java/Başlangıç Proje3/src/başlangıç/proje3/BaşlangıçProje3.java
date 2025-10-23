/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package başlangıç.proje3;

import java.util.Scanner;//(Scanner işleminin yapılabilmesi için gerekli kutuphane)

/**
 *
 * @author Yakup Arslan
 */
public class BaşlangıçProje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { //Kullanıcın girdiği değerlere göre gitmek istediği yere ne kadar hızla gitceğini veren uygulama
        Scanner soru=new Scanner(System.in);
     System.out.println("Gitmek istediğiniz mesafe?");
     int mesafe=soru.nextInt();System.out.println("Kaç saatte gitmek ıstıyorsunuz");
     int saat=soru.nextInt();
     System.out.println(mesafe/saat);
    }
    
}
