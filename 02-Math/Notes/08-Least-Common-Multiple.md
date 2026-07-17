# Lesson 09 - Least Common Multiple (LCM)

## Objective

Learn how to calculate the Least Common Multiple (LCM) using a brute-force approach and later optimize it using the relationship between GCD and LCM.

---

# Concepts Covered

- Multiples
- Least Common Multiple
- Brute Force
- Mathematical Observation
- GCD and LCM Relationship
- Euclidean Algorithm
- Time Complexity
- Space Complexity

---

# What is LCM?

The Least Common Multiple (LCM) is the smallest positive number that is divisible by both given numbers.

Example

```text
12 and 18

Multiples of 12

12
24
36
48
60
...

Multiples of 18

18
36
54
72
...

LCM = 36
```

---

# Brute Force Idea

```text
Start from the larger number

↓

Check whether it is divisible by both numbers

↓

If yes

Return it

Else

Check the next number
```

---

# Complexity (Brute Force)

Time Complexity

Depends on the distance to the first common multiple.

Worst Case

```text
O(a × b)
```

Space Complexity

```text
O(1)
```

---

# Key Learning

LCM can be calculated directly using GCD.

Later we'll learn the formula:

```text
LCM(a, b) = (a × b) / GCD(a, b)
```

---

# Interview Tip

Always explain the brute-force approach first before introducing the optimized mathematical formula.