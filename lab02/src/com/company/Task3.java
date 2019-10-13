package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task3 {
    String text;
    Task3(){
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text = in .nextLine();
    }
    public void checkip(){
        Pattern p = Pattern.compile("((^|:)([0-9a-fA-F]{0,4})){1,8}");
        Matcher m = p.matcher(text);
        if(m.matches()){
            System.out.println("Строка является адресом IPv6");
        } else {
            System.out.println("Строка не является адресом IPv6");
        }
    }
}
