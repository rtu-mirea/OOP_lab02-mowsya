package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void menu1() throws InputMismatchException {
        Task1 text = new Task1();
        int choice = 0;
        while(true) {
            System.out.println("\nВыберите метод для выполнения: \n 1. Показать только слова, начинающиеся и заканчивающиеся на гласные;\n" +
                    " 2. Ввести слово и посчитать, сколько слов из текста длиннее данного слова;\n" +
                    " 3. Все слова на \"пре-\" и \"при-\" записать заглавными буквами;\n" +
                    " 4. Ввести диапазон и посчитать, сколько чисел из текста находятся в пределах данного диапазона;\n" +
                    " 5. Выход в главное меню.");
            Scanner in = new Scanner(System.in);
            try {
                choice = in.nextInt();
            } catch (InputMismatchException e){ }
            switch(choice){
                case 1:
                    text.vowelWords();
                    continue;
                case 2:
                    text.longerThan();
                    continue;
                case 3:
                    text.upperPrePri();
                    continue;
                case 4:
                    text.numberRange();
                    continue;
                case 5:
                    return;
                default:
                    System.out.println("Неправильный выбор, повторите ввод");
            }
        }
    }

    public static void menu2() throws InputMismatchException {
        Task2 text = new Task2();
        int choice = 0;
        while(true) {
            System.out.println("\nВыберите метод для выполнения: \n 1. Удалить из текста слова на \"пре-\" и \"при-\";\n" +
                    " 2. Разделить все числа в тексте, не кратные 7, на 7;\n" +
                    " 3. Перед всеми нечисловыми словами добавить по семь нулей;\n" +
                    " 4. Выход в главное меню.");
            Scanner in = new Scanner(System.in);
            try {
                choice = in.nextInt();
            } catch (InputMismatchException e){ }
            switch(choice){
                case 1:
                    text.removePrePri();
                    continue;
                case 2:
                    text.divSeven();
                    continue;
                case 3:
                    text.addZeros();
                    continue;
                case 4:
                    return;
                default:
                    System.out.println("Неправильный выбор, повторите ввод");
            }
        }
    }

    public static void menu3() throws InputMismatchException {
        Task3 text = new Task3();
        int choice = 0;
        while(true) {
            System.out.println("\nВыберите метод для выполнения: \n 1. Проверить соответствие строки формату IPv6;\n" +
                    " 2. Во всех словах формата IPv6 перевести элементы из 16 СС в 10 СС;\n" +
                    " 3. Выход в главное меню.");
            Scanner in = new Scanner(System.in);
            try {
                choice = in.nextInt();
            } catch (InputMismatchException e){ }
            switch(choice){
                case 1:
                    text.checkip();
                    continue;
                case 2:
                    text.replaceDec();
                    continue;
                case 3:
                    return;
                default:
                    System.out.println("Неправильный выбор, повторите ввод");
            }
        }
    }

    public static void main(String[] args) throws InputMismatchException {
        int choice = 0;
        while(true) {
            System.out.println("\nВыберите задание (1/2/3) или введите 4 для выхода из программы: ");
            Scanner in = new Scanner(System.in);
            try {
                choice = in.nextInt();
            } catch (InputMismatchException e){ }
            switch(choice){
                case 1:
                    menu1();
                    continue;
                case 2:
                    menu2();
                    continue;
                case 3:
                    menu3();
                    continue;
                case 4:
                    return;
                default:
                    System.out.println("Неправильный выбор, повторите ввод");
                    choice = 0;
            }
        }
    }
}
