import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
        
            NumberFormat usFormat = NumberFormat.getCurrencyInstance();
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        
            DecimalFormat df = new DecimalFormat("###,###,###.00");

	        String us = usFormat.format(payment);
	        String india = "Rs."+ df.format(payment);
	        String china = chinaFormat.format(payment);
	        String france = franceFormat.format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
    }
}
