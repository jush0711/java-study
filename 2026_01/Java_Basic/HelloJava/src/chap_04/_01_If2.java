package chap_04;

public class _01_If2 {
    public static void main(String[] args) {
        int hour = 12;
        boolean iceCoffee = false;
        if (hour < 14 && iceCoffee == false)
            System.out.println("ice coffee +1");
        System.out.println("주문 완료 #1");

        hour = 12;
        iceCoffee = false;
        if (hour < 14 && !iceCoffee)        // iceCoffe == false == !iceCoffe
                                            // iceCoffe == true  == iceCoffee
             System.out.println("ice coffee +1");
        System.out.println("주문 완료 #1");

        hour = 12;
        iceCoffee = false;
        String s = "go";
        if (hour >= 13 || iceCoffee || s == "go") {
            System.out.println("decaf ice coffee");
        }
        System.out.println("주문 완료#2");



    }
}
