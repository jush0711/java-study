package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값과 어울리는 이름으로
        //2. 밑줄(_), 문자(abc), 숫자(123) 사용가능 (!! 공백은 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능 (!! 숫자로는 시작 불가)
        //4. 한 단어 또는 2개 이상 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자 ( 첫 단어는 소문자로 시작)
        //6. 예약어 사용 불가 (String, int, double, float,...)

        //ex) 입국 신고서
        String nationality = "대한민국";
        String firstName = "seunghyeon";
        String lastName = "JU";
        String dateOfBirth = "2003.07.11";
        String residentialAddress = "신라 호텔";
        String _flightNo = "KE657";

        // 지금까지 했던 건 변수
        // 상수는 절대 변하지 않는, 상수는 대문자로
        final String CODE = "KR";

    }
}
