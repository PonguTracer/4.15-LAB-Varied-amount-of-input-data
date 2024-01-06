import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break; // Stop if the number is negative
            }
            max = Math.max(max, number); // Update max if the current number is larger
            sum += number;               // Add the current number to sum
            count++;                     // Increment the count of numbers
        }
        double average = (double) sum / count; // Calculate the average
        System.out.println(max + " " + String.format("%.2f", average));
   }
}
