/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int firstdi=n;
        int lastdi;
        while(firstdi>=10){
            firstdi/=10;
        }
        lastdi=n%10;
        int a = (firstdi+lastdi);
        System.out.println(a);
    }
}
