package Lab4_var14.task_II;

public class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // геттеры
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    // сеттеры
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Метод для вычисления натурального логарифма комплексного числа
    public ComplexNumber log() {
        // Модуль
        double modulus = Math.sqrt(real * real + imaginary * imaginary);
        // Аргумент
        double argument = Math.atan2(imaginary, real);
        // return логарифм в виде ComplexNumber
        return new ComplexNumber(Math.log(modulus), argument);
    }

    @Override
    public String toString() {
        return String.format("%.4f + %.4fi", real, imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(22, 7);

        ComplexNumber logResult = complexNumber.log();

        System.out.println("Комплексное число: " + complexNumber);
        System.out.println("Натуральный логарифм: " + logResult);

        // изменение значений через сеттеры
        complexNumber.setReal(-4);
        complexNumber.setImaginary(15);

        logResult = complexNumber.log();

        System.out.println("\nКомплексное число: " + complexNumber);
        System.out.println("Натуральный логарифм: " + logResult);

    }
}

