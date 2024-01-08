/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ques3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int number=n;
        while(number>1){
            if(number%2==0){
                System.out.print(number+" is an even,");
                number/=2;
                System.out.print(" so we take n/2: "+number);
                System.out.println();
            }
            else if(number%2!=0){
                System.out.print(number+" is an odd,");
                number=number*3+1;
                System.out.print(" so we take 3*n+1: "+number);
                System.out.println();
            }
            if (number == 1) {
		break;
			}
                
            }
        
        }
    }

