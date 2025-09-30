class Solution{
    public int SmallestElement(int[]arr){
        if(arr ==null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
         int min = arr[0];
         for(int i =0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];

            }
         } return min;
    }
     
}

public class SmallestElement {
    public static void main(String[] args) {
        int []arr = {10 ,20,30,40,50};
        Solution obj = new Solution();
        System.out.println(obj.SmallestElement(arr));
       // obj.SmallestElement(arr);
       // for(int x : arr){
         //   System.out.println(x);
        }
    }
    

