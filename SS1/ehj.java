
public class ehj {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;       //Populates variables for the a b and c values
        double c = 1;

        System.out.format("The values for x are %1.2f and %1.2f", positive(a,b,c), negative(a,b,c)); //outputs result
        System.out.println("");
     
    }

    public static double positive(double a, double b, double c){        //Two methods are created for the positive and negative rotos
        return (-b + (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
    }

    public static double negative(double a, double b, double c){
        return (-b - (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
    }
}
