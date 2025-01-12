import java.util.Scanner;
public class MeanOfPlayers{

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double heightOfPlayers[] = new double[11];

            for(int i = 0; i<heightOfPlayers.length;i++){
                heightOfPlayers[i] = input.nextDouble();
            }

            double sum = 0.0;
            for (int i =0; i<heightOfPlayers.length;i++){
                sum += heightOfPlayers[i] ;
            }

            double mean = sum / heightOfPlayers.length;

            System.out.println(mean);


    }
}