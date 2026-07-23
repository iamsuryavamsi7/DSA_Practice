# Majority Element

## Problem Statement

Given an integer array `nums`, return the majority element.

A majority element is an element that appears **more than ⌊n / 2⌋ times**.

If no majority element exists, return `-1`.

---

## Examples

### Example 1

Input

[3,2,3]

Output

3

---

### Example 2

Input

[2,2,1,1,1,2,2]

Output

2

---

### Example 3

Input

[1,2,3,4]

Output

-1

---

## Constraints

- 1 <= nums.length <= 10⁵
- -10⁹ <= nums[i] <= 10⁹

---

## Approaches

### Approach 1 - Brute Force

For every element, count its frequency by traversing the complete array.

Time Complexity

O(n²)

Space Complexity

O(1)

---

### Approach 2 - Better (HashMap)

Store the frequency of every element using a HashMap.

Find the element having the maximum frequency and verify whether its frequency is greater than n / 2.

Time Complexity

O(n)

Space Complexity

O(n)

---

### Approach 3 - Optimal (Boyer-Moore Voting Algorithm)

Maintain two variables.

- candidate
- count

Traverse the array.

- If count becomes 0, choose the current element as candidate.
- If current element equals candidate, increment count.
- Otherwise decrement count.

Finally verify whether the candidate occurs more than n / 2 times.

Time Complexity

O(n)

Space Complexity

O(1)

---

## Interview Pattern

- Hashing
- Frequency Counting
- Boyer-Moore Voting Algorithm

---

## Important Points

- Boyer-Moore works because every different element cancels one occurrence of the majority element.
- If the problem guarantees that a majority element always exists, the verification pass is optional.
- Otherwise, always verify the candidate.

---

## Related Problems

- Find the Number Appears Once
- Majority Element II
- Top K Frequent Elements