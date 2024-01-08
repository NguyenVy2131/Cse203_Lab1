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
        String n = sc.nextLine();
        String[] splits = n.split("\\s");
        int count=0;
        for(int i=0;i<splits.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
