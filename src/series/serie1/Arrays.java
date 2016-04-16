package series.serie1;

/**
 * Created by mvcorrea on 23/03/2016.
 */
public class Arrays {


    /*   public static int removeIndexes(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {
        int put = l1-1, get = l1;
        while (get <= r1) {
            int l = l2, r = r2;
            boolean found = false;
            while (l <= r && !found) {
                int mid = (l + r) / 2;
                if (v1[get] == v2[mid]){
                    found = true;
                } else {
                    if (v1[get] < v2[mid]){
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
            }
            if (!found){ v1[++put] = v1[get]; }
            get++;
        }
        return put + 1;
    }
    */

    public static int removeIndexes(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {

        int idx = 0;
        if(v1.length == 0) return 0;

        for(int i = v2[l2]; i <= v2[r2]; ++l2 ){
            if(v2.length == l2) break;
            v1[v2[l2]] = 0;
            System.out.println(i+" "+l2+" "+v2[l2]);
            System.out.println(java.util.Arrays.toString(v1));
        }
        return 0;
    }


     /*   public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {
        int count = 0;
        while (l1 <= r1 && l2 <= r2) {
            if (v1[l1] > v2[l2]) l2++;
            else if (v1[l1] < v2[l2]) l1++;
            else {
                count++;
                l1++;
                l2++;
            }
        }
        return count;
    }*/

    public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {
        int count = 0;

        for (int i = l1, j = l2; i < r1 || j < r2;){
            if (v1[i++] == v2[j]) {
                ++count;
            } else {
                ++j;
            }
        }
        return count;
    }







    public static String greaterCommonPrefix(String[] v, int l, int r, String word){

        return null;

    }

    public static  int[] getTheKElementsNearestX(int[] v, int l, int r, int x, int k){

        return null;

    }



}
