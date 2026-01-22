package chap_07;

public class _04_Method {
    public static void main(String[] args) {

        // 블랙박스의 자동신고기능 여부

        BlackBox b1 = new BlackBox();
        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        System.out.println("------------------------");
        // 블랙박스의 메모리카드

        b1.memoryCard(256);

        System.out.println("------------------------");

        // 블랙박스의 일반영상 이벤트영상

        int video = b1.getVideoFileCount(1);
        System.out.println("일반영상은 " + video + "개 입니다.");

        int eventVideo = b1.getVideoFileCount(2);
        System.out.println("충돌감지 영상은 " + eventVideo + "개 입니다.");

        int everyVideo = b1.getVideoFileCount(34);
        System.out.println("녹화된 모든 영상은 " + everyVideo + "개 입니다.");

        System.out.println("------------------------");

        // 강의 방법
        int countFile = b1.getVideoFileCount(1);
        System.out.println("일반영상은 " + video + "개 입니다.");

        b1.getVideoFileCount(2);
        System.out.println("충돌감지 영상은 " + eventVideo + "개 입니다.");

        b1.getVideoFileCount(4);
        System.out.println("녹화된 모든 영상은 " + everyVideo + "개 입니다.");





    }
}
