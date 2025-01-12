import java.util.Scanner;
public class CheckingAge{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age[] = new int[10];
		
		//Taking input of students age
        for(int i=0;i<age.length;i++){
            age[i] = input.nextInt();
        }
		
		//Checking if student can vote or not
		for (int i = 0;i< age.length;i++){
            if(age[i] >= 18){
                System.out.println("The student of age "+ age[i] +"can vote");
            }else {
                System.out.println("The student of age "+ age[i] +"can not vote");
            }
        }
    }
}