package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
//        for (int i = 0; i < data.length() - index; i++) {

        for (int i = index; i < data.length() ; i++) {
            hiddenData += "*";


        }

        return hiddenData;
    }



    public static void main(String[] args) {

        String name = "나코딩";
        String id = "030711-1234567";
        String phoneNum = "010-1234-8510";

        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phoneNum, 9));




    }
}
