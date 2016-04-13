package series;


import static series.serie1.Arrays.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("arrays....");
        int[] arr1 = { 2, 5, 8, 9, 10, 11, 12, 15 };
        int[] arr2 = { 2, 6 };

        removeIndexes(arr1, 0, arr1.length-1, arr2, 0, arr2.length-1);

        //int res = countEquals(arr1, 0, arr1.length-1, arr2, 0, arr2.length-1);
       // System.out.println("countEquals: "+res);
        //for(int i : arr1) System.out.print(i+" ");


    }
}
