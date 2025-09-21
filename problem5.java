class Solution{
    void Largest(int []arr){

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                smax = max;
                max =arr[i];
            }
             else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
             }

             }
              System.out.println(max);
            System.out.println(smax);
    }
}
            
        
    public class problem5 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        Solution obj = new Solution();
        obj.Largest(arr);
        
    }
    
}

