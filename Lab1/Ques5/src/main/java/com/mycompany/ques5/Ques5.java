/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ques5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();
        
        
        
        
        }
        
    
    public static boolean removespecific (int n,int number,int b){
        int flag;
       ArrayList<Integer> arraylist = new ArrayList<>();
       ArrayList<Integer> subarraylist = new ArrayList<>();
       for(int i=0;i<n;i++){
            arraylist.add(number);
        }
       if(arraylist.contains(b)){
            subarraylist.add(b);
            arraylist.removeAll(subarraylist);
            return true;
        }
       else{
           return false;
       }
}
    public static int insertelement(int n, int number,int b, int c){
        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<Integer> subarraylist = new ArrayList<>();
        for(int i=0;i<n;i++){
            arraylist.add(number);
        }
        arraylist.add(c,b);
        for(int i=0;i<arraylist.size();i++){
            subarraylist.add(arraylist.size()-1);
            return arraylist.get(i);
        }
        
    
    }
    
}

