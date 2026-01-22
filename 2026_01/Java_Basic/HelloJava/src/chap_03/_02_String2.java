package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환 // replace 교체하다
        System.out.println(s.replace(" and", ","));
        System.out.println(s.indexOf("J"));
        System.out.println(s.substring(7));

        System.out.println(s.substring(s.indexOf("Java")));

        System.out.println(s.substring(s.indexOf("J"), s.indexOf(".")));
//      여기서 중요한 건. 시작하는 부분은 기준을 포함 하지만, 끝나는 부분은 기준을 포함하지 않는다.!
//      시작 위치부터 끝 위치 직전까지

        s = "                   I love Java.                      ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 불필요한 공백을 없앤다

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));

    }
}
