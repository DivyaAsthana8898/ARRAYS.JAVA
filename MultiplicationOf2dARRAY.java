
import java.util.Scanner;

public class MultiplicationOf2dARRAY {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);// TAKING THE INPUT
      System.out.println("Enter the values of n & m");// TAKING THE INPUT
      int r1 = sc.nextInt();// SETTING R1
      int c1 = sc.nextInt();// SETTING C1
      int[][] one = new int[r1][c1];// CREATING THE FIRST ARRAY
      for(int i =0;i<r1;i++){// TRAVESING THE ROWS
         for(int j =0;j<c1;j++){// TRAVERSING THE COLUMNS
            one[i][j] = sc.nextInt();  // GIVING THE INPUT FOR ONE MATRIX

         }
        }
      int r2 = sc.nextInt();
      int c2 = sc.nextInt();
      int[][] two = new int[r2][c2];
      for(int i =0;i<r2;i++){
         for(int j =0;j<c2;j++){
            two[i][j] = sc.nextInt();// GIVING THE INPUT FOR SECOND MATRIX
    }
      }
 if(c1!= r2 ){// CONDITION IN ORDER TO MULTIPLY
    System.out.println("Invalid Input");
    return;
 }
  int[][] prd = new int[r1][c2];// NEW MATRIX OF PRODUCTED VALUE CREATED ACC TO C1 & R2
  for(int i =0;i<prd.length;i++){
    for(int j = 0;j<prd[0].length;j++){
        for(int k = 0;k<c1;k++){
            prd[i][j] += one[i][k] * two[k][j];


        }
    }
  }

  for(int i =0;i<prd.length;i++){
    for(int j = 0;j<prd[0].length;j++){
        System.out.print(prd[i][j] + " ");
    }

 System.out.println("");
}
    }
}
//  //| Part                                  | Meaning                                                                    |
// | ------------------------------------- | -------------------------------------------------------------------------- |
// | `k`                                   | Used to move along the row (in first matrix) and column (in second matrix) |
// | `one[i][k]`                           | Picks each element from row `i` of first matrix                            |
// | `two[k][j]`                           | Picks each element from column `j` of second matrix                        |
// | `prd[i][j] += one[i][k] * two[k][j];` | Multiplies and adds them up to form one element of the result              |






 
    

