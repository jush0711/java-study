package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "하양이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "화이트";


        BlackBox b2 = new BlackBox();
        b2.setModelName("깜장이");
        b2.setColor("블랙");
        b2.setPrice(-5000);

        System.out.println(b2.modelName);
        System.out.println(b2.price);

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());



    }
}
