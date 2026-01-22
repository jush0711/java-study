package chap_04;

public class _11_Continue {
    public static void main(String[] args) {

        int max = 20;
        int sold = 0;
        int noShow = 16;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i + "번 손님 주문하신 메뉴 나왔습니다");
            if (i == noShow){
                System.out.println(i + "번 손님 노쇼로 넘어갑니다");
                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("금일 메뉴가 소진 되었습니다.");
                break;
            }

        }
        System.out.println("영업끝");



        int index = 1;
        sold = 0;
        while (index < 50){
            System.out.println(index + "번 손님 주문 완료");

            if (index == noShow){
                System.out.println(index + "번 손님 노쇼 넘어감");
                index++;
                continue;

            }

            sold++;
            if (sold == max){
                System.out.println("금일 소진");
                break;
            }index++;
        }
        System.out.println("영업끝");

    }

}
