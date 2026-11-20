public class Task3 {
    public static void main(String[] args) {

        int[] a = {68, 44,21,97, 25,36};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double m =(sum / a.length);
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                c++;
            }
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ m);
        System.out.println("Numbers above average: " +c);
    }
}
