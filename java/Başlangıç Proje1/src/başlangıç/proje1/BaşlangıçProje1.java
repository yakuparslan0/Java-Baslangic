/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package başlangıç.proje1;

import java.util.Scanner; //(Scanner işleminin yapılabilmesi için gerekli kutuphane)

/**
 *
 * @author Yakup Arslan
 */
public class BaşlangıçProje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { //Kullanıcıdan gelen bilgiyle alan çevre hesabı
        Scanner  input =new Scanner(System.in);
      System.out.println("deger giriniz");
      int k=input.nextInt();
       System.out.println("deger giriniz");
      int u=input.nextInt();
      int dc=(2*k)+(2*u);
      int da=(k*u);
      System.out.println("dikdortgenin cevresi="+dc);
      System.out.println("dikdortgenin alani="+da);
    }
    
}
