package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {

        //오버로딩 같은 이름으로 메소드를 만들 수 있는 조건
        //1. 전달값의 타입이 다르거나 ( int <-> String)
        //2. 전달값의 갯수가 다르거나 getPower(  ,   ,  )   <->  getPower(  ,   )

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.record(true,true,4);

        System.out.println("---------------");

        b1.record();

        String b2 = "BlackBox";
        System.out.println(b2.indexOf("a"));











    }
}
