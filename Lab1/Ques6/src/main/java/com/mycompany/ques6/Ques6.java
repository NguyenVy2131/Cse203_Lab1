/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ques6;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        
        System.out.println("The length of word "+string1.length());
        System.out.println("The number of words "+numberofword(string1));
        System.out.println("Concatenates: "+Concatenate(string1, string2));
        if(Palindrome(string1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    static int numberofword(String string1){
        String[] splits = string1.split("\\s");
        int count =0;
        for(int i=0;i<splits.length;i++){
            count++;
        }
        return count;
    }
    static String Concatenate (String string1, String string2){
        return string1.concat(" "+string2);
    }
    public static boolean Palindrome(String string1) {
        int i=0;
        int j = string1.length()-1;
        while (i<j) {
            if (string1.charAt(i)!=string1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
