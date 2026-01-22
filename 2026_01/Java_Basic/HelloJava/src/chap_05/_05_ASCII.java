package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드를 활요한 영화관 좌석

        String[][] seats = new String[10][15];
        char eng = 'A' ;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = String.valueOf(eng) + (j + 1);
                System.out.print(seats[i][j] + " ");
            }
            eng++;
            System.out.println();
        }





    }



}
