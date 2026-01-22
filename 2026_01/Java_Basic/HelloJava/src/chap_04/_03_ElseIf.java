package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

//        1순위 mangoJuice
//        2순위 appleJuice
//        3순위 iceAmericano

        boolean mangoJuice = false;
        boolean appleJuice = false;

        if (mangoJuice == true){
            System.out.println("mangoJuice +1");
        } else if (appleJuice){
            System.out.println("appleJuice +1");
        } else {
            System.out.println("ice Americano +1");
        }
        System.out.println("주문 완료 #1");


        // else If 반복 가능
        mangoJuice = false;
        appleJuice = true;
        boolean banana = true;

        if (mangoJuice){
            System.out.println("mangoJuice +1");
        } else if (appleJuice){
            System.out.println("appleJuice +1");
        } else if (banana){
            System.out.println("banana +1");
        } else {
            System.out.println("ice Americano");
        }
        System.out.println("주문 완료 #2");

        // 마지막 else는 없어도 됨
        mangoJuice = false;
        appleJuice = false;
        banana = false;

        if (mangoJuice){
            System.out.println("mangoJuice +1");
        } else if (appleJuice){
            System.out.println("appleJuice +1");
        } else if (banana){
            System.out.println("banana +1");
        }
        System.out.println("주문 완료 #3");

//      그렇지만 모두 false면 마지막 주문완료만 나타남

    }
}
