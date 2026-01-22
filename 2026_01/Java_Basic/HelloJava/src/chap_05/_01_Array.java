package chap_05;

public class _01_Array {
    public static void main(String[] args) {
//        배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffee1 = "아이스아메리카노";
        String coffee2 = "카페모카";
        String coffee3 = "아이스티";
        String coffee4 = "바닐라라떼";

        System.out.println(coffee1 + " 한잔");
        System.out.println(coffee2 + " 한잔");
        System.out.println(coffee3 + " 한잔");
        System.out.println(coffee4 + " 한잔");
        System.out.println("주문완료");

        System.out.println("--------------------");
        //1번
//        String[] coffees = new String[]{"아이스아메리카노","카페모카","아이스티","바닐라라떼"};

        //2번
//        String coffees[] = new String[4];

        //3번
//        String[] coffees = new String[4];
      /*  coffees[0] = "아이스아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "아이스티";
        coffees[3] = "바닐라";*/


//        System.out.println(coffees[0]);
//        System.out.println(coffees[1]);
//        System.out.println(coffees[2]);
//        System.out.println(coffees[3]);
//        System.out.println("주문완료");


        // 4번
        String[] coffees = {"아이스아메리카노","카페모카","아이스티","바닐라라떼"};
        System.out.println(coffees[0]);
        System.out.println(coffees[1]);
//        coffees[2] = "바보";
        System.out.println(coffees[2]);
        System.out.println(coffees[3]);
        System.out.println("주문완료");







    }
}
