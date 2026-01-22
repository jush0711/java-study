package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        //ln i += 1  == i++
        // 기본, 응용 (짝수, 홀수만 출력)
//        for (선언;조건;증감)

//      기본
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("안녕하세요 너무 졸리네요" + i);
        }

//        응용
//        짝수
        for (int i = 0; i < 10 ; i += 2) {
            System.out.print(i);

        }
        System.out.println();
//        홀수
        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }
        System.out.println();

//        줄어들기
        for (int i = 10; i > 0 ; i --) {
            System.out.print(i);
        }
        int sum = 0;
        for (int i = 0; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지의 합은 " + sum + " 입니다.");

        }

    }
}



