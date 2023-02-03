package dataStructures;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
	    
		 int option=1;
	        while (option>=1 && option<=3){
	            System.out.println("MENU");
	            System.out.println("1-FIND EBOB");
	            System.out.println("2-FIND EKOK");
	            System.out.println("3-ASAL MI");
	            System.out.println("OTHER KEY FOR EXIT");
	            System.out.println("SELECT:");
	            Scanner sc=new Scanner(System.in);
	            option=sc.nextInt();
	            switch (option){
	                case 1:ebob();
	                       break;
	                case 2:ekok();
	                    break;
	                case 3: asal();
	                    break;    
	               } 
	      
	        }
	}
		
		 static double ebob( ) {
	        System.out.println("1) FIND EBOB"); 
	        Scanner scan = new Scanner(System.in); 
	        System.out.println("Enter the first number:");
	        int num1 = scan.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scan.nextInt();
	         int ebob = 0;
			for(int i = 1; i < num1; i++)
	        {
	            if(num1 % i == 0 && num2 % i == 0) {
	                ebob = i;
	            }
	        }
	        System.out.println("Ebob = " + ebob);
			return ebob;
	        
		 }
		  
	         static double ekok () {
	        	System.out.println("2) FIND EKOK"); 
	        	Scanner scan = new Scanner(System.in); 
	 	        System.out.println("Enter the first number:");
	 	        int num1 = scan.nextInt();
	 	        System.out.print("Enter the second number: ");
	 	        int num2 = scan.nextInt();
	  
	          int ekok= 0;
			for(int i = 1; i > 0; i--)
	        {
	            if(i % num1 == 0 && i % num2 == 0) {
	                ekok = i;
	            }
	        }
	        System.out.println("Ekok = " + ekok);
		    return ekok;
	        }
	      
	         static double asal () {
	        	System.out.println("3) ASAL MI"); 
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the number:");
		        int num = scan.nextInt();		        	
		        	
		        boolean asal;
		        int counter = 0, bolen = 2;
		        while(true){
		        	if (num % bolen == 0) {
		                counter++;
		                break;
		            }
		            bolen++;
		            if (bolen == num) {
		                break;
		            }
		        }
		        if (counter == 0) {
		            System.out.println("The number you entered is ASAL");
		        } else {
		            System.out.println("The number you entered in NOT ASAL");
		        }
				return bolen;
		    
		        }
		        
		        
	   
}
	


