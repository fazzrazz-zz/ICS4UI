
public class ehi {

    public static void main(String[] args) {
        long dX1 = 1;
        long dY1 = 2;       //Populates variables
        long dX2 = 3;
        long dY2 = 5;
        
        int nWidth = java.lang.Math.round((dX2 - dX1));         //Calculates width
        int nHeight = java.lang.Math.round((dY2 - dY1));        //Calculates height
        
        int nArea = nWidth * nHeight;                   //Calculates area
        int nPerimeter = Math.abs((2*nWidth)+(2*nHeight));  //Calculates perimeter
        
        System.out.println("The area of the rectangle is " + nArea);            //outputs result
        System.out.println("The perimeter of the rectangle is " + nPerimeter);
    }
}
