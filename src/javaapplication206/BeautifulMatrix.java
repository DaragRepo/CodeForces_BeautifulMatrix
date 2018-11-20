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
public class BeautifulMatrix {

    private final int beautifulMatrixRow = 3;
    private final int beautifulMatrixColumn = 3;
    private int oneCurrentRow = 0;
    private int oneCurrentColumn = 0;
    private int [][] matrix = new int [5][5];

    public BeautifulMatrix() {
        getMatrix();
    }

    private void getMatrix() {
        Scanner input = new Scanner(System.in);
        int oneCounter = 0;
        for (int rows = 0; rows < 5; rows++) {
            for (int columns = 0; columns < 5; columns++) {
                    matrix[rows][columns] = input.nextInt();
                    System.out.print("\t");
              if (matrix[rows][columns] == 1 && oneCounter < 1) {
                    oneCounter++;
                    oneCurrentRow = rows+1;
                    oneCurrentColumn = columns+1;
                //  System.out.println("Row" + oneCurrentRow + "Column" + oneCurrentColumn );
              } else {
                  matrix[rows][columns] = 0;
              }
            }
            System.out.println();
        }
    }
    
    public void printMatrix() {
         System.out.println("Your Matrix is : ");
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
    

    public int minimumMovesToBeautifulMatrix() {
      return Math.abs(oneCurrentRow - beautifulMatrixRow) +  Math.abs(oneCurrentColumn - beautifulMatrixColumn);
    }
    
    

    public static void main(String[] args) {
        BeautifulMatrix obj = new BeautifulMatrix();
        System.out.println("MiniMum Moves is " + obj.minimumMovesToBeautifulMatrix());
    }

}
