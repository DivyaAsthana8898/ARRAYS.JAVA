class Solution{
    public  void Reverse(int [] numbers,int start,int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;

        }
    }
     public  void  printArraylist(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);//arr[i]PRINTING THE VALUES 

        }System.out.println();//PRINTING THE VALUES
     }
}
public class ReverseArray {
    public static void main(String[] args) {
        int []arr ={10,20,30,40,50,60,70,80};
        Solution obj = new Solution();
        obj.printArraylist(arr);
        obj.Reverse(arr, 0, arr.length-1);
        obj.printArraylist(arr);
       // for(int x : arr){
          //  System.out.println(x);
        }
    }
    

