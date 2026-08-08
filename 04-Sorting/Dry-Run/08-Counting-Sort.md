# Dry Run - Counting Sort

## Input

```text
[4, 2, 2, 8, 3, 3, 1]
```

---

# Step 1 - Find Largest

Traverse the array:

```text
4 → largest = 4
2 → largest = 4
2 → largest = 4
8 → largest = 8
3 → largest = 8
3 → largest = 8
1 → largest = 8
```

Therefore:

```text
largest = 8
```

---

# Step 2 - Create Frequency Array

Create:

```text
int[] frequencyArr = new int[largest + 1];
```

Therefore:

```text
frequencyArr = new int[9]
```

Indexes:

```text
0 1 2 3 4 5 6 7 8
```

Initial state:

```text
[0, 0, 0, 0, 0, 0, 0, 0, 0]
```

---

# Step 3 - Count Frequencies

Input:

```text
[4, 2, 2, 8, 3, 3, 1]
```

### Read 4

```text
frequency[4]++
```

```text
[0, 0, 0, 0, 1, 0, 0, 0, 0]
```

### Read 2

```text
[0, 0, 1, 0, 1, 0, 0, 0, 0]
```

### Read 2

```text
[0, 0, 2, 0, 1, 0, 0, 0, 0]
```

### Read 8

```text
[0, 0, 2, 0, 1, 0, 0, 0, 1]
```

### Read 3

```text
[0, 0, 2, 1, 1, 0, 0, 0, 1]
```

### Read 3

```text
[0, 0, 2, 2, 1, 0, 0, 0, 1]
```

### Read 1

```text
[0, 1, 2, 2, 1, 0, 0, 0, 1]
```

---

# Frequency Table

```text
Value:     0 1 2 3 4 5 6 7 8
Frequency: 0 1 2 2 1 0 0 0 1
```

Meaning:

```text
1 → 1 time
2 → 2 times
3 → 2 times
4 → 1 time
8 → 1 time
```

---

# Step 4 - Reconstruct Array

Start:

```text
currentIndex = 0
```

---

## Value = 0

```text
frequency[0] = 0
```

Write nothing.

---

## Value = 1

```text
frequency[1] = 1
```

Write:

```text
targetArr[0] = 1
```

Array:

```text
[1, 2, 2, 8, 3, 3, 1]
```

Current index:

```text
1
```

---

## Value = 2

```text
frequency[2] = 2
```

Write:

```text
targetArr[1] = 2
targetArr[2] = 2
```

Array:

```text
[1, 2, 2, 8, 3, 3, 1]
```

Current index:

```text
3
```

---

## Value = 3

```text
frequency[3] = 2
```

Write:

```text
targetArr[3] = 3
targetArr[4] = 3
```

Array:

```text
[1, 2, 2, 3, 3, 3, 1]
```

Current index:

```text
5
```

---

## Value = 4

```text
frequency[4] = 1
```

Write:

```text
targetArr[5] = 4
```

Array:

```text
[1, 2, 2, 3, 3, 4, 1]
```

Current index:

```text
6
```

---

## Value = 8

```text
frequency[8] = 1
```

Write:

```text
targetArr[6] = 8
```

Final:

```text
[1, 2, 2, 3, 3, 4, 8]
```

---

# Final Result

```text
Input:
[4, 2, 2, 8, 3, 3, 1]

Output:
[1, 2, 2, 3, 3, 4, 8]
```

---

# Core Pattern

```text
Input Array
     ↓
Find Maximum
     ↓
Frequency Array
     ↓
Count Occurrences
     ↓
Read Frequency Array
     ↓
Write Values Back
     ↓
Sorted Array
```