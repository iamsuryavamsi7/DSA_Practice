# Next Permutation

## Problem Statement

Given an array representing a permutation of numbers, rearrange it into the next lexicographically greater permutation.

If such a permutation does not exist, rearrange it into the lowest possible order (ascending order).

The rearrangement must be done in-place using constant extra memory.

---

## Examples

### Example 1

Input

```text
[1, 2, 3]
```

Output

```text
[1, 3, 2]
```

---

### Example 2

Input

```text
[3, 2, 1]
```

Output

```text
[1, 2, 3]
```

---

### Example 3

Input

```text
[1, 1, 5]
```

Output

```text
[1, 5, 1]
```

---

## Intuition

A permutation is simply one arrangement of numbers.

For example,

```text
1 2 3
```

All permutations in lexicographical order are

```text
1 2 3
1 3 2
2 1 3
2 3 1
3 1 2
3 2 1
```

The next permutation means moving to the next arrangement in this ordering.

For example,

```text
Current

1 3 2
```

Next

```text
2 1 3
```

---

## Brute Force Approach

### Idea

Generate every permutation.

Sort all permutations.

Find the current permutation.

Return the next one.

If the current permutation is the last one,

return the first permutation.

---

## Time Complexity

```text
O(n! × n)
```

---

## Space Complexity

```text
O(n!)
```

---

# Optimal Approach

## Key Observation

Traverse from the right side.

Find the first index where

```text
arr[i] < arr[i + 1]
```

This position is called the **break point** because after this point, the sequence becomes decreasing.

---

### Step 1

Find the break point.

Example

```text
1 2 7 4 3 1
      ↑
```

Here,

```text
2 < 7
```

So,

```text
breakPoint = 1
```

---

### Step 2

Traverse again from the right.

Find the first number greater than

```text
arr[breakPoint]
```

Swap them.

---

### Step 3

Reverse everything after the break point.

Since that part is already in decreasing order,

reversing it gives the smallest possible suffix.

This guarantees the immediate next permutation.

---

## Algorithm

1. Find the break point.
2. If no break point exists:
    - Reverse the entire array.
3. Otherwise:
    - Find the first greater element from the right.
    - Swap.
    - Reverse the remaining suffix.

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

---

# Pattern Used

- Reverse Traversal
- Greedy
- Two Pointers
- Swapping
- Array Reversal

---

# Key Learning

The solution does not generate every permutation.

Instead, it makes the smallest possible change that creates the next larger permutation.

This makes the algorithm linear instead of factorial.

---

# Interview Tips

Most interviewers expect the optimal solution.

The important insight is identifying the **break point** and understanding why reversing the suffix produces the next lexicographically smallest arrangement.

---

# Similar Problems

- Previous Permutation
- Permutations
- Permutations II
- Lexicographical Numbers
- Rearrange Array