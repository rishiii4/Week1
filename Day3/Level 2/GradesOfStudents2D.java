import java.util.*;

public class GradeOfStudents2D{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Taking input of a number
		System.out.println("Enter the number of students: ");
		int student = input.nextInt();
	
		// Array declaration
		int marksOfStudent[][] = new int[student][3];
		
		//Taking marks of physics, chemistry and math in 2D array
		System.out.println("Enter the marks of physics, chemistry and math order of each student: ");
		for(int i=0; i<student; i++) {
			for(int j=0; j<3; j++)  {
				marksOfStudent[i][j] = input.nextInt();
			}
		}

		float percentage[] = new float[student];
		char grade[] = new char[student];

		//Calculating percentage
		for(int i=0; i<student; i++) {
			int total =  0;
			for(int j=0; j<3; j++)  {
				total += marksOfStudent[i][j];
			}

			percentage[i] = total / 3.0f;
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
			System.out.print("Student's marks in");
			for(int j=0; j<3; j++)  {
				if(j == 0) {
					System.out.print(" physics " + marksOfStudent[i][j]);
				} else if(j == 1) {
					System.out.print("  math " + marksOfStudent[i][j]);
				} else {
					System.out.print(" chemistry " + marksOfStudent[i][j]);
				}
			}

			System.out.println(" and percentage is " + percentage[i] + " and grade is " + grade[i]);
		}

	}
}