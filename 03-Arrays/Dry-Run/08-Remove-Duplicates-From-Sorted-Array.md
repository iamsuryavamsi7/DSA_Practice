# Dry Run - Remove Duplicates from Sorted Array

## Example

Input

```text
[1, 1, 2, 2, 3, 3, 4]
```

---

## Initial State

```text
slow = 0

fast = 1
```

Array

```text
[1, 1, 2, 2, 3, 3, 4]
```

---

## Iteration 1

```
slow = 0
fast = 1

1 == 1

Duplicate found.

Move fast only.
```

Array

```text
[1, 1, 2, 2, 3, 3, 4]
```

---

## Iteration 2

```
slow = 0
fast = 2

1 != 2

Move slow

slow = 1

Copy

arr[1] = 2
```

Array

```text
[1, 2, 2, 2, 3, 3, 4]
```

---

## Iteration 3

```
slow = 1
fast = 3

2 == 2

Duplicate found.

Move fast only.
```

Array

```text
[1, 2, 2, 2, 3, 3, 4]
```

---

## Iteration 4

```
slow = 1
fast = 4

2 != 3

Move slow

slow = 2

Copy

arr[2] = 3
```

Array

```text
[1, 2, 3, 2, 3, 3, 4]
```

---

## Iteration 5

```
slow = 2
fast = 5

3 == 3

Duplicate found.

Move fast only.
```

---

## Iteration 6

```
slow = 2
fast = 6

3 != 4

Move slow

slow = 3

Copy

arr[3] = 4
```

Array

```text
[1, 2, 3, 4, 3, 3, 4]
```

---

## Final Result

Unique Elements

```text
[1, 2, 3, 4]
```

Return

```text
k = slow + 1 = 4
```

---

## Dry Run Table

| Iteration | slow | fast | Action | Array |
|-----------|-----:|-----:|--------|-------|
| Initial | 0 | 1 | Start | [1,1,2,2,3,3,4] |
| 1 | 0 | 1 | Duplicate | [1,1,2,2,3,3,4] |
| 2 | 1 | 2 | Copy 2 | [1,2,2,2,3,3,4] |
| 3 | 1 | 3 | Duplicate | [1,2,2,2,3,3,4] |
| 4 | 2 | 4 | Copy 3 | [1,2,3,2,3,3,4] |
| 5 | 2 | 5 | Duplicate | [1,2,3,2,3,3,4] |
| 6 | 3 | 6 | Copy 4 | [1,2,3,4,3,3,4] |

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

- The slow pointer always points to the last unique element.
- The fast pointer scans the array.
- Every new unique element is copied immediately after the previous unique element.
- The first `k` elements contain all unique values.
- Elements after `k` are irrelevant.