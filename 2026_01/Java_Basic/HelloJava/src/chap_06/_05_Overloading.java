package chap_06;

public class _05_Overloading {

    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(String exp){
        int number = Integer.parseInt(exp);
        return number * number;
    }

    public static int getPower (int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }




    public static void main(String[] args) {

        // Method Overloading
        // 하나의 이름으로 여러 개의 Method를 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나


        System.out.println(getPower( 2));
        System.out.println(getPower( 2 , 3));
        System.out.println(getPower("3"));





    }
}
