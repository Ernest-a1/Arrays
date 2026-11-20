public class Task4 {
    public static void main(String[] args) {

        int[] a = {67, 47, 23, 98, 35, 22,45};
        System.out.print("Original: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nReversed: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}