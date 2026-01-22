package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        
        //객체 지향 프로그래밍
        //유지보수 편리함
        //높은 재사용성

        //ex) 블랙박스 제품

        String modelName = "검정이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        
        // 제품 2번째
        
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2= "화이트";
        
        //제품이 나올 때 마다 이렇게 반복할 수는 없음
        // 더 많은 정보가 들어가게 되면 용량이 커짐

        //그래서 BlackBox 라는 클래스로부터 bbox라는 객체를 생성
        //bbox 객체는 BlackBox 클래스의 인스턴스
        //BlackBox 클래스는 설계도일 뿐
        // bbox가 실제 제품 인스턴스(사례)

        BlackBox bbox = new BlackBox();






        
        
        
    }
}
