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
            max = Math.max(max, number);
            sum += number;
            count++;
        }
        double average = (double) sum / count;
        System.out.println(max + " " + String.format("%.2f", average));
   }
}
