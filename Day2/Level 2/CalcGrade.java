import java.util.*;

public class CalcGrade{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking Input of physics marks
        System.out.print("Enter physics marks:");
        int physics = sc.nextInt();
		
		//Taking Input of Chemistry marks
        System.out.print("Enter chemistry marks:");
        int chemistry = sc.nextInt();
		
		//Taking Input of Maths marks
        System.out.print("Enter maths marks:");
        int maths = sc.nextInt();
		
		//calculating percentage
		float percentage = (physics + chemistry + maths) / 3f;
		
		if(percentage >= 80){
			System.out.println("Level 4, above agency-normalized standards");
		}else if(percentage >= 70 || percentage <= 79){
			System.out.println("Level 3, at agency-normalized standards");
		}else if(percentage >= 60 || percentage <= 69){
			System.out.println("Level 2, but approaching agency-normalized standards");
		}else if(percentage >= 50 || percentage <= 59){
			System.out.println("Level 1, well below agency-normalized standards");
		}else if(percentage >= 40 || percentage <= 49){
			System.out.println("Level 1, too below agency-normalized standards");
		}else{
			System.out.println("Remedial standards");
		}
		
		
    }
}