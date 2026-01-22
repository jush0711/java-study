package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
//        1등 전액 장학금
//        2등 반액 장학금
//        3등 반액 장학금
//        그 외 장학금 대상자 아님
        int 순위 = 2;
        if (순위 == 1){
            System.out.println("전액 장학금 대상자");
        } else if (순위 == 2){
            System.out.println("반액 장학금 대상자");
        } else if (순위 == 3){
            System.out.println("반액 장학금 대상자");
        } else {
            System.out.println("장학금 대상자가 아님");
        }
        System.out.println("조회가 완료 되었습니다#1");


        순위 = 3;
        if (순위 == 1){
            System.out.println("전액 장학금 대상자");
        } else if (순위 == 2 || 순위 == 3){
            System.out.println("반액 장학금 대상자"); // 내용이 같다면 || 을 사용해 한 문장으로 만들 수 있음
        }  else {
            System.out.println("장학금 대상자가 아님");
        }
        System.out.println("조회가 완료 되었습니다#2");


        // switchCase
        순위 = 2;
        switch (순위) {
            case 1:
                System.out.println("전액 장학금 대상자");
                break;
            case 2:
                System.out.println("반액 장학금 대상자");
                break;
            case 3:
                System.out.println("반액 장학금 대상자");
                break;
            default:
                System.out.println("장학금 대상자가 아님");

        }
        System.out.println("조회 완료 #3");

        // 중복 되는 문장이 있다면
        순위 = 2;
        switch (순위) {
            case 1:
                System.out.println("전액 장학금 대상자");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금 대상자"); // 이런식으로 break까지 지우면 됨
                break;                                 // 혹은 case 2, 3: 이런식으로
            default:
                System.out.println("장학금 대상자가 아님");

        }
        System.out.println("조회 완료 #4");



    }
}
