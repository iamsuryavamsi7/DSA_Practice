# 📚 Lesson 01 - Introduction to Arrays

---

# What is an Array?

An **Array** is a **linear data structure** that stores a collection of elements of the **same data type** in **contiguous memory locations**.

In simple terms:

> An array is a fixed-size collection of similar elements stored one after another in memory.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

# Real-Life Example

Imagine a row of lockers.

```
Locker 0   Locker 1   Locker 2   Locker 3   Locker 4

   📦          📦          📦          📦          📦
   10          20          30          40          50
```

Each locker has:

- An index
- One value

Instead of searching every locker, we directly access the required locker using its index.

---

# Characteristics of Arrays

## 1. Fixed Size

The size of an array is fixed when it is created.

```java
int[] arr = new int[5];
```

The array will always contain five elements.

---

## 2. Homogeneous

All elements must have the same data type.

Valid:

```java
int[] numbers = {1,2,3};
```

Valid:

```java
String[] names = {"Alice","Bob"};
```

Invalid:

```java
int[] arr = {1,"Hello",5};
```

---

## 3. Indexed

Arrays use **zero-based indexing**.

```
Index

0  1  2  3  4

Value

10 20 30 40 50
```

The first element is always at index **0**.

---

## 4. Contiguous Memory

Array elements are stored next to each other in memory.

```
1000 → 10

1004 → 20

1008 → 30

1012 → 40

1016 → 50
```

This property allows fast element access.

---

# Why Do We Need Arrays?

Without arrays:

```java
int student1 = 90;
int student2 = 85;
int student3 = 76;
...
```

Managing thousands of variables becomes impossible.

Using an array:

```java
int[] marks = new int[1000];
```

Now every student's marks can be accessed using an index.

---

# Advantages

- Stores multiple values together
- Fast random access
- Easy traversal
- Memory efficient
- Simple implementation

---

# Disadvantages

- Fixed size
- Insertion is expensive
- Deletion is expensive
- Stores only one data type
- Requires contiguous memory

---

# Common Applications

- Student marks
- Employee IDs
- Monthly sales
- Images (pixels)
- Audio samples
- Video frames
- Sensor data
- Database records

---

# Example

```java
public class ArraysIntroduction {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }

}
```

Output

```
10
40
50
```

---

# Key Takeaways

- Arrays are linear data structures.
- Elements are stored in contiguous memory.
- Arrays store only one data type.
- Arrays have fixed size.
- Arrays use zero-based indexing.
- Accessing an element is very fast.

---

# Interview Questions

1. What is an array?
2. Why do we need arrays?
3. Why are arrays homogeneous?
4. Why is array indexing zero-based?
5. What are the advantages of arrays?
6. What are the disadvantages of arrays?