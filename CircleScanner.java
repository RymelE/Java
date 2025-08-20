/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.CircleScanner;

import java.util.Scanner;  // import the real Scanner

public class CircleScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        
        System.out.print("the area for the circle " + radius + " is " + area);
    }
}

