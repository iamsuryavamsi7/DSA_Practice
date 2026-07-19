# Dry Run - Greatest Common Divisor (GCD)

## Input

```text
a = 12

b = 18
```

---

# Initial State

| Variable | Value |
|----------|------:|
| a | 12 |
| b | 18 |
| gcd | 1 |

---

# Dry Run

| Current Number | Divides 12? | Divides 18? | Current GCD |
|---------------:|:-----------:|:-----------:|------------:|
| 1 | ✅ | ✅ | 1 |
| 2 | ✅ | ✅ | 2 |
| 3 | ✅ | ✅ | 3 |
| 4 | ✅ | ❌ | 3 |
| 5 | ❌ | ❌ | 3 |
| 6 | ✅ | ✅ | 6 |
| 7 | ❌ | ❌ | 6 |
| 8 | ❌ | ❌ | 6 |
| 9 | ❌ | ✅ | 6 |
| 10 | ❌ | ❌ | 6 |
| 11 | ❌ | ❌ | 6 |
| 12 | ✅ | ❌ | 6 |

---

# Final Output

```text
6
```

---

# Complexity Analysis

Time Complexity

```text
O(min(a, b))
```

Space Complexity

```text
O(1)
```

---

# Observation

The brute-force solution checks every number from `1` to the smaller of the two inputs.

Although correct, it performs unnecessary checks.

In the next lesson, we'll learn the **Euclidean Algorithm**, which reduces the time complexity dramatically and is one of the most important algorithms in computer science.