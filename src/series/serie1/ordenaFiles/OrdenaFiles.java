package series.serie1.ordenaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by mvcorrea on 16/04/2016.
 *
 * generate sorted text files column 80 break
 * base64 /dev/urandom | head -c 1000000 | fold -w 80 | sort > file.txt
 */

public class OrdenaFiles {
    public static void main(String[] args) {

    }

    public static void ordena(String file1, String file2){
        Scanner scan1 = new Scanner(new File(file1));
        Scanner scan2 = new Scanner(new File(file2));
        while(scan1.hasNextLine() || scan2.hasNextLine()){
            String l1 = scan1.nextLine();
            String l2 = scan2.nextLine();
            return (l1.compareTo(l2) > 0) ? System.out.println(l1) : System.out.println(l2);
        }
    }



}
