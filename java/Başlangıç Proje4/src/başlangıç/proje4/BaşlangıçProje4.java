/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package başlangıç.proje4;

import java.util.Scanner;//(Scanner işleminin yapılabilmesi için gerekli kutuphane)

/**
 *
 * @author Yakup Arslan
 */
public class BaşlangıçProje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {//Celcıus Fahrenaıt dönüşümünü veren uygulama
     Scanner s=new Scanner(System.in);
     System.out.println("Celcıus giriniz"); 
     double sıcaklık=s.nextDouble();
     double fh=(9/5)*sıcaklık+32;
     System.out.println(fh);
    }
    
}
