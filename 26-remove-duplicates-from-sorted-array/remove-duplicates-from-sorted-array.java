class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Edge case: empty array
        }

        int i = 0; // Pointer for the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // If a new unique element is found
                i++; // Move the unique pointer forward
                nums[i] = nums[j]; // Copy the unique element to its correct position
            }
        }
        return i + 1; // Return the count of unique elements
    }
}