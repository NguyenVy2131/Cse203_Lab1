/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ques2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] n = new int[3];
    for(int i=0;i<3;i++){
        n[i]=sc.nextInt();
    }
    int min=n[0];
    for (int i = 1; i < n.length; i++) {
	if (min < n[i]) {
            min = min;
			}
	else {
            min=n[i];
			}
		}
    System.out.println(min);
    }
}
