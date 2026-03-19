package chap_07.camera;

public class Camera {
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        // 사진 촬영
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 녹화
        System.out.println("영상을 녹화합니다.");
    }

    public  void  showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 사진촬영 , 영상녹화 입니다");
    }
}
