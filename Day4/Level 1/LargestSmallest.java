import java.util.*;
public class LargestSmallest{
	
	//Method to Get largest or smallest
    public static int[] findSmallestAndLargest(int num1, int num2, int num3){
        int largest = 0, smallest = 0;
        if(num1 > num2 && num1 > num3){
            largest = num1;
        }else if( num2 > num3){
            largest = num2;
        }else{
            largest = num3;
        }
        if(num1 < num2 && num1 < num3){
            smallest = num1;
        }else if( num2 < num3){
            smallest = num2;
        }else{
            smallest = num3;
        }
        int out[] = new int[2];
        out[0] = largest;
        out[1] = smallest;
        return out;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking input of Number
        System.out.println("Enter a Number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter a Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter a Number 3: ");
        int num3 = sc.nextInt();

        int ans[] = findSmallestAndLargest(num1, num2, num3);

        //Printing Result

        System.out.println("Largest is "+ans[0]);
        System.out.println("Smallest is "+ans[1]);
    }
}