/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package başlangıç.proje5;

import java.util.Scanner;//(Scanner işleminin yapılabilmesi için gerekli kutuphane)

/**
 *
 * @author Yakup Arslan
 */
public class BaşlangıçProje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {//girilen iki basamaklı sayının rakamları toplamını veren uygulama
        Scanner girdi=new Scanner(System.in);
      System.out.println("Sayı giriniz");
      int sayı=girdi.nextInt();
      int kt=(sayı/10)+(sayı%10);
      System.out.println(kt);
    }
    
}
