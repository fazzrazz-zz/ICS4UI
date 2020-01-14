

/**
 *
 * @author durad3306
 */

import java.util.Scanner;

public class e2c {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the radius: ");    //Get radius
        double dRadius = sc.nextInt();
        System.out.println("Do you want to display the area or the circumference?");
        String sReply = sc.next();     //Asks for choice
        if (sReply.equals("area")){ //Calculates area
            double dArea = (dRadius * dRadius) * Math.PI;
            dArea = Math.round(dArea);
            System.out.println("The area of radius " + dRadius + " is about " + dArea);
        }
        if (sReply.equals("circumference")){    //Calculates circumference
            double dCircumference = (dRadius * dRadius) * Math.PI;
            dCircumference = Math.round(dCircumference);
            System.out.println("The circumference of radius " + dRadius + " is about " + dCircumference);
        }
        sc.close();
    }
}
