/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystrings;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MyStrings {
    public static void main(String[] args) {
        String word1;
        String word2;
        
       
    
     // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // input user
        word1 = input.next();
        word2 = input.next();
                 
     //menghitung jumlah huruf
     int JumlahHuruf;
     JumlahHuruf = word1.length() + word2.length();
     System.out.println(JumlahHuruf);
     
     //membandingkan 2 string
       if (word1.compareTo(word2) > 0) {
           System.out.println("Yes");
       } else if (word1.compareTo(word2) < 0) {
           System.out.println("No");
       } else {
           System.out.println("Same");
       }
     
     //menggabungkan 2 string
     String SumKata;
     SumKata = word1.substring(0,1).toUpperCase() + word1.substring(1) + " " + word2.substring(0,1).toUpperCase()+ word2.substring(1);
        System.out.println(SumKata);
    }

    private static Object word1(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
