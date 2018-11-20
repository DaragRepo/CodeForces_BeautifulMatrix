/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication206;

import java.util.Scanner;

/**
 *
 * @author moh
 */
public class JavaApplication206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =0 ;
        if (sc.nextInt() == 10) {
            System.out.println("it's a zero");
        } else {
            x = sc.nextInt();
        }
        System.out.println(x);
    }
    
}
