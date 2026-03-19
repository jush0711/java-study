package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 camera 클래스 상속 (부모 클래스)
        // fectoryCam, speedCam 클래스 (자식 클래스)
        // 상속은 겹치는 부분에 대해 부모 클래스에서 상속해줘서 자식 클래스에는 작성하지 않고 기능을 사용할 수 있음

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.takePicture();
        speedCam.recordVideo();

        System.out.println();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();





    }
}
