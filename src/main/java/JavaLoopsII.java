
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class JavaLoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            List<Integer>  series = generateSeries(a, b, n);
            printSeries(series);
        }
        in.close();
    }

    private static List<Integer>  generateSeries(int a, int b, int n){
        List<Integer> series = new ArrayList<Integer>();
        series.add(a +  (int)(Math.pow(2, 0)* b));
        for (int i = 1; i<n; i++) {
            series.add((((int)Math.pow(2, i)* b)) + series.get(i-1));
        }
        return series;
    }

    private static void printSeries(List<Integer> series){
        for (Integer num: series){
             System.out.print(num + " ");
        }
        System.out.print("\n");
    }

}
