
import java.util.Scanner;

public class Buiklding2dARRAY {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of n and m :");
        int n = sc.nextInt();
        int m = sc.nextInt();
       // System.out.println("enter the values :");
        int[][]arr = new int[n][m];
        for(int i = 0;i<n; i++){// rows // taking input  for rows 
            for(int j=0;j<m;j++){// columns // taking input for columns
                arr[i][j] = sc.nextInt();
            }
        }
         System.out.println("printing 2d array");
         for(int i=0;i<n;i++){// printing // rows 
            for(int j=0;j<m;j++){// printing // column 
                System.out.print(arr[i][j] + " ");

            }
             System.out.println();
         }
             
         }}
        
          
      
         
  