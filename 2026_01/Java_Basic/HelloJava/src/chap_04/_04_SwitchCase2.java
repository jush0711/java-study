package chap_04;

public class _04_SwitchCase2 {
    public static void main(String[] args) {
        // Else if 조건은 범위에 해당할 때 사용하기 좋음 ex) 등급, price >= 90; a
        // switchCase 조건은 정확한 값이 나올 때 사용하기 좋음

        int grade = 2;
        int price = 7000;

        switch (grade){
            case 1:
                System.out.println(price += 1000); // price += 1000   ==   price = price + 1000
            case 2:
                System.out.println(price += 1000);
            case 3:
                System.out.println(price += 1000);
                break;
        }
        System.out.println(grade + "등급의 가격은 : " + price + "원 입니다.");

//      1등급일 때 10000 원이 나오는 이유는 break가 없기 때문에  case 1, 2, 3의 sout을 모두 거쳐서 나오게 됨
//      1등급일 때 pirce + 1000 + 1000 + 1000 으로 나옴


    }
}
