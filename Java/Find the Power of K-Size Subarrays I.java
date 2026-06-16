class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            result[i] = nums[i + k - 1];

            for (int j = i + 1; j <= i + k - 1; j++) {
                if (nums[j] != nums[j - 1] + 1) {
                    result[i] = -1;
                    break;
                }
            }
        }

        return result;
    }
}
