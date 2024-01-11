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
        ArrayList<Integer> array = new ArrayList<>();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            array.add(arr[i]);
        }
        insertelement(5,2,array);
        
        System.out.println(array);
        
       
        }
     
    static boolean removefirstelement (ArrayList<Integer>array){
        if(array.isEmpty()){
            return false;
        }
        else{
            array.remove(0);
            return true;
        }
       }
    static void insertelement(int number, int position,ArrayList<Integer>array){
        array.add(position,number);
        array.remove(array.size()-1);
       
    }
        
    static int count(int N, int[] arr) {
        int counts = 0;
        for (int i : arr) {
            if (i == N) {
                counts++;
            }
        }
        return counts;
    }
    
    static ArrayList<Integer> findduplicatevalue (int[] arr){
        ArrayList<Integer> subarray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(count(arr[i], arr)!=1 && !subarray.contains(arr[i])){
                subarray.add(arr[i]);
            }
        }
        return subarray;
    }
    static ArrayList<Integer> removeduplicatevalue (int[] arr){
        ArrayList<Integer> subarray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!subarray.contains(arr[i])){
                subarray.add(arr[i]);
            }
        }
        return subarray;
    }
}

