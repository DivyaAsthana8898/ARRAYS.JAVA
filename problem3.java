
//mport static Solution.largest;

class Solution{
  public static void largest( int [] arr){
          int n = arr.length;
          int max = Integer.MIN_VALUE;
          int smax = Integer.MIN_VALUE;
          for(int i= 0;i<n;i++){
            if(arr[i]>max){
                smax = max;
                 max  = arr[i];

            }
            //for(int i=0;i<n;i++){
           else   if (arr[i] >smax && arr[i]!=max){
                smax= arr[i];


             }
            //   System.out.println(max);
            // System.out.println(smax);
            }
        

          
            System.out.println(max);
            System.out.println(smax);
        }
        //  System.out.println(max);
        //     System.out.println(smax);
    
    
}

           
  public class problem3 {
    public static void main(String[] args) {
        int []arr1 = {10,20,30,40,50};
        Solution.largest(arr1);//static me class ka naam  .method(var)


        
    }  //NON STATIC ME CLASS OBJ = NEW CLASS();
         //OBJ.METHOD(ARG);

    
}




