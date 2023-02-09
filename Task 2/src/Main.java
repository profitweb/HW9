import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        while(true) {
            condition();
        }
        }

    private static void condition() {
        System.out.println(inputNumber() % 2 == 0);
    }

    private static int inputNumber() {
        System.out.println("Please enter any number");
        return new Scanner(System.in).nextInt();
    }
}
