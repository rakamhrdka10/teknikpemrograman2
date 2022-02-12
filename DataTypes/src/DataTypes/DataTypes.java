/**
 * Nama  : Raka Mahardika Maulana
 * kelas : D4 1B
 */
package DataTypes;

import java.util.Scanner;


public class DataTypes {

    public static void main(String[] args) {
      int jumlahAngka;
      int i = 0;
      
      
        // membuat scanner baru
        Scanner input = new Scanner(System.in); 
        
        // input user
        jumlahAngka = input.nextInt();
        
        //  variabel untuk menampung angka
        String[] angka = new String [jumlahAngka];
        
        while(i < jumlahAngka){
            angka[i] = input.next();
            i++; 
        
    }
        for ( i=0 ;i < jumlahAngka; i++){
           
          try{
             long change = Long.parseLong(angka[i]);
             System.out.println(change + " can be fitted in");
            if ((change >= -9223372036854775808L)&&(change <= 9223372036854775807L)){
                System.out.println("long");
               if ((change >= -2147483648 )&&(change <= 2147483647)){ 
                System.out.println("int");
                    if ((change >= -32768 )&&(change <= 32767)){
                        System.out.println("short");
                    }
               }
            }
          } catch(NumberFormatException e){ 
             System.out.println(angka[i] + " can't be fitted anywhere");
            }
              
          } 
        }
    }
    

