
/**
 *
 * @author durad3306
 */

import java.util.Scanner;

public class e2b {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");   //Asks for name and age
        String sName = sc.nextLine();
        System.out.println("What is your age?");    
        int nAge = sc.nextInt();
                
        if (nAge > 18){
            System.out.println("Step right up " + sName + ", and vote.");   //Self explanitory
        } else{
            System.out.println("Maybe next time, " + sName );
        }
        sc.close();
    }
}
