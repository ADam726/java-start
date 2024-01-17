package scanner.ex;

import java.util.Scanner;
public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            String name = "";
            int price = 0;
            int num = 0;
            int total = 0;

            if(option == 1){
                System.out.print("상품명을 입력하세요: ");
                name = scanner.nextLine();
                scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.println("구매 수량을 입력하세요: ");
                num = scanner.nextInt();

                total = price * num;
                System.out.println("상품명: " + name + " 가격: " + price + " 수량: " + num + " 합계: " + total);
                continue;

            } else if (option == 2) {
                System.out.println("총 비용: " + total );
                continue;
            } else if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
                continue;
            }

        }
    }
}