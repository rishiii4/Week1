import java.util.*;
public class FindFactors{
	//Method to find the factors of number
    public static int[] findFactors(int number){

    int count = 0;
		for(int i=1;i<=number;i++){
        if(number % i ==0){
            count++;
        }
    }
    // Initialize an array of size 'count'
    int factors[] = new int[count];
    int index = 0;

    // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            factors[index] = i;
            index++;
        }
    }
        return factors;
    }
    //Method to calculate the sum of factors
    public static int sumOfFactors(int factors[]){
        int sum = 0;
        for (int i=0;i<factors.length;i++){
            sum += factors[i];
        }
        return sum;
    }
    //Method to calculate the product of factors
    public static int productOfFactors(int factors[]){
        int product = 1;
        for (int i=0;i<factors.length;i++){
            product *= factors[i];
        }
        return product;
    }

    //Method to calculate the sum of square of factors
    public static int sumOfSquare(int factors[]){
        int sumSquare = 0;
        for (int i=0;i<factors.length;i++){
            sumSquare += Math.pow(factors[i], 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of a Number
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        int factors[] = findFactors(number);
        
        //Printing Factors
        System.out.print("Factors : ");
        for (int i=0;i<factors.length;i++){
            System.out.print(factors[i]+ " ");
        }
        System.out.println();
        //Printing Sum, Product and Sum of Square
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquare(factors);

        System.out.println("Sum of factors is "+ sum + " Product of factor is "+ product + " Sum of Square is "+sumOfSquares);

    }
}