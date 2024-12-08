package Lab1_var13.Test;

public class sum {
    public static void main(String[] args) {
        int number_of_params = args.length;

        if (number_of_params == 2) {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println("Значения: " + n1 + ", " + n2);
            System.out.print(n1 + " + " + n2 + " = ");
            System.out.println(n1 + n2);
        }
        else {
            System.out.println("Неверное количество параметров");
        }
    }
}
