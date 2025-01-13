import java.util.*;
public class HeightOfPlayer{

	//Method to calculate sum
    public static int sumOfHeight(int heights[]){
        int sum = 0;
        for (int i=0;i<heights.length;i++){
            sum += heights[i];
        }
        return sum;
    }
    //Method to calculate Mean
    public static int meanOfHeight(int heights[]){
        int mean = sumOfHeight(heights) / 11;
        return mean;
    }
    //Method to find Shortest player 
    public static int shortestHeight(int heights[]){
        int shortest = Integer.MAX_VALUE;
        for (int i=0;i<heights.length;i++){
            if(shortest > heights[i]){
                shortest = heights[i];
            }
        }
        return shortest;
    }
    //Method to find Tallest player
    public static int tallestHeight(int heights[]){
        int tallest = Integer.MIN_VALUE;
        for (int i=0;i<heights.length;i++){
            if(tallest < heights[i]){
                tallest = heights[i];
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heights[] = new int[11];
        //Taking input of heights of players
        System.out.println("Enter Height in cms (150 - 250 cm:)");
        for (int i=0;i<heights.length;i++){
            heights[i] = input.nextInt();
        }
        //
        int shortestPlayer = shortestHeight(heights);
        int tallestPlayer = tallestHeight(heights);
        int sumOfHeights = sumOfHeight(heights);
        int meanOfPlayer = meanOfHeight(heights);

        //Printing Result
        System.out.println("Shortest Player is "+shortestPlayer);
        System.out.println("Tallest Player is "+tallestPlayer);
        System.out.println("Mean of Player is "+meanOfPlayer);
    }
}