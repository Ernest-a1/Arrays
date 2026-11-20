public class Task1 {
    public static void main(String[] args) {

        int[] a = {0, 1, -2,3,4, -5,-6,7,-8,9 };
        int n=0, p=0, z= 0;
        System.out.println("Arrays:");

        for (int i= 0; i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2] <0)
                n++;
            else if (a[i2] > 0)
                p++;
            else
                z++;
        }
        System.out.println("\nPositive: " + p);
        System.out.println("Negative: "+ n);
        System.out.println("Zero: " + z);
    }
}