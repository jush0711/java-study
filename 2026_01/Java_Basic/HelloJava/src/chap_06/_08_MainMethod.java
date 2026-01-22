package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 반납
        // 3. 도서 대출

        if (args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println(" 도서 조회 입니다 ");
                    break;
                case "2":
                    System.out.println(" 도서 반납 입니다 ");
                    break;
                case "3" :
                    System.out.println(" 도서 대출 입니다 ");
                    break;
                default:
                    System.out.println(" 잘못 된 경로 입니다 ");

            }


        }
        else {
            System.out.println(" 1~3의 선택지 중에 하나를 선택 하세요 ");
        }




    }
}
