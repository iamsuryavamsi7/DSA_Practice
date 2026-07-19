# Lesson 10 - Prime Factorization

## Objective

Learn how to decompose a number into its prime factors.

---

# Concepts Covered

- Factors
- Prime Numbers
- Prime Factors
- Prime Factorization
- Brute Force
- Square Root Optimization
- Time Complexity
- Space Complexity

---

# What is Prime Factorization?

Prime Factorization means expressing a number as the product of prime numbers.

Example

```text
60

↓

2 × 2 × 3 × 5
```

Every composite number has a unique prime factorization.

---

# Brute Force Idea

```text
Start from 2

↓

Check whether it divides the number

↓

If yes

Store the factor

Divide the number

Repeat

Else

Move to the next number
```

---

# Complexity (Brute Force)

Time Complexity

```text
O(n)
```

Space Complexity

```text
O(k)
```

where `k` is the number of prime factors stored.

---

# Optimization

Instead of checking up to `n`, we only need to check up to `√n`.

If a factor greater than `√n` exists, the corresponding smaller factor has already been processed.

---

# Interview Tip

Prime Factorization is frequently combined with GCD, LCM, divisors, and number theory problems.

Understanding it well will make many future problems much easier.