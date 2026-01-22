package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {

        // 다차원 배열의 순회

        String[][] seats1 = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------");


        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");

        // 세로열 10 가로열 15

        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B", "C", "D", "E", "F", "G", "H", "I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j+1);
            }
        }


        seats3[7][8] = "--";
        seats3[7][9] = "--";

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");

            }
            System.out.println();
        }


        // 가로축 15 세로축 20 영화관 좌석
        System.out.println("----------------");

        String[][] seatsEx = new String[15][20];
        String[] engEx = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"};
        for (int i = 0; i < seatsEx.length ; i++) {
            for (int j = 0; j < seatsEx[i].length ; j++) {
                seatsEx[i][j] = engEx[i] + ( j + 1 );
                System.out.print(seatsEx[i][j] + " ");

            }
            System.out.println();

        }
/*

        for (int i = 0; i < seatsEx.length ; i++) {
            for (int j = 0; j < seatsEx[i].length ; j++) {
                System.out.print(seatsEx[i][j] + " ");
            }
            System.out.println();
        }
*/














    }
}
