package cond.ex;

public class MoverateEx {

    public static void main(String[] args) {
        double rate = 6.0;

        if (rate <= 9.0){
            System.out.println("'어바웃 타임'을 추천합니다.");
        }
        if (rate <= 8.0){
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rate <= 7.0){
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
