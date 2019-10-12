package com.company;
import java.util.Scanner;
import java.lang.String;

public class Task1 {
    String text;
    String temp;
    String result = "";

    Task1() {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text = in .nextLine();
    }
    private boolean isVowel(char c) {
        return (c == 'а' || c == 'А' || c == 'е' || c == 'Е' || c == 'и' || c == 'И' || c == 'о' || c == 'О' || c == 'у' || c == 'У' || c == 'ы' || c == 'Ы' || c == 'э' || c == 'Э' || c == 'я' || c == 'Я' || c == 'Ю' || c == 'ю' || c == 'ё' || c == 'Ё');
    }
    public void vowelWords() {
        int space;
        temp = text;
        while (true) {
            space = temp.indexOf(" ");
            if (space != -1) {
                if (isVowel(temp.charAt(0)) && isVowel(temp.charAt(space - 1))) {
                    result = result.concat(temp.substring(0, space + 1));
                }
            } else {
                if (isVowel(temp.charAt(0)) && isVowel(temp.charAt(temp.length() - 1))) {
                    result = result.concat(temp);
                }
                break;
            }
            temp = temp.substring(space + 1);
        }
        System.out.println("Строка из слов, начинающихся и заканчивающихся на гласную: ");
        System.out.println(result);
        temp = null;
        result = "";
    }
    public void longerThan(String word){
        int space, count = 0;
        temp = text;
        while (true) {
            space = temp.indexOf(" ");
            if (space != -1) {
                if(temp.substring(0,space).length() > word.length()){
                    count++;
                }
            } else {
                if(temp.substring(temp.length()).length() > word.length()){
                    count++;
                }
                break;
            }
            temp = temp.substring(space + 1);
        }
        System.out.println("Количество слов длиннее " + word + ": ");
        System.out.println(count);
        temp = null;
    }
    public void upperPrePri(){
        int space;
        temp = text;
        while (true) {
            space = temp.indexOf(" ");
            if (space != -1) {
                String tempsub = temp.substring(0, space).toLowerCase();
                if (tempsub.indexOf("пре") == 0 || tempsub.indexOf("при") == 0) {
                    result = result.concat(tempsub.toUpperCase() + " ");
                } else {
                    result = result.concat(temp.substring(0, space) + " ");
                }
            } else {
                String tempsub = temp.toLowerCase();
                if (tempsub.indexOf("пре") == 2 || tempsub.indexOf("при") == 0) {
                    result = result.concat(tempsub.toUpperCase());
                } else {
                    result = result.concat(temp);
                }
                break;
            }
            temp = temp.substring(space + 1);
        }
        System.out.println("Строка из слов, начинающихся и заканчивающихся на гласную: ");
        System.out.println(result);
        temp = null;
        result = null;
    }
    public void numberRange(int min, int max){
        int count = 0;
        temp = text;
        temp = temp.replaceAll("\\D", " ");
        String[] arr = temp.split(" ");
        for(String i : arr){
            if(i.equals("")){
                continue;
            }
            System.out.println(i);
            if(Integer.parseInt(i) >= min && Integer.parseInt(i) <= max){
                count++;
            }
        }
        System.out.println("Количество чисел в данном диапазоне: ");
        System.out.println(count);
        temp = null;
    }
}