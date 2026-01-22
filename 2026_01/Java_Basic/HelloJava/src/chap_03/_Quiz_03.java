package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String 철수 = "901222-1234567";
        String 김연 = "030711-4829321";

//        System.out.println(주철수.substring(주철수.indexOf("9")), 주철수.indexOf("2"));
//        System.out.println(s.substring(s.indexOf("J"), s.indexOf(".")));

        System.out.println(철수.substring(0, 8));
        System.out.println(철수.substring(0, 철수.indexOf("-") + 2));

        System.out.println(김연.substring(0, 8));




    }
}
