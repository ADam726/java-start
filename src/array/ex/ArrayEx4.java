package array.ex;

import java.util.Scanner;
public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] intValue = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i < intValue.length; i++){
            intValue[i] = scanner.nextInt();
            sum += intValue[i];
        }

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double)sum/intValue.length);


    }
}
