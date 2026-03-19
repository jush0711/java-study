package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
//        패키지 (random class)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // -21억 ~ 21억 사이의 랜덤한 숫자가 나옴
        System.out.println("랜덤 정수 (범위지정) : " + random.nextInt(10)); // 0이상 ~ 10 미만의 랜덤한 수
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0이상 ~ 1.0 미만

        // 랜덤 실수는 범위를 지정할 수 없지만. 트릭을 이용해서 범위를 지정할 수 있다

        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위 지정) : " + (min + (max - min) * random.nextDouble()));

        // 로또 번호
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        //random.nextInt(45) =  0 이상 45 미만
        //random.nextInt(45) + 1 = 1이상 46 미만



    }
}
