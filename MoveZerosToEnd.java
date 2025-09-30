import java.util.Arrays;

class Solution{
    public void  ArrayDemo( int []arr){
        int j = 0;// FOCUS ON ZEROTH ELEMENT;
        for(int i = 0;i<arr.length;i++){
            if(arr[i ] !=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i ] = arr[j];
                arr[j] = temp;
            }if(arr[j]!=0){
                j++;
            }

        }

    }
     

}public class MoveZerosToEnd {
    public static void main(String[] args) {
        // int []num = {8,1,0,2,1,0,3};
          int []num = {0,0,0,0,0,0,0,5,6,7,8,9,9,4,3};
       // int n = arr.length;
      //  for (int i = 0; i < arr.length; i++) {
           // System.out.println(num);
            Solution obj = new Solution();
            obj.ArrayDemo(num);
            System.out.println(Arrays.toString(num));
        
    }
    
}

