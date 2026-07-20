# Dry Run - Intersection of Two Sorted Arrays

## Example

Input

```text
Array A = [1,2,2,3,4,5]

Array B = [2,2,3,5,6]
```

---

## Initial State

```text
first = 0
second = 0

Intersection = []
```

---

## Iteration 1

```
A[first] = 1
B[second] = 2

1 < 2

Move first pointer
```

Intersection

```text
[]
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

Intersection

```text
[2]
```

---

## Iteration 3

```
A[first] = 2
B[second] = 2

Equal

Already added

Move both pointers
```

Intersection

```text
[2]
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

Intersection

```text
[2,3]
```

---

## Iteration 5

```
A[first] = 4
B[second] = 5

4 < 5

Move first pointer
```

Intersection

```text
[2,3]
```

---

## Iteration 6

```
A[first] = 5
B[second] = 5

Equal

Add 5

Move both pointers
```

Intersection

```text
[2,3,5]
```

---

## Loop Ends

Array A has been completely traversed.

The remaining element in Array B is ignored because an intersection requires elements to be present in both arrays.

---

## Final Answer

```text
[2,3,5]
```

---

## Dry Run Table

| Step | A[first] | B[second] | Action | Intersection |
|------|---------:|----------:|--------|--------------|
| 1 | 1 | 2 | Move first | [] |
| 2 | 2 | 2 | Add 2 | [2] |
| 3 | 2 | 2 | Skip duplicate | [2] |
| 4 | 3 | 3 | Add 3 | [2,3] |
| 5 | 4 | 5 | Move first | [2,3] |
| 6 | 5 | 5 | Add 5 | [2,3,5] |

---

## Time Complexity

```
O(n + m)
```

where

- n = size of first array
- m = size of second array

Each pointer moves at most once through its respective array.

---

## Space Complexity

```
O(k)
```

where

- k = number of unique common elements

Worst Case

```
O(min(n, m))
```

because the intersection cannot contain more elements than the smaller array.

---

## Key Observations

- Since both arrays are sorted, we can compare the current elements directly.
- If the first element is smaller, move the first pointer.
- If the second element is smaller, move the second pointer.
- If both elements are equal, add the value (only once) and move both pointers.
- Duplicate values are avoided by comparing with the last inserted value.
- Each element is visited at most once, making the solution optimal.