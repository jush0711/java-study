package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox ();
        b1.modelName = "깜장이";
        System.out.println(b1.modelName);


        BlackBox b2 = new BlackBox ();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);


        System.out.println("블랙박스 " + b1.modelName + "는 자동신고모드 존재 : " + b1.canAutoReport);
        System.out.println("블랙박스 " + b2.modelName + "는 자동신고모드 존재 : " + b2.canAutoReport);
        System.out.println(BlackBox.canAutoReport);

        System.out.println("업데이트 후 ------");

        BlackBox.canAutoReport = true;

        System.out.println("블랙박스 " + b1.modelName + "는 자동신고모드 존재 : " + b1.canAutoReport);
        System.out.println("블랙박스 " + b2.modelName + "는 자동신고모드 존재 : " + b2.canAutoReport);
        System.out.println(BlackBox.canAutoReport);


        // 인스턴스 변수와  클래스 변수의 차이점
        // 인스턴스 변수는 학생의 이름표와 같이 각각을 나타내는 것
        // 클래스 변수는   학교 교실, 시계와 같이 같이 사용되는 것
        // 모든 객체에 똑같이 사용되어야 하는 변수 ex) 이름, 공통 설정값 같은 경우를 인스턴스 변수로 바꾸면 메모리 낭비


    }
}
