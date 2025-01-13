import java.util.*;
public class SumOfNatural{
	
	//Method to calculate the sum
    public static int sumOfNums(int num){
		int sum = 0;
        while(num != 0){
			sum = sum + num;
			num --;
		}
		return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking input of Number
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();


        //Printing Result
		int res = sumOfNums(num);
        System.out.println(res);
    }
}