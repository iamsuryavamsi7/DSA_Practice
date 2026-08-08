# Counting Sort

## Difficulty

Easy / Medium

---

# Problem Statement

Given an array of non-negative integers, sort the array in ascending order using the **Counting Sort** algorithm.

Do not use Java's built-in sorting methods.

---

# Example

### Input

```text
[4, 2, 2, 8, 3, 3, 1]
```

### Output

```text
[1, 2, 2, 3, 3, 4, 8]
```

---

# Constraints

The basic implementation assumes:

- Array contains non-negative integers.
- The value range is reasonably small.
- The array may contain duplicate values.

---

# Approach

Counting Sort uses a frequency array.

### Step 1

Find the largest value.

```java
int largest = Integer.MIN_VALUE;
```

### Step 2

Create the frequency array.

```java
int[] frequencyArr = new int[largest + 1];
```

### Step 3

Count each value.

```java
for (int num : targetArr) {
    frequencyArr[num]++;
}
```

### Step 4

Traverse the frequency array and reconstruct the original array.

---

# Java Implementation

```java
public static void sort(int[] targetArr) {

    int largest = Integer.MIN_VALUE;

    for (int num : targetArr) {
        if (num > largest) {
            largest = num;
        }
    }

    int[] frequencyArr = new int[largest + 1];

    for (int num : targetArr) {
        frequencyArr[num]++;
    }

    int currentIndex = 0;

    for (int i = 0; i < frequencyArr.length; i++) {

        for (int j = 0; j < frequencyArr[i]; j++) {
            targetArr[currentIndex] = i;
            currentIndex++;
        }
    }
}
```

---

# Time Complexity

Let:

```text
n = number of elements
k = range of values
```

Time complexity:

```text
O(n + k)
```

---

# Space Complexity

The frequency array requires:

```text
O(k)
```

additional space.

---

# Important Learning

Counting Sort is a:

```text
Non-Comparison Sorting Algorithm
```

It does not compare values against each other.

Instead:

```text
Value → Frequency → Sorted Output
```

---

# Advantages

- Fast when the value range is small.
- Simple implementation.
- O(n + k) time complexity.
- Does not rely on comparisons.

---

# Disadvantages

- Requires additional memory.
- Poor choice when the range of values is very large.
- Basic implementation does not directly support negative values.

---

# Status

## ✅ Completed

- [x] Find maximum
- [x] Create frequency array
- [x] Count frequencies
- [x] Reconstruct sorted array
- [x] Understand O(n + k) complexity
- [x] Understand O(k) space complexity

---

# Key Pattern

```text
Find Maximum
      ↓
Frequency Array
      ↓
Count
      ↓
Reconstruct
      ↓
Sorted Array
```