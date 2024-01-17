package method;

public class Method2 {

    public static void main(String[] main){
        printHedaer();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHedaer(){
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printFooter(){
        System.out.println("= 프로그램을 종료합니다. =");
    }
}
