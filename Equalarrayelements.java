
class Solution {

    public int minMoves(int[] nums) {

        int min = nums[0];

        // Find minimum element
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        // Calculate minimum moves
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans += nums[i] - min;
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int nums[] = {32, 1, 45};

        System.out.println(obj.minMoves(nums));
    }
}
