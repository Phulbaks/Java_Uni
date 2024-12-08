package Lab1_var13.Test;
import java.util.Scanner;

public class authorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if (username.equals(args[0]) && password.equals(args[1])) {
            System.out.println("Вас узнали. Добро пожаловать");
        }
        else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }
    }
}
