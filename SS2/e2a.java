/**
 *
 * @author durad3306
 */

import java.util.Scanner;

public class e2a {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	System.out.println("Do you want to convert from Centigrade to Fahrenheit or from Fahrenheit to Centigrade?");
	String sChoice = sc.nextLine();
        sChoice = sChoice.toLowerCase();    //sanitizes input
        

        if (sChoice.equals("centigrade to fahrenheit")){    //Checks for one option 
            System.out.println("Please input the Centigrade value: ");
            int nCentigrade = sc.nextInt();
            int nFahrenheit = (nCentigrade*9)/5 +32;        //formula for fahrenheit calculation
            System.out.println("The Fahrenheit value in degrees is " + nFahrenheit);
            
        } else if(sChoice == "fahrenheit to centigrade"){   //checks for the other
            System.out.println("Please input the Fahrenheit value: ");
            int nFahrenheit2 = sc.nextInt();
            int nCentigrade2 = ((nFahrenheit2 - 32) * 5)/9; //centigrade calculation
            System.out.println("The Centigrade value in degrees is " + nCentigrade2 );
        } 
	
        
	sc.close();
    }
}
