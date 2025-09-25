import java .util.Scanner;
  public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int product = 1;
        int []arr = new int[n];
        System.out.println("Enter the elements of array");
         for(int i = 0;i<arr.length;i++){
             arr[i] = sc.nextInt();
             product*=arr[i];

         }
         System.out.println(product);
    }
    
}
