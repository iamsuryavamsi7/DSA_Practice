# Counting Sort

## Overview

Counting Sort is a **non-comparison-based sorting algorithm**.

Unlike Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, and Quick Sort, Counting Sort does not compare elements with each other.

Instead, it counts how many times each value occurs.

---

# Core Idea

Given:

```text
[4, 2, 2, 8, 3, 3, 1]
```

We count the frequency of every value.

```text
Value:     0 1 2 3 4 5 6 7 8
Frequency: 0 1 2 2 1 0 0 0 1
```

This tells us:

```text
1 → appears 1 time
2 → appears 2 times
3 → appears 2 times
4 → appears 1 time
8 → appears 1 time
```

We can then reconstruct the array in sorted order:

```text
[1, 2, 2, 3, 3, 4, 8]
```

---

# Algorithm

1. Find the largest value in the array.
2. Create a frequency array of size `largest + 1`.
3. Traverse the input array and count each value.
4. Traverse the frequency array.
5. Write each value back into the original array according to its frequency.

---

# Step 1 - Find Largest Value

```java
int largest = Integer.MIN_VALUE;

for (int num : targetArr) {
    if (num > largest) {
        largest = num;
    }
}
```

For:

```text
[4, 2, 2, 8, 3, 3, 1]
```

we get:

```text
largest = 8
```

---

# Step 2 - Create Frequency Array

```java
int[] frequencyArr = new int[largest + 1];
```

We use `largest + 1` because array indexes start from `0`.

If:

```text
largest = 8
```

we need indexes:

```text
0 1 2 3 4 5 6 7 8
```

Therefore:

```text
array size = 9
```

---

# Step 3 - Count Frequencies

```java
for (int num : targetArr) {
    frequencyArr[num]++;
}
```

For:

```text
[4, 2, 2, 8, 3, 3, 1]
```

the frequency array becomes:

```text
Value:     0 1 2 3 4 5 6 7 8
Frequency: 0 1 2 2 1 0 0 0 1
```

---

# Step 4 - Reconstruct the Array

Traverse the frequency array.

For every value:

```text
frequency[i] = number of times i appears
```

Write `i` into the original array that many times.

Example:

```text
frequency[1] = 1
```

Write:

```text
1
```

Then:

```text
frequency[2] = 2
```

Write:

```text
2 2
```

Then:

```text
frequency[3] = 2
```

Write:

```text
3 3
```

Final:

```text
[1, 2, 2, 3, 3, 4, 8]
```

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

Counting Sort takes:

```text
O(n + k)
```

because:

1. Finding the maximum → `O(n)`
2. Counting frequencies → `O(n)`
3. Traversing the frequency array → `O(k)`
4. Reconstructing the array → `O(n)` in total

Therefore:

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

Therefore:

```text
Space = O(k)
```

---

# Example

Input:

```text
[3, 1, 2, 3, 1]
```

Largest:

```text
3
```

Frequency array:

```text
[0, 2, 1, 2]
```

Reconstruction:

```text
1 → 2 times
2 → 1 time
3 → 2 times
```

Output:

```text
[1, 1, 2, 3, 3]
```

---

# Advantages

- Does not use comparisons.
- Can be faster than comparison-based sorting.
- Simple when the value range is small.
- Can achieve `O(n + k)` time complexity.

---

# Disadvantages

- Requires extra memory.
- Not suitable when the value range is extremely large.
- Basic implementation works with non-negative integers.
- Not a general-purpose replacement for comparison-based sorting.

---

# Important Limitation

Consider:

```text
[1, 2, 3, 1000000]
```

The largest value is:

```text
1000000
```

A basic Counting Sort would need a frequency array containing approximately one million positions.

Even though the input contains only four elements.

Therefore, Counting Sort is useful when:

```text
k is reasonably small compared with n
```

---

# Negative Numbers

The basic implementation assumes non-negative integers.

For example:

```text
[-3, -1, -2, 0, 2]
```

cannot directly be used as indexes:

```java
frequencyArr[-3]
```

A modified Counting Sort can handle negative values by using an offset.

This is an advanced variation and is not part of the current basic implementation.

---

# Comparison With Other Sorting Algorithms

| Algorithm | Best | Average | Worst | Extra Space |
|---|---:|---:|---:|---:|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) average |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | O(k) |

---

# Key Learning

Counting Sort does not ask:

```text
Is A greater than B?
```

Instead, it asks:

```text
How many times does this value occur?
```

Core pattern:

```text
Find Maximum
     ↓
Create Frequency Array
     ↓
Count Values
     ↓
Reconstruct Array
```

---

# Important Distinction

Counting Sort is a **non-comparison-based sorting algorithm**.

It works by using the values themselves as indexes into a frequency array.