
public class e1h {

    public static void main(String[] args) {
        double dX1 = 3; //Populates coordinate variables
        double dY1 = 4;
        double dX2 = 1;
        double dY2 = 2;
        double dSlope = (dX2 - dX1)/(dY2-dY1);
        double dDistance = Math.sqrt((Math.pow((dX2 - dX1),2)+ Math.pow((dY2 - dY1),2)));
        System.out.format("Using (%1.0f,%1.0f) and (%1.0f,%1.0f) ",dX1,dY1,dX2,dY2 );       //Rounds to one decimal point
        System.out.format("The slope is %1.0f and the distance is %1.0f", dSlope, dDistance);
        System.out.println(""); //Added so the "build successful' isn't immediately added to the end
           
    }
}
