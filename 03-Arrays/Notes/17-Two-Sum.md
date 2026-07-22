# 17. Two Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

Each input has exactly one solution.

You may not use the same element twice.

You can return the answer in any order.

---

## Example 1

Input

```text
nums = [2, 7, 11, 15]
target = 9
```

Output

```text
[0, 1]
```

Explanation

```text
nums[0] + nums[1] = 2 + 7 = 9
```

---

## Example 2

Input

```text
nums = [3, 2, 4]
target = 6
```

Output

```text
[1, 2]
```

---

## Example 3

Input

```text
nums = [3, 3]
target = 6
```

Output

```text
[0, 1]
```

---

# Brute Force

## Intuition

Compare every element with every remaining element.

If their sum equals the target, return the indices.

### Algorithm

1. Pick one element.
2. Compare it with every remaining element.
3. If the sum equals the target, return the indices.
4. Otherwise continue.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

# Optimal Approach

## Pattern

HashMap

---

## Intuition

Instead of searching all previous elements,

store every visited element inside a HashMap.

For every current number,

calculate

```text
complement = target - nums[i]
```

If the complement already exists,

we have found the answer.

Otherwise,

store the current number inside the HashMap.

---

## Algorithm

1. Create an empty HashMap.
2. Traverse the array.
3. Calculate the complement.
4. Check whether the complement already exists.
5. If yes, return both indices.
6. Otherwise store the current element and continue.

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(n)
```

---

# Key Formula

```text
complement = target - nums[i]
```

---

# Interview Pattern

Whenever you see

- Pair
- Sum
- Lookup

always think about using a **HashMap**.