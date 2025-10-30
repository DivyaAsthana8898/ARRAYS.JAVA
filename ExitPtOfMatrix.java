
import java.util.Scanner;
public class ExitPtOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of array :");
        int n = sc.nextInt();
        int m = sc.nextInt();
       // System.out.println("Enter the value of array :");
        int[][] arr = new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j] = sc.nextInt();
        }
    }
     int dir = 0;
     int i = 0;
     int j = 0;
      while(true){
      dir = (dir + arr[i][j]) % 4;
        if(dir == 0){
            j++;

        }else if (dir==1){
            i++;
        }else if(dir==2){
            j--;
            
        }else{
            i--;// for d = 3;
        }
         if(i<0){
            i++;
            break;
         }
          if(i==n){
            i--;
            break;
          }
           if(j<0){
            j++;
            break;
           }
            if(j==m){
                j--;
                break;
            }
        
            // System.out.println(i + " " + j);

             
       }
        System.out.println(i + " " + j);
       sc.close();
    }
}
       
  
