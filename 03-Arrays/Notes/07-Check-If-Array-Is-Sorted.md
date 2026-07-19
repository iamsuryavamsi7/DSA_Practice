# Check if an Array is Sorted

## Problem Statement

Given an integer array, determine whether the array is sorted in **non-decreasing order**.

A non-decreasing array satisfies:

arr[i] <= arr[i + 1]

for every valid index.

Return:

- true → if the array is sorted.
- false → otherwise.

---

## Examples

Example 1

Input

[1, 2, 3, 4, 5]

Output

true

---

Example 2

Input

[1, 2, 2, 3, 5]

Output

true

---

Example 3

Input

[1, 5, 3, 4]

Output

false

---

Example 4

Input

[5]

Output

true

---

Example 5

Input

[]

Output

true

---

## Observations

- Every element should be less than or equal to the next element.
- Only adjacent elements need to be compared.
- One incorrect pair makes the entire array unsorted.
- Duplicates are allowed.

---

## Brute Force Idea

Compare every element with every element that comes after it.

If any previous element is greater than a later element, the array is not sorted.

Although this works, many unnecessary comparisons are performed.

Expected Time Complexity:

O(n²)

Expected Space Complexity:

O(1)

---

## Optimal Idea

Instead of comparing every pair, compare only adjacent elements.

If at any position:

arr[i] > arr[i + 1]

the array is not sorted.

Otherwise, continue until the end.

Expected Time Complexity:

O(n)

Expected Space Complexity:

O(1)

---

## Edge Cases

Empty array

[]

Single element

[5]

All duplicates

[7,7,7,7]

Already sorted

[1,2,3,4]

Descending order

[5,4,3,2]

Unsorted in the middle

[1,2,7,5,8]

---

## Common Mistakes

- Forgetting that duplicate values are allowed.
- Comparing every element with every other element.
- Running the loop one iteration too far.
- Not handling empty arrays.
- Not handling single-element arrays.

---

## Interview Questions

- How would you check if an array is strictly increasing?
- How would you check if an array is sorted in descending order?
- How would you check if an array is sorted in either ascending or descending order?

---

## Key Takeaways

- Look for relationships between adjacent elements.
- Stop immediately when a violation is found.
- Always think about edge cases before implementation.