class Solution {
    public int[] resultArray(int[] nums) {
        int len = nums.length;

        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        int idx1 = 1;
        int idx2 = 1;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for (int i = 2; i < len; i++) {

            if (arr1[idx1 - 1] > arr2[idx2 - 1]) {
                arr1[idx1++] = nums[i];
            } else {
                arr2[idx2++] = nums[i];
            }
        }

        for(int i= 0;i<idx2;i++){
            arr1[idx1++]=arr2[i];
        }

        return arr1;
    }
}