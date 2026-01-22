package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean Q1 = true;
        boolean Q2 = false;
        boolean Q3 = false;

        System.out.println(Q1 || Q2 || Q3); // or 대신해서 ||


        boolean Q4 = true;
        boolean Q5 = true;
        boolean Q6 = true;

        System.out.println(Q4 && Q5 && Q6);// and 대신해서 &&

        // 연산으로 논리 연산자
        System.out.println((5 > 3) && (3 > 2));
        System.out.println((5 > 3) && (3 < 2)); // 모두 참이여야 true가 나옴

        System.out.println((5 > 3) || (3 < 2)); // 하나라도 참이면 true


        System.out.println(5 > 3 || 3 < 2); //괄호가 없어도 가능

        //논리 부정연산자
        System.out.println(!true);

        System.out.println(!(5 > 3));
        System.out.println(!(5 != 5));








    }
}
