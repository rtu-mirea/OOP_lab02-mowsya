package com.company;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import java.util.Scanner;


public class Task2 {
    StringBuffer text = new StringBuffer();
    StringBuffer temp = new StringBuffer();
    StringBuffer result = new StringBuffer();

    Task2(){
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        text.append(in.nextLine());
    }

    public void removePrePri(){
        String[] arr = text.toString().split(" ");
        for(String i : arr){
            if(i.toLowerCase().indexOf("пре") == 0 || i.toLowerCase().indexOf("при") == 0 ){
                continue;
            } else{
                temp.append(i).append(" ");
            }
        }
        System.out.println("Текст без слов на \"пре-\" и \"при-\": ");
        System.out.println(temp);
    }

    public void divSeven() throws NumberFormatException{
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
        System.out.println(temp);
    }
    public void addZeros(){
        String[] arr = text.toString().split(" ");
        for(String i : arr){try{

            if(Integer.parseInt(i) == Integer.parseInt(i)){
                temp.append(i).append(" ");
            }
        }catch(NumberFormatException e) {
            temp.append("0000000").append(" ").append(i).append(" ");
        }
        }
        System.out.println("Текст с добавленными к нечисловым словам семью нулями: ");
        System.out.println(temp);
    }
}
