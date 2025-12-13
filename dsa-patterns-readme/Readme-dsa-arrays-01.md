# Arrays and Strings - 20 Questions
This Readme contains a list of 20 common questions related to arrays and strings, often encountered in technical interviews and coding challenges. Each question is designed to test your understanding of fundamental concepts and problem-solving skills in these areas.
## Questions
1. **Two Sum**:
    
    Given an array of integers `nums` and an `integer` target, return indices of the two numbers such that they add up to `target`.  
    You may assume that each input would have _**exactly**_ **one solution**, and you may not use the same element twice. You can return the answer in any order.
    
    **Example 1:**
    ``` 
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   ```

    **Example 2:**
    ```
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    ```
    
    **Example 3:**
    ``` 
    Input: nums = [3,3], target = 6
    Output: [0,1]
   ```
    
    **Constraints:**
    - `2 <= nums.length <= 10^4`
    - `-10^9 <= nums[i] <= 10^9`
    - `-10^9 <= target <= 10^9`
    - **Only one valid answer exists.**
    
    **Follow-up:** Can you come up with an algorithm that is less than `O(n2)` time complexity?


2. **Best Time to Buy and Sell Stock:**

    You are given an array `prices` where `prices[i]` is the price of a given stock on the **i<sup>th</sup>** day. 
    You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.
    Return _*the maximum profit you can achieve from this transaction*_. If you cannot achieve any profit, return `0`.

    **Example 1:**
    ``` 
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    ```
    
    **Example 2:**
    ```
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: In this case, no transactions are done and the max profit = 0.
   ```
    
    **Constraints:**
    - `1 <= prices.length <= 10^5`
    - `0 <= prices[i] <= 10^4`
