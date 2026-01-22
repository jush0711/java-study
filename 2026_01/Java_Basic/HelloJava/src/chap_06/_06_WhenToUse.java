package chap_06;

public class _06_WhenToUse {

   /* public static int getPower(int number){
        int result = number * number;
        return result;
    }*/

    public static int getPower (int number){
        return getPower(number, 2);
    }

    public static int getPower(int number, int ponent){
        int result = 1;
        for (int i = 0; i < ponent; i++) {
            result *= number;
        }
        return result;
    }




    public static void main(String[] args) {

        // 2의 2승
        System.out.println(getPower(2,2));
        System.out.println(getPower(2));
        // 3의 3승
        System.out.println(getPower(3,3));
        // 4의 2승
        System.out.println(getPower(4,2));
        System.out.println(getPower(4));

    }
}
