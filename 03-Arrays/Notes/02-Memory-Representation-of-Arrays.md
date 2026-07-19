# 📚 Lesson 02 - Memory Representation of Arrays

---

# Why Learn Memory Representation?

Understanding memory representation explains:

- Why array access is O(1)
- Why arrays are fast
- Why arrays have fixed size
- Why insertion and deletion are costly
- Why ArrayList exists

---

# Computer Memory

RAM can be imagined as a long sequence of memory locations.

```
Address

1000
1001
1002
1003
1004
1005
...
```

Each memory location has a unique address.

---

# Individual Variables

```java
int a = 10;
int b = 20;
int c = 30;
```

Memory may look like:

```
1000 → 10

2050 → 20

5096 → 30
```

Variables are **not necessarily stored together**.

---

# Arrays in Memory

```java
int[] arr = {10,20,30,40,50};
```

Memory:

```
1000 → 10

1004 → 20

1008 → 30

1012 → 40

1016 → 50
```

Notice that every element is stored next to the previous one.

This is called:

> **Contiguous Memory Allocation**

---

# Why Does the Address Increase by 4?

An `int` occupies **4 bytes**.

```
arr[0] → 1000

arr[1] → 1004

arr[2] → 1008

arr[3] → 1012

arr[4] → 1016
```

If the data type were `double`, the addresses would increase by 8 bytes.

---

# Base Address

Every array has a starting address.

Example:

```
Base Address = 1000
```

Every other element is calculated from this base address.

---

# Address Calculation

Conceptually, the address of an element is:

```
Address = Base Address + (Index × Size of Data Type)
```

Example:

```
Base Address = 1000

Index = 3

Size = 4
```

Calculation:

```
1000 + (3 × 4)

= 1012
```

So:

```
arr[3]
```

points to address **1012**.

---

# Why is Array Access O(1)?

To access:

```java
arr[3]
```

The computer performs:

1. One multiplication
2. One addition
3. One memory access

No searching is required.

Therefore:

```
Time Complexity = O(1)
```

---

# Why Does Indexing Start at 0?

For the first element:

```
Address = Base + (0 × Size)
```

```
Address = Base
```

The first element starts exactly at the base address.

Zero-based indexing makes address calculation simple and efficient.

---

# Visualization

```
Index

0      1      2      3      4

 ↓      ↓      ↓      ↓      ↓

1000   1004   1008   1012   1016

 ↓      ↓      ↓      ↓      ↓

10     20     30     40     50
```

---

# Invalid Index

```java
int[] arr = {10,20,30,40,50};

arr[100];
```

Result:

```
ArrayIndexOutOfBoundsException
```

Java checks whether an index is within the valid range before accessing an element.

---

# Java Memory Note

The memory addresses shown in these notes are only for illustration.

In Java:

- Memory is managed by the JVM.
- Real memory addresses are hidden.
- Arrays are objects stored on the heap.
- The JVM handles allocation and garbage collection automatically.

---

# Key Takeaways

- Arrays are stored in contiguous memory.
- Every array has a base address.
- Elements are accessed using address calculation.
- Accessing any element takes O(1).
- Arrays have fixed size because a contiguous memory block is allocated during creation.

---

# Interview Questions

1. What is contiguous memory allocation?
2. What is a base address?
3. How is the address of `arr[i]` calculated conceptually?
4. Why is array access O(1)?
5. Why do array indexes start at 0?
6. Why can't arrays grow after they are created?