import java.util.*;

public class GradeOfStudents{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Taking input of a number
		System.out.println("Enter the number of students: ");
		int student = input.nextInt();
	
		int physics[] = new int[student];
		int chemistry[] = new int[student];
		int math[] = new int[student];
		
		//Taking marks of physics
		System.out.println("Enter the marks of physics: ");
		for(int i=0; i<student;i++){
			physics[i] = input.nextInt();
		}
		
		//Taking marks of chemistry
		System.out.println("Enter the marks of chemistry: ");
		for(int i=0; i<student;i++){
			chemistry[i] = input.nextInt();
		}
		
		//Taking marks of math
		System.out.println("Enter the marks of math: ");
		for(int i=0; i<student;i++){
			math[i] = input.nextInt();
		}
		

		float percentage[] = new float[student];
		char grade[] = new char[student];

		//Calculating percentage
		for(int i=0; i<student; i++) {
			percentage[i] = (physics[i] + chemistry[i] + math[i]) / 3.0f;
		}

		// Finding the Grades
		for(int i=0; i<student; i++) {
			if(percentage[i] >= 80) {
				grade[i] = 'A';
			} else if(percentage[i] >= 70) {
				grade[i] = 'B';
			} else if(percentage[i] >= 60) {
				grade[i] = 'C';
			} else if(percentage[i] >= 50) {
				grade[i] = 'D';
			} else if(percentage[i] >= 40) {
				grade[i] = 'E';
			} else {
				grade[i] = 'R';
			}
		}
	
		//Printing the result
		for(int i=0; i<student; i++) {
			System.out.println("Marks in physics is " + physics[i] + ", chemistry is " + chemistry[i] + " and maths is " + math[i] + ". Percentage is " + percentage[i] + " and Grade is " + grade[i]);
		}

	}
}