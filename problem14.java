
class largest{
      void Comparision(int []arr){
        int max  = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max=arr[i];

            }
        }
             for(int i = 0;i<arr.length;i++){
                if(arr[i]>smax && arr[i]!=max){
                    tmax = smax;
                     arr[i]= smax;

                }

             } 
             for(int i = 0;i<arr.length;i++){
                if(arr[i]>tmax && arr[i]!=smax && arr[i]!=max){
                    
                    tmax=arr[i];

            }

        }System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
    }
}
  public class problem14 {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        largest obj = new largest();
        obj.Comparision(arr);
        
    }

    
}
