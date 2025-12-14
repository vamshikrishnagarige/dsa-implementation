package com.vamshi.dsa.arrays.question0001;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-12-2025
 */
public class SumOfTwoIntegers {
    int[] sumOfTwoIntegers(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] + nums[i + 1] == target) {
                res[0] = i;
                res[1] = i + 1;
                return res;
            }
        }
        return res;
    }
}
