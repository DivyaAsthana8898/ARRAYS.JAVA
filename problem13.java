class Solution{
    public void India(int []arr){
        int countzero = 0;
        for(int x: arr){
            if(x==0)countzero++;
        }
            for(int i =0;i<countzero;i++){
                arr[i] = 0;
            }
              for(int i = countzero;i<arr.length;i++){
                arr[i] = 1;

             }

    }
}
    public class problem13 {
    public static void main(String[] args) {
        int []arr={1,1,1,1,1,0,0,0,0,0};
        Solution obj = new Solution();//CLASS OBJ = NEW CLASS();
        obj.India(arr);
        for(int x : arr){
        System.out.println(x);
          }        
    }
    
}
