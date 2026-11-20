import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int[] scores = new int[5];

        int pass = 0;
        int fail = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");
            int score = s1.nextInt();

            if (score < 0 || score > 100) {
                System.out.print("Invalid score! Enter again: ");
            }
            scores[i] = score;
            sum += score;
             if (score >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        double a = ( sum / scores.length);
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println("\nPassed: " + pass);
        System.out.println("Failed: " + fail);
        System.out.println("Average: " + a);
    }
}