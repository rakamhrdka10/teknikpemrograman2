/**
* Nama :Raka mahardika 
* kelas : D4 1B
 */

package mystrings;

import java.util.Scanner;


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
   

}
