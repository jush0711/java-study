package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼향 연산자 (조건 연산자)
        // 결과 = (조건) ? (조건이 참인 경우 나타나는 결과값) : (조건이 거짓인 경우 나타나는 결과값);
        int x = 5;
        int y = 3;
        int q = x > y ? x : y;

        System.out.println(q);

        String s = x > y ? "크다" : "작다";
        System.out.println(s);

        String s1 = x != y ? "다르다" : "같다";
        System.out.println(s1);





    }
}
