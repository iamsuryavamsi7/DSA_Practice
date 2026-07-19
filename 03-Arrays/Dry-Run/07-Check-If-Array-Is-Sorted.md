# Dry Run - Check if an Array is Sorted

## Example

Input

```text
[1, 2, 3, 5, 4]
```

---

Initial State

```
isSorted = true
```

---

Iteration 1

```
Previous = 1
Current  = 2

1 <= 2

isSorted = true
```

---

Iteration 2

```
Previous = 2
Current  = 3

2 <= 3

isSorted = true
```

---

Iteration 3

```
Previous = 3
Current  = 5

3 <= 5

isSorted = true
```

---

Iteration 4

```
Previous = 5
Current  = 4

5 <= 4

isSorted = false
```

Loop stops.

---

Final Output

```text
false
```

---

## Dry Run Table

| Iteration | Previous | Current | Comparison | isSorted |
|-----------|----------|---------|------------|----------|
| 1 | 1 | 2 | 1 ≤ 2 | true |
| 2 | 2 | 3 | 2 ≤ 3 | true |
| 3 | 3 | 5 | 3 ≤ 5 | true |
| 4 | 5 | 4 | 5 ≤ 4 | false |

---

## Observation

The first incorrect adjacent pair is enough to conclude that the array is not sorted.

No further comparisons are required.