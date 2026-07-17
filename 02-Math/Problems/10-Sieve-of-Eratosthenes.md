# Problem 10: Sieve of Eratosthenes

## Problem Statement

Given an integer `n`, print all prime numbers from `2` to `n`.

### Example 1

Input:
```
n = 20
```

Output:
```
2 3 5 7 11 13 17 19
```

---

### Example 2

Input:
```
n = 10
```

Output:
```
2 3 5 7
```

---

## Constraints

- 2 <= n <= 10^7

---

## Brute Force Approach

For every number from `2` to `n`:

- Check whether it is prime.
- If it is prime, print it.

### Complexity

Time:
```
O(n√n)
```

Space:
```
O(1)
```

---

## Optimized Approach (Sieve of Eratosthenes)

Instead of checking every number individually:

- Assume every number is prime.
- Start from 2.
- Mark all multiples of 2 as non-prime.
- Move to the next unmarked number.
- Mark all of its multiples.
- Continue until √n.

Finally, all unmarked numbers are prime.

### Complexity

Time:
```
O(n log log n)
```

Space:
```
O(n)
```