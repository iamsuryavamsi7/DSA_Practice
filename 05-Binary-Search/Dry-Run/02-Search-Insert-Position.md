# Dry Run - Search Insert Position

## Input

```text
Array:
[1, 3, 5, 6]

Target:
4
```

Expected result:

```text
2
```

---

# Initial State

```text
Index:  0  1  2  3
Array: [1, 3, 5, 6]
        ↑        ↑
       left     right
```

```text
left = 0
right = 3
```

---

# Iteration 1

Calculate:

```text
mid = (0 + 3) / 2
mid = 1
```

Value:

```text
array[1] = 3
```

Compare:

```text
3 < 4
```

Therefore target must be on the right.

Move:

```text
left = mid + 1
```

So:

```text
left = 2
right = 3
```

---

# Iteration 2

Calculate:

```text
mid = (2 + 3) / 2
mid = 2
```

Value:

```text
array[2] = 5
```

Compare:

```text
5 > 4
```

Therefore target must be on the left.

Move:

```text
right = mid - 1
```

So:

```text
left = 2
right = 1
```

---

# Search Ends

Now:

```text
left > right
```

Therefore the target does not exist.

The important part:

```text
left = 2
```

This is the correct insertion position.

---

# Final Result

Original:

```text
[1, 3, 5, 6]
```

Insert `4` at index `2`:

```text
[1, 3, 4, 5, 6]
```

Therefore:

```text
Answer = 2
```

---

# Dry Run Table

| Iteration | Left | Mid | Right | Mid Value | Decision |
|---|---:|---:|---:|---:|---|
| 1 | 0 | 1 | 3 | 3 | Move left → 2 |
| 2 | 2 | 2 | 3 | 5 | Move right → 1 |
| End | 2 | - | 1 | - | Return left = 2 |

---

# Additional Examples

## Target Exists

```text
Array:  [1, 3, 5, 6]
Target: 5
```

Target exists at:

```text
index 2
```

Result:

```text
2
```

---

## Target Before Everything

```text
Array:  [1, 3, 5, 6]
Target: 0
```

Eventually:

```text
left = 0
right = -1
```

Return:

```text
0
```

---

## Target After Everything

```text
Array:  [1, 3, 5, 6]
Target: 7
```

Eventually:

```text
left = 4
right = 3
```

Return:

```text
4
```

---

# Key Learning

When the target is not found:

```text
left > right
```

and:

```text
left
```

is the correct insertion position.

This is the important boundary concept introduced by this problem.