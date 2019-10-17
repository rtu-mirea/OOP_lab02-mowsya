package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;


public class Task2 {
    StringBuffer text = new StringBuffer();

    Task2(){
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text.append(in.nextLine());
    }

    public void removePrePri() throws StringIndexOutOfBoundsException{
        StringBuffer temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){
            try{
            if(!(i.substring(0,3).toLowerCase().equals("пре") || i.substring(0,3).toLowerCase().equals("при"))){
                temp.append(i).append(" ");
            }} catch(StringIndexOutOfBoundsException e){
                temp.append(i).append(" ");
                }
        }
        System.out.println("Текст без слов на \"пре-\" и \"при-\": ");
        System.out.println(temp.toString());
    }

    public void divSeven() throws NumberFormatException{
        StringBuffer temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){try{

            if(Integer.parseInt(i) % 7 != 0){
                temp.append(Integer.parseInt(i) / 7).append(" ");
            } else{
                temp.append(i).append(" ");
            }
        }catch(NumberFormatException e) {
            temp.append(i).append(" ");
        }
        }
        System.out.println("Текст с разделенными на 7 числами, не кратными 7: ");
        System.out.println(temp.toString());
    }
    public void addZeros(){
        StringBuffer temp = new StringBuffer();
        String[] arr = text.toString().split(" ");
        for(String i : arr){

            if(i.chars().allMatch(Character::isDigit)){
                temp.append(i).append(" ");
            }else{
                temp.append("0000000").append(" ").append(i).append(" ");
            }
        }
        System.out.println("Текст с добавленными к нечисловым словам семью нулями: ");
        System.out.println(temp.toString());
    }
}
