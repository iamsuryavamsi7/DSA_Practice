# Dry Run - Maximum Subarray Sum (Kadane's Algorithm)

## Input

```text
[-2, 3, -1, 2]
```

Expected Output

```text
Maximum Sum = 4

Subarray = [3, -1, 2]
```

---

## Variables

```text
currentSum = 0
maxSum = -∞

tempStart = 0
left = 0
right = 0
```

---

# Iteration 1

Index

```text
0
```

Current Number

```text
-2
```

Current Sum

```text
0 + (-2)

= -2
```

Update Maximum?

```text
-2 > -∞

YES
```

Update

```text
maxSum = -2

left = 0
right = 0
```

Current Sum becomes negative.

Reset

```text
currentSum = 0

tempStart = 1
```

---

# Iteration 2

Index

```text
1
```

Current Number

```text
3
```

Current Sum

```text
0 + 3

= 3
```

Update Maximum?

```text
3 > -2

YES
```

Update

```text
maxSum = 3

left = tempStart = 1

right = 1
```

---

# Iteration 3

Index

```text
2
```

Current Number

```text
-1
```

Current Sum

```text
3 + (-1)

= 2
```

Update Maximum?

```text
2 > 3

NO
```

Current Sum is positive.

Continue.

---

# Iteration 4

Index

```text
3
```

Current Number

```text
2
```

Current Sum

```text
2 + 2

= 4
```

Update Maximum?

```text
4 > 3

YES
```

Update

```text
maxSum = 4

left = 1

right = 3
```

---

# Loop Ends

Maximum Sum

```text
4
```

Indices

```text
left = 1

right = 3
```

Subarray

```text
[3, -1, 2]
```

---

# Key Learning

Whenever the running sum becomes negative,

```text
currentSum < 0
```

we discard the current subarray because it can only reduce the sum of future subarrays.

The next element becomes the start of a new candidate subarray.

```text
tempStart = i + 1
```

Whenever a better maximum sum is found,

```text
left = tempStart

right = current index
```

This allows Kadane's Algorithm to return both the maximum sum and the actual subarray while maintaining:

```text
Time Complexity : O(n)

Space Complexity : O(1)
```