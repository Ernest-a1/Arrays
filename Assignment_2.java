public class Assignment_2 {
    public static void main(String[] args){

        ///Task 1
//        //Create an array of 8 integers. Print values at indices 0, 2, 4, and 6.
//
//        int [] a = {23,65,2,7,45,8,43,23};
//        System.out.println(a[0]+ " "+ a[2]+ " "+a[4]+" "+a[6]);
//
        /// Task 2
//      //Create an array of 10 integers. Calculate the sum of values greater than zero.
//        int [] b = {23,-32, 65,-2,7,-8,45,8,-43,23};
//        int sum=0;
//        for(int i = 0; i< a.length; i++){
//            if (b[i]> 0)
//                sum+=b[i];
//        }
//        System.out.println("Sum: "+ sum);
//
        ///Task 3
//        //Ask for 8 integers and store them in an array. Count values from 10 to 20 inclusive.
//
//        // int [] a = {23,65,2,7,45,8,43,23};
//        int count = 0;
//        for(int i = 0; i< a.length; i++){
//            if (a[i]> 0)
//                count++;
//        }
//        System.out.println("Count: " + count);
//
        ///Task 4
//        //Create an array of 7 integers. Print the smallest value and the index of its first occurrence.
//
//       // int [] a = {23,65,2,7,45,8,43,23};
//
//        int min =0;
//        int index=0;
//        for(int i = 0; i< a.length; i ++){
//            if(a[i]>min){
//                min=a[i];
//                index=i;
//            }
//        }
//        System.out.println("Min: "+ min +" Index: "+ index);
//
        ///Task5
//        //Create an array of 6 integers. Increase every element by 5, then print the modified array.
//
//       // int [] a = {23,65,2,7,45,8,43,23};
//        System.out.println("BEFORE: ");
//        for(int i=0; i<a.length; i++){
//            System.out.print( a[i]+" ");
//        }
//        System.out.println("\nAFTER: ");
//        for(int i=0; i<a.length; i++){
//            a[i]-=5;
//            System.out.print(a[i]+" ");
//        }
//
        ///Task 6
//        //Create an array of 8 integers. Count how many later elements are greater than the first.
//
//        // int [] a = {23,65,2,7,45,8,43,23};
//        int c=0;
//        for(int i=0; i<a.length; i++){
//            if(a[i]>a[0])
//                c++;
//        } System.out.println("\nCount: "+c);
//
        ///task 7
//
//        //Create an array of 8 integers. Copy even values into a second array and print only copied entries.
//
//        int [] l = {23,65,2,7,45,8,43,23};
//        int co=0;
//        System.out.println("BEFORE:");
//        for(int i=0; i<l.length; i++){
//            if(l[i]%2==0)
//                co++;
//            System.out.print(l[i]+" ");
//        }
//        int p= 0;
//        int[] d= new int[co];
//        System.out.println("\nAFTER:");
//        for(int i=0; i< l.length; i++){
//            if(l[i]%2==0) {
//                d[p] = l[i];
//                System.out.print(d[p] + " ");
//                p++;
//            }
//        }

        ///Task 8
       ///Store 7 daily temperatures. Print the average and the number of days above the average.

//        int [] t = {18,20,22,19,21,24,16};
//        int count=0;
//        int sum=0;
//        int above=0;
//        for(int i = 0 ; i <t.length; i++){
//            sum+=t[i];
//            count++;
//        }
//        for(int i = 0 ; i <t.length; i++){
//           if(t[i]>(sum/count))
//               above++;
//        }
//        System.out.println("Average: "+ (sum/count)+" Above: "+ above);

        ///9
        //Create a 2×3 integer matrix and print its values in two rows.
//        int[][] a = {
//            {1,2,3},
//            {4,5,6}
//        };
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("|");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(" "+a[i][j] + " ");
//            }
//            System.out.println("|");
//        }

        ///task10
        //Create a 3×3 integer matrix. Count zeros and print the count.
        //Example: {{0,2,3},{4,0,6},{0,8,0}}  ->  Zeros: 4

        int [][ ] a = {
                {0,2,3},
                {4,0,6},
                {0,8,0}
        };
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               if(a[i][j]==0)
                   c++;
            }

        }
        System.out.println("Count: "+ c);

    }
}
