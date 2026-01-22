package chap_01;

public class _07_Typecasting {
    public static void main(String[] args) {
//        형변환
//        실수에서 정수
//        정수에서 실수

//        int to double, float
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);


//        double, float to int
        float score_f = 99.2f;
        double score_d = 87.33;
        System.out.println(score_f);
        System.out.println(score_d);

        System.out.println((int) score_f);
        System.out.println((int) score_d);

        //정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score);

        score_d = 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        // int -> long -> float -> double
        // 이 순으로 커지며 커지는 형변환은 자동으로 해준다

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(92);
        System.out.println(s1 + s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(51.4);
        System.out.println(s2 + s2);


        //문자열을 숫자로
        int i1 = Integer.parseInt("93");
        System.out.println(i1 + i1);
        double d1 = Double.parseDouble("99.9");
        System.out.println(d1 + d1);
    }
}
