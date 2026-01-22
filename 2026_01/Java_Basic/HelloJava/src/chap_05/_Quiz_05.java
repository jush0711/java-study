package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {


        // 사이즈 250 (재고 있음)

       /* int size = 250;
        for (int i = 250; i <= 295 ; i = i + 5) {
            System.out.println("사이즈" + i + "(재고 있음)");
*/
//        }
        int[] size = new int[10];
//        size = 250;
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + ( 5 * i );
            System.out.println("사이즈 " + size[i] + " (재고 있음)");


        }



    }
}
