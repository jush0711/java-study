package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";
//        KR_COUNTRY_CODE = "+828282";  위에 KR_COUNTRY_CODE에 final로 상수로 바꿨기 때문에 지금 변수가 error가 남
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        final String DATE_OF_BRITH ="2003.07.11";
//        변하지 않는 것에 대한 상수
//        상수의 변수 이름에 단어 두개가 들어가면 _로 띄어쓰기를 해 가독성을 높이기

    }
}
