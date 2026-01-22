package chap_04;

public class _06_DoWhile {
    public static void main(String[] args) {

        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance) {
            System.out.println("계속 움직이세요");
            System.out.println("현재 이동거리는 " + move);
            move += 3;
        }
        System.out.println("도착!");


        System.out.println(":llLL:L::");

        move = 0;
        height = 25;
        while (move + height < distance){
            System.out.println("계속 움직이세요");
            System.out.println("현재 이동거리는 " + move);
            move += 3;
        }
        System.out.println("도착!");

        System.out.println(":llLL:L::");

//        DoWhile
        do {
            System.out.println("계속 움직이세요");
            System.out.println("현재 이동거리는 " + move);
            move += 3;
        }while (move + height < distance);
        System.out.println("도착!");
    }
}
