package chap_07;

public class BlackBox {

    //BlackBox 정보
    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber;

    static int counter;

    static boolean canAutoReport = false;


    BlackBox(){
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("시리얼 넘버를 배정 받았습니다 : " + this.serialNumber);

    }

    BlackBox(String modelName, String resolution , int price, String color){
//
//        this();
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


    void autoReport() {
        if (canAutoReport){
            System.out.println("블랙박스의 자동 신고 기능이 작동 중입니다");

        }

        else {
            System.out.println("블랙박스의 기능이 없습니다");
        }


    }
    void memoryCard(int capacity) {
        System.out.println("메모리 카드가 입력 되었습니다");
        System.out.println("메모리 카드의 크기는 " + capacity + "GB 입니다");

    }

    int getVideoFileCount (int type){
        if (type == 1){
            return 9;
        }
        else if (type == 2){
            return 2;
        }return 11;
    }

    void record(boolean showDateTime, boolean showSpeed , int min){
        System.out.println("녹화 재생을 시작합니다");
        if (showDateTime){
            System.out.println("영상녹화 날짜를 표시합니다");
        }
        if (showSpeed){
            System.out.println("영상재생 속도를 표시합니다");
        }
        System.out.println("영상은" + min + "분 재생됩니다");
    }

    void record(){
        record(true, true, 5);
    }

    static void callServiceCenter(){
        System.out.println("사고 발생감지, 서비스센터 전화번호 054-0404-3093");
    }


    void appendModelName(String modelName){
        this.modelName += modelName;
    }


    String getModelName(){
        return modelName;
    }

   void setModelName(String modelName){
        this.modelName = modelName;
   }

   String getResolution(){
        if (resolution == null || resolution.isEmpty()){
            return "관리자에게 문의하세요";
        }
        return resolution;
   }

   void setResolution(String resolution){
        this.resolution = resolution;
   }

   int getPrice(){
        return price;
   }

   void setPrice (int price){
        if (price <100000){
            this.price = 100000;
        }
        else {
            this.price= price;
        }
   }

   String getColor (){
        return color;
   }

   void setColor(String color){
        this.color = color;
   }

}
