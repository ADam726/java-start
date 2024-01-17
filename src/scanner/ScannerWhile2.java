package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        if (sum == 0) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else {
            System.out.println("두 수의 합은: " + sum);
        }
        }

    }
}
