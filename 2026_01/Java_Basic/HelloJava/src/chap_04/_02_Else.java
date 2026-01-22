package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 16;
        if (hour < 14) {
            System.out.println("ice Americano +1");
        }
        else {
            System.out.println("decaf ice Americano");
        }
        System.out.println("주문 완#1");

        hour = 10;
        boolean morningCoffe = true;
        if (hour >= 14 || !morningCoffe){
            System.out.println("no ice americano");
        }
        else {
            System.out.println("ice Americano +1");
        }
        System.out.println("주문 완#2");



    }
}
