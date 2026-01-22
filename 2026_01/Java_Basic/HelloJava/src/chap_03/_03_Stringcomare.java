package chap_03;

public class _03_Stringcomare {
    public static void main(String[] args) {
        // 문자열 비교
         String s1 = "Java";
         String s2 = "Python";
         String s3 = "java";
         String s4 = "Java";


         System.out.println(s1.equals("s2")); // equals -> 조건 내용과 괄호 안에 내용이 같다면 true | false
         System.out.println(s1.equals(s3));   // equals 은 대 소문자도 구분함
        System.out.println(s1.equalsIgnoreCase(s3));// equalsIgnoreCase 대소문자 관계 없이 동일한지만 구분
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);         // equals 을 ==으로 대체가능


        s1 = new String("Java");
        s4 = new String("Java");
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
        // new String으로 입력하면 정보가 다름
        // ex) 가게 화장실 비밀번호를 테이블 마다 두면 같은 비밀번호라도 보고 있는 종이가 다름



    }
}
