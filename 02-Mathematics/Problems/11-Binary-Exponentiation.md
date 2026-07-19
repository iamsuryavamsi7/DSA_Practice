# Problem 11: Binary Exponentiation

## Problem Statement

Given two integers `base` and `power`, calculate:

base^power

---

### Example 1

Input

base = 2

power = 10

Output

1024

---

### Example 2

Input

base = 3

power = 5

Output

243

---

## Brute Force

Multiply the base by itself `power` times.

Time Complexity

O(n)

Space Complexity

O(1)

---

## Optimized

Use Binary Exponentiation (Exponentiation by Squaring).

Time Complexity

O(log n)

Space Complexity

O(1)