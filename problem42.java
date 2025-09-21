class segregate{
    public void seggregatetwonum(int arr[]){
        int countzero = 0;

    // Counting no of zeros
       for(int x: arr){
        if(x==0) countzero++;
            
        }//printing
         for( int i = 0; i<countzero;i++){
            arr[i]=0;
         }
           //printing others
           for(int i =countzero;i<arr.length;i++){
            arr[i] = 1;
           }
           
           
        }
    }public class problem42 {
    public static void main(String[] args){
        int []arr = {1,1,1,1,0,0,0,0};
        segregate obj = new segregate();
        obj.seggregatetwonum(arr);
        for(int x:arr){
            System.out.println(x);
        }

    }
        
    }

    

