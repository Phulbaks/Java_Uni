package Lab1_var13.Test;


public class n_params {
    public static void main(String[] args) {
        int number_of_params = args.length;
        if (number_of_params != 0) {
            System.out.println("Вы ввели " + number_of_params + " параметров");
        }
        else {
            System.out.println("Неверное количество параметров");
        }
    }
}
