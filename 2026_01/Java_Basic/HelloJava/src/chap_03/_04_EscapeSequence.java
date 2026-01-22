package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n
        System.out.println("와 개 졸리네 자고싶다");
        System.out.println("와\n개 졸리네 \n자고싶다");

        // \t
        System.out.println("육개장 먹고싶어");
        System.out.println("조개 칼국수 먹고싶어");
        System.out.println("뿌링클 사이드에 칼빔면 먹고싶어");

        System.out.println("육개장 \t\t\t\t먹고싶어"); // \t는 탭 한 번의 효과가 있다
        System.out.println("조개 칼국수 \t\t\t먹고싶어");
        System.out.println("뿌링클 사이드에 칼빔면 \t먹고싶어");

        // \"
        System.out.println("그가 말했다 \"10분만 더 할거야\" 라고");

        // \'
        char c = '\'';
        System.out.println(c);



    }
}
