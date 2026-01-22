package chap_06;

import java.sql.SQLOutput;

public class _03_Return {

    public static String getPhoneNumber(){
        String number = "02 - 3443 - 1123";
        return number;

    }

    public static String getAddress(){
        return "대구 동구";
    }

    public static String getActivities(){
        return "배구, 농구";
    }

    public static void main(String[] args) {

        String phoneNuber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + phoneNuber);

        String Address = getAddress();
        System.out.println("호텔 주소 : " + Address);

        System.out.println("호텔 activities : " + getActivities());

    }
}
