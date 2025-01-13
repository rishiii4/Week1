import java.util.Random;
public class RandomArrayStats{

    //Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        for (int i=0;i<size;i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // Generates 4-digit numbers (1000 to 9999)
        }
        return numbers;
    }

    //Method to find average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++) {
            int num = numbers[i];
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated Numbers:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }

        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
