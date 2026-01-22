package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); //포함 되면 true
        System.out.println(s.contains("C++"));  //포함 되지 않으면 false !! 대소문자도 확인 가능

        // 위치 정보
        System.out.println(s.indexOf("Java")); // 포함 되면 단어의 첫 번째 위치가 나타남
        System.out.println(s.indexOf("c++"));  // 포함 되지 않으면 -1

        System.out.println(s.indexOf("and"));  // 처음 만나는 위치정보
        System.out.println(s.lastIndexOf("and"));  //마지막으로 만나는 위치 정보

        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));
        System.out.println(s.endsWith("."));

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I"));
        System.out.println(s.endsWith("."));
        System.out.println(s.contains("Java"));

    }
}
