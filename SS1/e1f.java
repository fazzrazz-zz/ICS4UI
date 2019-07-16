
public class e1f {


    public static void main(String[] args) {
        int nRadius = 5;
        long lCircumference = java.lang.Math.round(2*nRadius*Math.PI); //Calculates circumference, needs to be a long for the function to work
        int nCircumference = java.lang.Math.round(lCircumference); //Rounds it to the nearest int
        System.out.println("The circumference of a circle with a radius of " + nRadius + " is around " + nCircumference);

    }
}
