package com.vamshi.dsa.arrays.question0001;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Vamshi Krishna Garige
 * Description: Learning purpose.
 * Date: 13-12-2025
 */
public class SumOfTwoIntegersTest {

    private static List<List<Integer>> arrayOfIntegerList = Arrays.asList(
            Arrays.asList(2,7,11,15),
            Arrays.asList(3,2,4),
            Arrays.asList(3,3)
    );

    private static List<Integer> targetOutput = Arrays.asList(9, 6);

    private static List<List<Integer>> listOfSumOfTwoIntegers = null;

    private static SumOfTwoIntegers sumOfTwoIntegers = null;

    @Test
    public void testSumOfTwoIntegers() {

        if(targetOutput.size() == arrayOfIntegerList.size()) {
            listOfSumOfTwoIntegers = new ArrayList<>();
            sumOfTwoIntegers = new SumOfTwoIntegers();

            for (int i = 0; i < arrayOfIntegerList.size(); i++) {
                List<Integer> integerList = arrayOfIntegerList.get(i);

                int[] nums = integerList.stream().mapToInt(Integer::intValue).toArray();
                int[] result = sumOfTwoIntegers.sumOfTwoIntegers(nums, targetOutput.get(i));
                List<Integer> resList = new ArrayList<>();

                for (Integer res : result) {
                    resList.add(res);
                }

                listOfSumOfTwoIntegers.add(resList);
            }

            Assert.assertEquals(Arrays.asList(0, 1), listOfSumOfTwoIntegers.get(0));

            Assert.assertEquals(Arrays.asList(1, 2), listOfSumOfTwoIntegers.get(1));

            Assert.assertEquals(Arrays.asList(0, 1), listOfSumOfTwoIntegers.get(2));
        } else {
            Assert.assertNull(listOfSumOfTwoIntegers);
            Assert.assertNull(sumOfTwoIntegers);
        }
    }
}
