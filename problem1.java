class Solution {
   // public Object nums;

    public void segregate0and1(int[] nums) {
        int countZero = 0;
       // this . number = nums;

        // Step 1: Count number of 0s
        for (int x : nums) {
            if (x == 0) {
                countZero++;
            }
        }

        // Step 2: Fill 0s in the beginning
        for (int i = 0; i < countZero; i++) {
            nums[i] = 0;
        }

        // Step 3: Fill 1s in the rest
        for (int i = countZero; i < nums.length; i++) {
            nums[i] = 1;
        }
    }
}
  public class problem1{
    public static void main(String[] args) {
        int[] nums = {1,0,9,8,0,0};
        Solution obj = new Solution();
        obj.segregate0and1(nums);
        for(int x : nums){
            System.out.println(x+"");
        }
    }
  }