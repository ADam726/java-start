package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("Hello, world", 3);
        printMessage("Hello, world", 5);
        printMessage("Hello, world", 7);
    }

    public static void printMessage(String message, int time){
        for(int i = 0; i < time; i++){
            System.out.println(message);
        }
    }
}

