package homework3;

	import java.util.Scanner;

	 public class terstenCevırme
	{
	  public static void main(String args[])
	  
	  {
		  String original, reverse = "";

		    System.out.println("Metin girin: ");
		    Scanner in = new Scanner(System.in);
		    original = in.nextLine();
		    int length = original.length();

		    for (int i = length - 1 ; i >= 0 ; i--) {
		      reverse = reverse + original.charAt(i);

		    System.out.println("Metinin tersi: " + reverse);}
	  
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (original.charAt(begin) == original.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else
	        break;
	    }
	    if (i == middle + 1)
	      System.out.println("Palindrom");
	    else
	      System.out.println("Palindrom değil");
	  }
	}

