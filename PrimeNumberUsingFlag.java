package demo;

public class PrimeNumberUsingFlag {
	public static void main(String[] args) {
		int Check_Num = 3;
	    boolean flag = false;
	    for (int i = 2; i <= Check_Num / 2; ++i) {
	     
	      if (Check_Num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(Check_Num + " is a prime number.");
	    else
	      System.out.println(Check_Num + " is not a prime number.");
		}
	}
	
        
				

					

					

