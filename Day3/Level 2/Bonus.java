import java.util.*;

public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array declaration
        double salary[] = new double[10];
        int year[] = new int[10];

        //Taking input of salary of all employees
        System.out.println("Enter the salary of all 10 employees: ");
        for(int i=0; i<10; i++) {
            salary[i] = input.nextDouble();
        }

        //Taking input of year of working of all ten employees
        System.out.println("Enter the year of working: ");
        for(int i=0; i<10; i++) {
            year[i] = input.nextInt();
        }

        double bonus[] = new double[10];
        double newSalary[] = new double[10];

        // Finding Bonus
        for(int i=0; i<10; i++)  {
            if(year[i] > 5) {
                bonus[i] = salary[i] * 5.0 / 100;
            } else {
                bonus[i] = salary[i] * 2.0 / 100;
            }

            newSalary[i] = salary[i] + bonus[i];
        }

        // Printing the details of the employees
        for(int i=0; i<10; i++)  {
            System.out.println("Old Salary of employee is: " + salary[i] + " bonus is: " + bonus[i] + " and new salary is: " + newSalary[i]);
        }
    }
}