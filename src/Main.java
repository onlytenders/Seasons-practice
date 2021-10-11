import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String str = scan.nextLine();
            if (str.equals("Весна")) {
                System.out.println("Вы угадали сезон");
                break;
            } else if (str.equals("end")) {
                System.out.println("До свидания");
                break;
            } else {
                System.out.println("Попробуйте угадать ещё раз");
            }
        }
    }
}