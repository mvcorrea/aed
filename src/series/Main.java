package series;


import java.util.Arrays;

import static series.serie1.Arrays.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("arrays....");
        int[] arr1 = { 2, 5, 8, 9, 10, 11, 12, 15 };
        int[] arr2 = { 2, 6 };

        String[] arr3 = {"agendar", "dia", "teste", "coiso"};
        String str = "tes";

        System.out.println(Arrays.toString(arr3));
        System.out.println(str);
        System.out.println();
        System.out.println(greaterCommonPrefix(arr3,1,2,str));


        // test

        //removeIndexes(arr1, 0, arr1.length-1, arr2, 0, arr2.length-1);

        //int res = countEquals(arr1, 0, arr1.length-1, arr2, 0, arr2.length-1);
       // System.out.println("countEquals: "+res);
        //for(int i : arr1) System.out.print(i+" ");


    }
}
