package com.company;
import java.util.Scanner;
import java.lang.String;

public class Task1 {
    String text;

    Task1() {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text = in .nextLine();
    }
    private boolean isVowel(char c) {
        return (c == 'а' || c == 'А' || c == 'е' || c == 'Е' || c == 'и' || c == 'И' || c == 'о' || c == 'О' || c == 'у' || c == 'У' || c == 'ы' || c == 'Ы' || c == 'э' || c == 'Э' || c == 'я' || c == 'Я' || c == 'Ю' || c == 'ю' || c == 'ё' || c == 'Ё');
    }
    public void vowelWords() {
        String temp = "";
        String[] arr = text.split(" ");
        for(String i: arr){
            if(isVowel(i.charAt(0)) && isVowel(i.charAt(i.length() - 1))){
                temp = temp.concat(i).concat(" ");
            }
        }
        System.out.println("Строка из слов, начинающихся и заканчивающихся на гласную: ");
        System.out.println(temp);
    }
    public void longerThan(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = in.nextLine();
        int count = 0;
        String[] arr = text.split(" ");
        for(String i: arr){
            if(i.length() > word.length()){
                count++;
            }
        }
        System.out.println("Количество слов длиннее \"" + word + "\": ");
        System.out.println(count);
    }
    public void upperPrePri(){
        String temp = "";
        String[] arr = text.split(" ");
        for(String i: arr){
            try{System.out.println(i);
            if(i.substring(0,3).toLowerCase().equals("пре") || i.substring(0,3).toLowerCase().equals("при")){
                System.out.println(i);
                temp = temp.concat(i.toUpperCase()).concat(" ");
            } else {
                temp = temp.concat(i).concat(" ");
            }}catch(StringIndexOutOfBoundsException e){
                temp = temp.concat(i).concat(" ");
            }
        }
        System.out.println("Строка со словами на \"пре-\" и \"при-\", записанными прописными буквами: ");
        System.out.println(temp);
    }
    public void numberRange() throws NumberFormatException{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимум: ");
        int min = in.nextInt();
        System.out.println("Введите максимум: ");
        int max = in.nextInt();
        int count = 0;
        String[] arr = text.split(" ");
        for(String i: arr){
            try{
                if(Integer.parseInt(i) >= min && Integer.parseInt(i) <= max){
                    count++;
                }
            } catch (NumberFormatException e){}
        }
        System.out.println("Количество чисел в данном диапазоне: ");
        System.out.println(count);
    }
}