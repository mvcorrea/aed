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
        int lenV1 = r1 - l1 + 1;
        if(v1.length == 0) return 0;
        if(v2.length == 0) return v1.length;

        for (int i = l2; i<=r2; ++i) {
            if((v2[i] >= l1 && v2[i] <= r1)) {
                --lenV1;
            }
        }

        // only needed to show the array !!!
        int[] out = new int[v1.length];
        for(int x = l1, y = l2, z = 0; x <= r1; ++x){
            if( v2[l2] != x ){
                out[z++] = v1[x];
            }else{
                if( y < r2 ) y++;
                continue;
            }
        }

        //System.out.println(java.util.Arrays.toString(out));

        return lenV1;
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

    public static int countEqualsv1(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {
        int count = 0;

        for (int i =l1,j=l2; i <= r1 && j<=r2; ){
            if (v1[i] < v2[j]) ++i;
            else if (v1[i] == v2[j]){
                ++count;
                ++i;
                 ++j;}
            else if (v1[i] > v2[j]) ++j;

            /*else if (v1[i] == v2[j]) {
                ++count;
                ++i;
                ++j;
            }*/
        }
        return count;
    }


    public static String greaterCommonPrefix(String[] v, int l, int r, String word) {
        if(v.length == 0) return null;
        String output = "", strV = "";
        for(int x = l; x <= r; ++x){ // cycle every word@v
            if(v[x].length() == 0) continue;
            strV = v[x];
            if(strV.charAt(0) == word.charAt(0)) output = strV; // if found @start
        }
        return (output != "") ? output : strV;
    }


    public static int countEquals(int[] v1, int l1, int r1, int[] v2, int l2, int r2) {
        int mid = l2 + (r2 - l2) / 2;
        int count = 0;

        for (int i = l1;i<=r1;++i) {
            if (v1[i] >= mid) {
                for (int j = mid; j <=r2; ++j) {
                    if (v1[i] == v2[j]) ++count;
                }
            }
            else {
                for (int j = l2; j < mid; ++j) {
                    if (v1[i] == v2[j]) ++count;
                }

            }
        }
        return count;
    }


    public static  int[] getTheKElementsNearestX(int[] v, int l, int r, int x, int k) {

        if (r <= k) return v;
        if (k > r || r < 0) return new int[0];

        int[] a = new int[k];
        int t=0, f=0, tras, frente, s = 0;
        while (s < k) {
            for (int i = l; i < r-1; ++i) {

                if (v[i] == x) {
                    if (i > l)
                        t = i - 1;
                    if (i <r)
                        f = i + 1;
                    frente = v[f] - x;
                    tras = x - v[t];

                    if (tras > frente) {
                        a[s++] = frente;
                        ++f;
                    } else {
                        a[s++] = tras;
                        ++t;
                    }
                }

            }
            s=x;
        }
        return a;
    }



      /*int ifrente=0,itras=0,t=0,s=0,f=0;


        while(s<k){
        for(int i=l=t=f;i<r&&f<r&&t<r;++i){

            if(a[i]==x) {
                if(t>l&&f<r) {
                    itras = x - v[t - 1];
                    ifrente = v[f + 1] - x;


                    if (itras > ifrente) {
                        a[s++] = ifrente;
                        if (f < r)
                            ++f;
                    } else
                        a[s++] = itras;
                    if (t > l)
                        ++t;
                }
                if(t<l&&f<r){
                    a[s++] = ifrente;
                    if (f < r)
                        ++f;

                }
                if(t>l&&f<r){
                    a[s++] = itras;
                    if (t > l)
                        ++t;
                }
            }
            else{
                --f;++t;}
            }

        }*/






}
