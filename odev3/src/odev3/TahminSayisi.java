 package odev3;

 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
 import java.util.Scanner;
  
 public class TahminSayisi {
       
	 
     public static void main(String[] args) {
    	
    	 
    	 int sayi,sayac = 0;
    	 int i;
		int[] list = new int [i];
    	 for(int i1=0;i1<3;i1++)
         {
    
        String oyuncu[]= {"1.oyuncu","2.oyuncu","3.oyuncu"};
         Scanner scan = new Scanner(System.in);
         Random rastgele = new Random();
         int rastgeleSayi = 1 + rastgele.nextInt(99);
         System.out.println(" 1 ile 100 arasında ");
        
          
         do {
             System.out.print("Bir sayi giriniz: ");
             sayi = scan.nextInt();
             if(sayi > rastgeleSayi) {
                 System.out.println("Too hıgh, try again");
             }
             else if(sayi < rastgeleSayi) {
                 System.out.println("Too low, try again");
             }
             sayac++;
         }
         
  
         while(sayi != rastgeleSayi);
         System.out.println("Tebrikler! " + i1+1 +". oyuncu "+ sayac + ".denemede sayıyı buldunuz.");
         }
        while(true) {
        	int y=sayac;
      		int i1 =0;
      		i1++;
			int[] list = new int [i1];
			 int [] liste = {y};
			 System.out.println(liste[i1]);
      		 
         }
        
            }
    	


    	
 	               
      
 		
       
 		
     }	

      
    	 


    
   
 
     



