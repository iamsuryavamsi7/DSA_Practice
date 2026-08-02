# Dry Run - Next Permutation

## Input

```text
[1, 2, 3]
```

---

## Step 1

Traverse from the right.

Find the first index where

```text
arr[i] < arr[i + 1]
```

```text
1 2 3
    ↑
```

Break Point

```text
Index = 1

Value = 2
```

---

## Step 2

Traverse again from the right.

Find the first number greater than

```text
2
```

Found

```text
3
```

Swap

```text
1 3 2
```

---

## Step 3

Reverse everything after the break point.

Current suffix

```text
2
```

Already reversed.

Final Answer

```text
1 3 2
```

---

# Another Example

Input

```text
1 5 4 3 2
```

---

## Step 1

Traverse from right.

Find

```text
1 < 5
```

Break Point

```text
Index = 0
```

---

## Step 2

Find the smallest number greater than

```text
1
```

From the right,

```text
2
```

Swap

```text
2 5 4 3 1
```

---

## Step 3

Reverse everything after the break point.

Before Reverse

```text
5 4 3 1
```

After Reverse

```text
1 3 4 5
```

Final Answer

```text
2 1 3 4 5
```

---

# Special Case

Input

```text
3 2 1
```

No break point exists.

Therefore,

reverse the entire array.

Output

```text
1 2 3
```

---

# Key Learning

The algorithm finds the smallest possible arrangement that is greater than the current permutation.

Steps:

```text
Find Break Point

↓

Find Next Greater Element

↓

Swap

↓

Reverse Remaining Suffix
```

This guarantees the next lexicographical permutation in **O(n)** time.