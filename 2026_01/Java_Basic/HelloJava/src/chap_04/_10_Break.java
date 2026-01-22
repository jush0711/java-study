package chap_04;

import java.lang.module.FindException;

public class _10_Break {
    public static void main(String[] args) {

        int max = 20;
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 먹고싶다..");
            if ( i == max){
                System.out.println("금일 치킨 소진");
            break;
            }

        }

        System.out.println("------------------");


        int index = 1;
        while (index < 50){
            System.out.println(index + "번 손님 치킨 주문 되었습니다");
            if (index == 20){
                System.out.println("금일 치킨 소진 되었..");
                break;
            }
            index++;
        }







    }
}
