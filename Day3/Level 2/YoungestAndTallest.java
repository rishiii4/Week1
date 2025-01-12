import java.util.*;

public class YoungestAndTallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age[] = new int[3];
		int height[] = new int[3];
		
		//Taking input of their age
		System.out.println("Enter Age of Amar, Akbar and Anthony:");
		for(int i=0;i<age.length;i++){
			age[i] = input.nextInt();
		}
		
		//Taking input of their Height
		System.out.println("Enter Height of Amar, Akbar and Anthony:");
		for(int i=0;i<age.length;i++){
			height[i] = input.nextInt();
		}
		
		//Checking their Age
		if(age[0] < age[1] && age[0] < age[2]){
			System.out.println("Amar is Youngest");
		}else if(age[1] < age[0] && age[1] < age[2]){
			System.out.println("Akbar is Youngest");
		}else{
			System.out.println("Anthony is Youngest");
		}
		
		//Checking their Height
		if(height[0] > height[1] && height[0] > height[2]){
			System.out.println("Amar is Tallest");
		}else if(height[1] > height[0] && height[1] > height[2]){
			System.out.println("Akbar is Tallest");
		}else{
			System.out.println("Anthony is Tallest");
		}
		
    }
}