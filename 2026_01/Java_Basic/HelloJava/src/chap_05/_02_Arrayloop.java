package chap_05;

public class _02_Arrayloop {
    public static void main(String[] args) {

        // 배열의 순회
        String[] coffees = {"아이스아메리카노","카페모카","아이스티","바닐라라떼"};

        // for 반복문 사용
        for (int i = 0; i < 4 ; i++) {
            System.out.println(coffees[i]);

        }
        System.out.println("주세요");

        System.out.println("--------------");

        //배열의 길이를 활용한 순회
        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i]);
        }
        System.out.println("주세요");


        System.out.println("--------------");

        //for - each 반복문 사용

        for (String coffee : coffees){
            System.out.println(coffee);
        }
        System.out.println("주세요");





    }
}
