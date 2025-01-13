import java.util.*;
public class Quadratic{

    //create method to find the roots
    public static double[] findRoots(double a, double b, double c) {

        //find the discriminant as form of delta
        double delta = Math.pow(b, 2) - 4 * a * c;


        //check the roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        else if (delta == 0)
        {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number a: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number b: ");
        double b = input.nextDouble();
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();

        //create the array to find the real roots
        double[] roots = findRoots(a, b, c);


        //check the roots values and their solution
        if (roots.length == 2) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
        else if (roots.length == 1) {
            System.out.println("Root: " + roots[0]);
        }
        else {
            System.out.println("No real roots");
        }
    }
}

