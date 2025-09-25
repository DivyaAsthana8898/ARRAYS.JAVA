class seggregate{
    void india(int []arr){
    int countzero = 0; 
    for(int x: arr){
        if(x==0){
         countzero++;//counting the no of 0s
        } 
    }
         for( int i = 0 ; i<countzero;i++){//printing the no of 0s
            arr[i] = 0;
            
         }
          for (int i = countzero ; i<arr.length ; i++){//printing other nos 
            arr[i] = 1; 

          }
           
    }
    }
    public class problem16 {
    public static void main(String[] args) {
        seggregate obj = new seggregate();
        int []arr = {1,1,1,1,0,0,0,0,0,0};
        obj.india(arr);
        for(int x:arr){
            System.out.println(x);
        }
        
    }
    
}
