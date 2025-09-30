class Solution{
    public int[] oddNo(int [] arr){
        int oddcount = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i ]%2!=0){
                oddcount++;
            }
        }
        int[] result = new int[oddcount];
        int index = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]%2 != 0){
                result[index] = arr[i];
                index++;

            }

        }
         return result;
    }
}
            
       public class problem19 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        Solution obj = new Solution();
        int []odds = obj.oddNo(arr);//This line sends the arr value, takes back the result array, and assigns it to odds.”
        for(int x:odds ){
            System.out.println(x);
        }


        
    }
    
}
