import java.util.Scanner;

public class cw {
    public static void main(String[] args) {
       /// practice 1
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//       for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(a[i][j]+ " ");
//           }
//           System.out.println("|");
//       }

       ///practice 2
// //       int[][] a = {
//                {5, 10 , 15},
//                {20, 25, 30}
//        };
//        System.out.println(a[1][2]);
//        a[0][1]=99;
//        for ( int i = 0 ; i< a.length; i++) {
//            System.out.print("|");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println("|");
//        }
//

       ///practice 3
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int sum = 0;
//       for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(a[i][j]+ " ");
//               sum+=a[i][j];
//           }
//           System.out.println("|");
//       }
//        System.out.println("sum: "+sum);


///         practice 4
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int odd=0, even= 0;
//       for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(a[i][j]+ " ");
//               if(a[i][j]%2==0)
//               even++;
//               else
//                   odd++;
//           }
//           System.out.println("|");
//       }
//        System.out.println("odd: " + odd);
//        System.out.println("even: "+even);
//

        /// practice 5
//        int[][] a = {
//                {1, 2, 3,10},
//                {4, 5, 6,11},
//                {7, 8, 9,12}
//        };
//        int max = a[0][0];
//        int min =a[0][0];
//       for ( int i = 0 ; i< a.length; i++){
//           for(int j = 0 ; j< a[i].length; j++){
//               if (a[i][j] > max) {
//                   max = a[i][j];
//               }
//               if (a[i][j] < min) {
//                   min = a[i][j];
//               }
//           }
//      }
//        System.out.println("max"+ max);
//        System.out.println("min" + min);
 //// practice 6
//        int[][] a = new int[2][3];
        Scanner s1 = new Scanner(System.in);
//        for(int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length;j++){
//                System.out.print("Enter number: ");
//                a[i][j]= s1.nextInt();
//            }
//        }
//        System.out.println("result:");
//        for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(a[i][j]+ " ");
//           }
//           System.out.println("|");
//       }

        //// practice 7
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//       for ( int i = 0 ; i< a.length; i++){
//           int c = 0;
//           for(int j = 0 ; j< a[i].length; j++){
//               c+=a[j][i];
//           }
//           System.out.println("Sum of column " + (i+1)+ " : " + c);
//       }
        //// practice 8
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int m =0;
//        System.out.println("Enter number: ");
//        int n = s1.nextInt();
//       for ( int i = 0 ; i< a.length; i++){
//           for(int j = 0 ; j< a[i].length; j++){
//               if(n<a[i][j])
//                   m++;
//           }
//       }
//        System.out.println("count: " + m);


////       practice 9


//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int t=5;
//        for ( int i = 0 ; i< a.length; i++){
//           for(int j = 0 ; j< a[i].length; j++){
//               if(t==a[i][j]){
//                   System.out.println("Collum: "+ j + " Row: " +i);
//                   return;
//               }
//           }
//        }
//        System.out.println("not found" );

        /// practice 10

//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//               for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               if(i==j)
//               System.out.print(" "+a[i][j]+ " ");
//               else
//                   System.out.print(" - ");
//           }
//           System.out.println("|");
//       }
//        int sum= 0;
//        for ( int i = 0 ; i< a.length; i++){
//           for(int j = 0 ; j< a[i].length; j++){
//               if(i==j){
//                   sum+=a[i][j];
//               }
//           }
//        }
//        System.out.print("\nSum: "+ sum);

        /// practice 11

//                int[][] a = {
//                {1, -2, 3},
//                {4, 5, -6},
//                {-7, 8, 9}
//        };
//        System.out.println("BEFORE: ");
//               for ( int i = 0 ; i< a.length; i++){
//           System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(" "+a[i][j]+ " ");
//           }
//           System.out.println("|");
//       }
//        System.out.println("\nAFTER: ");
//        for ( int i = 0 ; i< a.length; i++){
//            System.out.print("|");
//           for(int j = 0 ; j< a[i].length; j++){
//               if(a[i][j]<0)
//                   a[i][j]=0;
//               System.out.print(" "+a[i][j]+ " ");;
//           } System.out.println("|");
//        }

        /// practice 12

//        int [][] a ={
//            {89,90,95,85},
//            {80,86,94,90},
//            {88,93,96,80}
//        };
//        int c =0, sum = 0;
//
//        for ( int i = 0 ; i< a.length; i++){
//           System.out.print("Student "+(i+1)+" :");
//           for(int j = 0 ; j< a[i].length; j++){
//               System.out.print(" "+a[i][j]+ " ");
//               c++;
//               sum+= a[i][j];
//           }
//           System.out.println(" ");
//       }
//        int max = a[0][0];
//        int min =a[0][0];
//       for ( int i = 0 ; i< a.length; i++) {
//           for (int j = 0; j < a[i].length; j++) {
//               if (a[i][j] > max) {
//                   max = a[i][j];
//               }
//               if (a[i][j] < min) {
//                   min = a[i][j];
//               }
//           }
//       }
//       double d= sum/c;
//        System.out.println("Class maximum: " + max);
//        System.out.println("Class minimum: "+ min);
//        System.out.println("Overall average: "+ d);

        ///Find which row of a 3×4 matrix has the largest sum.
        /// practice A

//        int[][] a = {
//                {89, 90, 95, 85},
//                {80, 86, 94, 90},
//                {88, 93, 96, 80}
//        };
//        int l = 0;
//        int maxI = 0;
//        for (int i = 0; i < a.length; i++) {
//            int sum=0;
//            for (int j = 0; j < a[i].length; j++) {
//                sum += a[i][j];
//            }
//            System.out.println("Sum of row "+ (i+1)+ " : " + sum  );
//            if(l<sum){
//                l=sum;
//                maxI = i;
//            }
//
//        }
//        System.out.println("Largest: "+l + ", Row: "+(maxI+1));

        /// practice B
        //Turn a 2×3 matrix into a new 3×2 matrix.

//
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        System.out.println("BEFORE: ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("|");
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(" " + a[i][j] + " ");
//            }
//            System.out.println("|");
//        }
//        int [][] b= new int[3][2];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                b[j][i]=a[i][j];
//            }
//        }
//        System.out.println("\nAFTER: ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print("|");
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.print(" " + b[i][j] + " ");
//            }
//            System.out.println("|");
//        }

        /// practice C


        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] b = {
                {12, 11, 10},
                {9, 8, 7}
        };
        int [] [] s = new int[2][3];
        System.out.println("BEFORE: ");
        System.out.println("A :");
               for ( int i = 0 ; i< a.length; i++) {
                   System.out.print("|");
                   for (int j = 0; j < a[i].length; j++) {
                       System.out.print(" " + a[i][j] + " ");
                   }
                   System.out.println("|");
               }
        System.out.println("B: ");
        for ( int i = 0 ; i< a.length; i++) {
            System.out.print("|");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + b[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("AFTER: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("|");
            for (int j = 0; j < a[i].length; j++) {
                s[i][j] = (b[i][j]+a[i][j]);
                System.out.print(" " +s[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
