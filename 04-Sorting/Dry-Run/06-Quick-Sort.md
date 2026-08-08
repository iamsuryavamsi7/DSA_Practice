# Dry Run - Quick Sort

## Input

```
[7, 3, 8, 2, 6, 4, 5]
```

Pivot = 5

---

## Initial

```
7 3 8 2 6 4 5
            ↑
         Pivot
```

first = -1

---

## second = 0

7 > 5

Nothing happens.

```
7 3 8 2 6 4 5
```

---

## second = 1

3 < 5

Increment first.

Swap(0,1)

```
3 7 8 2 6 4 5
```

---

## second = 2

8 > 5

Nothing happens.

```
3 7 8 2 6 4 5
```

---

## second = 3

2 < 5

Increment first.

Swap(1,3)

```
3 2 8 7 6 4 5
```

---

## second = 4

6 > 5

Nothing happens.

---

## second = 5

4 < 5

Increment first.

Swap(2,5)

```
3 2 4 7 6 8 5
```

---

Traversal completed.

Current first = 2

Pivot Position = first + 1 = 3

Swap Pivot

```
3 2 4 5 6 8 7
```

Pivot is now fixed.

Recursive Calls

```
sort(0,2)

sort(4,6)
```

The same process continues until every partition contains one element.

---

# Final Output

```
[2,3,4,5,6,7,8]
```