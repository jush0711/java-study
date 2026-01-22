package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열
        // ex) 영화관 좌석  1차원 배열

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        System.out.println(seatA[1]);

        // 2차원 배열
        String[][] seatAll = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seatAll[0][1]);   // A2


        String[][] seat = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seat[2][4]);





    }
}
