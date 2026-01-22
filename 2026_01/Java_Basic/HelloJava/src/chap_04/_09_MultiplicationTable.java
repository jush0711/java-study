package chap_04;

import java.sql.SQLOutput;

public class _09_MultiplicationTable {
    public static void main(String[] args) {

        // 구구단
        for (int i = 2; i <= 14; i++) {
            for (int j = 1; j <= 9 ; j++) {
                System.out.println(i + " x " + j +" = "  + (i * j));

            }
            System.out.println();

        }


      // 이중 반복 안 했을 때

       /* System.out.println("-----------------");
        for (int i = 2 ; i < 9 ; i++) {

            int j = 1;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;
            System.out.println( i + " x " + j + "=" + ( i * j));
            j++;

            System.out.println();
        }

*/








    }
}
