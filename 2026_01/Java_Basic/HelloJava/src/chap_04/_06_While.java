package chap_04;

public class _06_While {
    public static void main(String[] args) {
        int 총거리 = 25;
        int 현재이동거리 = 0;
        while (현재이동거리 < 총거리){
            System.out.println("계속 이동하세요");
            System.out.println("현재 이동거리는 " + 현재이동거리 + "m 입니다");
            현재이동거리 += 4;

        }
        System.out.println("도착!");


    }
}
