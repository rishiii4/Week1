import java.util.*;
public class DividingPens{
	public static void main(String args[]){
		
		//Total pens
		int pens = 14;
		
		//Total Students
		int students = 3;
		
		//Calculating No. of pens each student getting
		int studentsGetting = 14 / 3;
		
		//Calculating Remaining pens
		int remainingPens = 14 % 3;
		
		System.out.print("The Pen Per Student is " + studentsGetting + " and the remaining pen not distributed is " + remainingPens);
	}	
}