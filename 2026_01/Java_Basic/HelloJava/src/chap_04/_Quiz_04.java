package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
//        주차요금은 ㅅ시간당 4000원 일일최대 30000
//        경차 또는 장애인 차량은 요금의 50프로 할인
//        주차요금 예시
//        일반차량 5시간 주차시 20000원
//        경차 5시간 주차시 10000원
//        장애인 차량 10시간 주차 시 15000원
//

        int hour = 5;
        boolean 경차 = true;
        boolean 장애인우대 = false;
        int fee = hour * 4000;

        if (fee > 30000){
            fee = 30000;
        }

        if (경차 || 장애인우대){
            fee /= 2;
        }
        System.out.println("주차요금은 " + fee + "원 입니다.");








    }
}
