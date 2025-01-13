import java.util.*;
public class StudentVoteChecker{

	//Method to check student age
    public static boolean canStudentVote(int age){
        if(age >= 18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Array Declaration of size 10
        int students[] = new int[10];
        //Loop to take the input of students age
        System.out.println("Enter the Age of Students:");
        for (int i = 0;i< students.length;i++){
            students[i] = input.nextInt();
        }

        //Loop to check if student can vote or not
        for (int i=0;i< students.length;i++){
            if (canStudentVote(students[i])) {
                System.out.println(students[i]+" can Vote");
            }else {
                System.out.println(students[i]+" cannot vote");
            }
        }

    }
}