class Target{
    public boolean Solution(int []arr){
        int target = 80;
        int n= arr.length;
        for(int i = 0;i<n ;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j]==target){
                    System.out.println(arr[i]+"+" +arr[j]+"="+target);
                    return true;
                    
                }

        }
    }System.out.println("Pair Not Found");
     return false;
}
}

public class problem6 {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        Target obj = new Target();
        obj.Solution(arr);
        
    }

    
}
