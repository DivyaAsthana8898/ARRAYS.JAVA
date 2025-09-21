public class problem7 {
    public static void main(String[] args) {
      //  int product ;
        int []arr = {10,20,30,40,50,91};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
            //arr[i]*2= product;
            arr[i]*=2;
            }else{
                arr[i]+=2;
            }
             System.out.println(arr[i]);
            
            
        }
        //System.out.println(arr[5]);
    }
    // System.out.println(arr[i]);
    }
    

