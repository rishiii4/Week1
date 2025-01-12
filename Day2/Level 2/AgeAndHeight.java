import java.util.Scanner;
public class AgeAndHeight{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking input of their Age 
        System.out.print("Enter Age of Amar: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Age of Akbar: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Age of Anthony: ");
        int anthonyAge = input.nextInt();

        //Taking input of their height
        System.out.print("Enter Height of Amar: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Height of Akbar: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Height of Anthony: ");
        int anthonyHeight = input.nextInt();

        if(amarAge < akbarAge && amarAge < anthonyAge ){
            System.out.println("Amar is Youngest");
        }else if(akbarAge < amarAge && akbarAge < anthonyAge){
            System.out.println("Akbar is Youngest");
        }else{
            System.out.println("Anthony is Youngest");
        }

        if(amarHeight > akbarHeight && amarHeight > anthonyHeight ){
            System.out.println("Amar is Tallest");
        }else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
            System.out.println("Akbar is Tallest");
        }else{
            System.out.println("Anthony is Tallest");

        }
	}
}