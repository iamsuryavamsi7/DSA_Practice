# Lesson 08 - Greatest Common Divisor (GCD)

## Objective

Learn how to find the Greatest Common Divisor (GCD) of two numbers using brute force and later optimize it using the Euclidean Algorithm.

---

# Concepts Covered

- Divisors
- Greatest Common Divisor
- Modulus Operator (%)
- Brute Force
- Optimization
- Euclidean Algorithm
- Time Complexity
- Space Complexity

---

# What is GCD?

The Greatest Common Divisor (GCD) is the largest number that divides both numbers completely.

Example

```text
12 and 18

Divisors of 12

1 2 3 4 6 12

Divisors of 18

1 2 3 6 9 18

Common Divisors

1 2 3 6

Greatest = 6
```

---

# Brute Force Idea

```text
Find all common divisors

↓

Keep updating the greatest divisor found

↓

Return the greatest divisor
```

---

# Complexity (Brute Force)

Time Complexity

```text
O(min(a, b))
```

Space Complexity

```text
O(1)
```

---

# Key Learning

The GCD problem is another application of divisibility.

Later, we'll optimize this dramatically using the Euclidean Algorithm.

---

# Interview Tip

Always explain the brute-force solution before introducing Euclid's Algorithm.