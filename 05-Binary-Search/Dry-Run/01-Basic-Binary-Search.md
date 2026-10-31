# Dry Run - Basic Binary Search

## Input

```text
Array:
[2, 5, 8, 12, 16, 23, 38, 45, 50]

Target:
23
```

---

# Initial State

Indexes:

```text
 0   1   2   3   4   5   6   7   8
[2,  5,  8, 12, 16, 23, 38, 45, 50]
 ↑                                   ↑
left                                right
```

Therefore:

```text
left = 0
right = 8
```

---

# Iteration 1

Calculate:

```text
mid = (left + right) / 2
```

Therefore:

```text
mid = (0 + 8) / 2
mid = 4
```

Value at index `4`:

```text
16
```

Compare:

```text
23 > 16
```

Therefore the target must be on the right.

Discard:

```text
[2, 5, 8, 12, 16]
```

New boundaries:

```text
left = 5
right = 8
```

---

# Iteration 2

Search space:

```text
[23, 38, 45, 50]
 ↑              ↑
left           right
```

Calculate:

```text
mid = (5 + 8) / 2
mid = 6
```

Value:

```text
38
```

Compare:

```text
23 < 38
```

Therefore the target must be on the left.

Discard:

```text
[38, 45, 50]
```

New boundaries:

```text
left = 5
right = 5
```

---

# Iteration 3

Search space:

```text
[23]
 ↑
left/right
```

Calculate:

```text
mid = (5 + 5) / 2
mid = 5
```

Value:

```text
23
```

Compare:

```text
23 == 23
```

Target found.

---

# Result

```text
Target:
23

Index:
5
```

---

# Dry Run Table

| Iteration | Left | Mid | Right | Mid Value | Decision |
|---|---:|---:|---:|---:|---|
| 1 | 0 | 4 | 8 | 16 | Search right |
| 2 | 5 | 6 | 8 | 38 | Search left |
| 3 | 5 | 5 | 5 | 23 | Found |

---

# Missing Target Example

Array:

```text
[3, 7, 11, 15]
```

Target:

```text
10
```

### Iteration 1

```text
left = 0
right = 3
mid = 1
value = 7
```

Since:

```text
10 > 7
```

move right:

```text
left = 2
```

---

### Iteration 2

```text
left = 2
right = 3
mid = 2
value = 11
```

Since:

```text
10 < 11
```

move left:

```text
right = 1
```

Now:

```text
left = 2
right = 1
```

Therefore:

```text
left > right
```

The search space is empty.

Target is not present.

---

# Important Observation

The search space changes like this:

```text
[2, 5, 8, 12, 16, 23, 38, 45, 50]

        ↓

[23, 38, 45, 50]

        ↓

[23]

        ↓

FOUND
```

The algorithm does not physically create new arrays.

It simply changes:

```text
left
right
```

to represent the remaining search space.

---

# Key Learning

Binary Search works because every comparison allows us to eliminate approximately half of the remaining search space.

```text
O(log n)
```