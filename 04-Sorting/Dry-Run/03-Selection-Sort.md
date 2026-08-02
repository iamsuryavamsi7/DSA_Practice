# Dry Run - Selection Sort

## Input

```text
[5, 3, 8, 4, 2]
```

---

## Pass 1

Find the smallest element.

```text
5 3 8 4 2
        ↑
```

Smallest = 2

Swap with index 0.

```text
2 3 8 4 5
```

---

## Pass 2

Remaining array

```text
3 8 4 5
```

Smallest = 3

Already in the correct position.

No swap required.

---

## Pass 3

Remaining

```text
8 4 5
```

Smallest = 4

Swap

```text
2 3 4 8 5
```

---

## Pass 4

Remaining

```text
8 5
```

Smallest = 5

Swap

```text
2 3 4 5 8
```

---

## Final Output

```text
[2, 3, 4, 5, 8]
```

---

# Key Observation

After every pass,

the smallest element is placed in its final sorted position.

The sorted portion always grows from the beginning of the array.