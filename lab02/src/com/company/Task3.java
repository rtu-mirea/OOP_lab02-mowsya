package com.company;
import java.util.Arrays;
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
        Pattern p = Pattern.compile("\\A(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\z");
        Matcher m = p.matcher(text);
        if(m.matches()){
            System.out.println("Строка является адресом IPv6");
        } else {
            System.out.println("Строка не является адресом IPv6");
        }
    }

    public void replaceDec(){
        String[] arr = text.split(" ");
        String temp = "";
        Pattern p = Pattern.compile("\\A(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\z");
        Matcher m;
        for(String i: arr){
            m = p.matcher(i);
            if(m.matches()){
                String[] arr2 = i.split(":");
                i = "";
                for(String j : arr2){
                    j = Integer.toString(Integer.parseInt(j,16));
                    i = i.concat(j).concat(":");
                }
                temp = temp.concat(i.substring(0,i.length() - 1)).concat(" ");
            } else {
                temp = temp.concat(i).concat(" ");
            }
        }
        System.out.println("Строка с IPv6 в 10-й системе счисления: ");
        System.out.println(temp);
    }

}
