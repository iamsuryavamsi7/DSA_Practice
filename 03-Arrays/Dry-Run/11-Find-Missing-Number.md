# Dry Run - Find Missing Number (Sum Formula)

## Example

Input

```text
[1, 2, 4, 5]
```

Expected Numbers

```text
1 2 3 4 5
```

---

## Step 1 - Calculate Expected Sum

Numbers from `1` to `5`

```
1 + 2 + 3 + 4 + 5
```

Expected Sum

```
15
```

---

## Step 2 - Calculate Array Sum

Array

```
[1,2,4,5]
```

```
1 + 2 + 4 + 5
```

Array Sum

```
12
```

---

## Step 3 - Find Missing Number

```
Missing Number

= Expected Sum - Array Sum

= 15 - 12

= 3
```

---

## Dry Run Table

| Step | Operation | Value |
|------|-----------|------:|
| 1 | Expected Sum | 15 |
| 2 | Array Sum | 12 |
| 3 | Missing Number | 3 |

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Key Observation

- The expected sum is the sum of all numbers from `1` to `n`.
- The array sum is the sum of the existing elements.
- Their difference is the missing number.
- No extra array or HashMap is required.