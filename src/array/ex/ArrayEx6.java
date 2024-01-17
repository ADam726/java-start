package array.ex;

import java.util.Scanner;
public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int [] arry = new int[count];
        int minNumber, maxNumber;

        System.out.println(count + "개의 정수를 입력하세요:");
        for(int i = 0; i < arry.length; i++){
            arry[i] = scanner.nextInt();
        }

        minNumber = maxNumber = arry[0];
        for(int i =1; i < arry.length; i++){
            if(arry[i] < minNumber){
                minNumber = arry[i];
            }
            if(arry[i] > maxNumber){
                maxNumber = arry[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
