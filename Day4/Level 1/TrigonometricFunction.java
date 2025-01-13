import java.util*;
public class TrigonometricFunction {
	public static double[] calculateTrigonometricFunctions(double angle) {

        double output[] = new double[3];
        //Converting angle to radians
        double radians = Math.toRadians(angle);
        //Calculating sin, cos and tan
        output[0] = Math.sin(radians);
        output[1] = Math.cos(radians);
        output[2] = Math.tan(radians);

        return output;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking input of Angle
        System.out.println("Enter Angle ");
        double angle = input.nextDouble();

        //Calculating various trigonometric functions
        double trigonometricValues[] = calculateTrigonometricFunctions(angle);


        //Printing the TrigonometricValues
        System.out.println("Value of Sin is "+ trigonometricValues[0]+
                " Value of Cos is "+ trigonometricValues[1]+
                " Value of Tan is "+ trigonometricValues[2]);


    }
}