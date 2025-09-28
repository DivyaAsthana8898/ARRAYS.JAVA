    class sol{
        public boolean hasNoDuplicates(int[] nums) {
        if (nums.length == 0) return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return false; // duplicate found
            }
        }
        return true; // no duplicates
    }
}



public class problen15 {
    public static void main(String[] args) {
        int []nums ={10,10,20,30,40,50};
        sol obj = new sol();
         obj.hasNoDuplicates(nums);
    }
}
    
