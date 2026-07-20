# Dry Run - Union of Two Sorted Arrays

## Example

Input

```text
Array A = [1,2,2,3,5]

Array B = [2,3,4,4,6]
```

---

## Initial State

```text
first = 0
second = 0

Union = []
```

---

## Iteration 1

```
A[first] = 1
B[second] = 2

1 < 2

Add 1

Move first
```

Union

```text
[1]
```

---

## Iteration 2

```
A[first] = 2
B[second] = 2

Equal

Add 2

Move both pointers
```

Union

```text
[1,2]
```

---

## Iteration 3

```
A[first] = 2
B[second] = 3

2 < 3

Already added

Move first
```

Union

```text
[1,2]
```

---

## Iteration 4

```
A[first] = 3
B[second] = 3

Equal

Add 3

Move both pointers
```

Union

```text
[1,2,3]
```

---

## Iteration 5

```
A[first] = 5
B[second] = 4

4 < 5

Add 4

Move second
```

Union

```text
[1,2,3,4]
```

---

## Iteration 6

```
A[first] = 5
B[second] = 4

Already added

Move second
```

Union

```text
[1,2,3,4]
```

---

## Iteration 7

```
A[first] = 5
B[second] = 6

5 < 6

Add 5

Move first
```

Union

```text
[1,2,3,4,5]
```

---

## Remaining Elements

Array A finished.

Array B still contains

```
6
```

Add remaining element.

Final Union

```text
[1,2,3,4,5,6]
```

---

## Dry Run Table

| Step | A[first] | B[second] | Action | Union |
|------|---------:|----------:|--------|-------|
| 1 | 1 | 2 | Add 1 | [1] |
| 2 | 2 | 2 | Add 2 | [1,2] |
| 3 | 2 | 3 | Skip duplicate | [1,2] |
| 4 | 3 | 3 | Add 3 | [1,2,3] |
| 5 | 5 | 4 | Add 4 | [1,2,3,4] |
| 6 | 5 | 4 | Skip duplicate | [1,2,3,4] |
| 7 | 5 | 6 | Add 5 | [1,2,3,4,5] |
| End | - | 6 | Add remaining | [1,2,3,4,5,6] |

---

## Time Complexity

```
O(n + m)
```

---

## Space Complexity

```
O(n + m)
```

---

## Key Observation

- Two pointers traverse both arrays simultaneously.
- Smaller value is added first.
- Equal values are added only once.
- Remaining elements are appended after one array is exhausted.
- Duplicate checking is done in O(1) by comparing with the last inserted value.