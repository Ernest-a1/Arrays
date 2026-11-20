public class Task2 {
    public static void main(String[] args) {
        int[] a = {6, 78 ,45 ,23, 68, 12,98, 45};
        int max = a[0];
        int min =a[0];
        int maxI =0;
        int minI= 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxI = i;
            }
            if (a[i] < min) {
                min = a[i];
                minI = i;
            }
        }
        System.out.println("Largest: "+ max+" at index "+ maxI);
        System.out.println("Smallest: "+ min +" at index "+ minI);
    }
}