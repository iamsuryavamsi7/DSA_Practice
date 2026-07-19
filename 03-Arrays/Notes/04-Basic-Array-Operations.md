# 📚 Lesson 04 - Basic Array Operations

---

# Objective

In this lesson, we learn how to perform the basic operations on arrays using Java.

These operations are the foundation for solving almost every array-based interview problem.

---

# Topics Covered

- Creating Arrays
- Initializing Arrays
- Default Values
- Reading Elements
- Updating Elements
- Array Length
- Traversing Arrays
- Reverse Traversal
- Common Beginner Mistakes

---

# 1. Creating an Array

There are two common ways to create an array.

## Method 1

Declare first and create later.

```java
int[] numbers;

numbers = new int[5];
```

---

## Method 2

Declare and create together.

```java
int[] numbers = new int[5];
```

This is the most commonly used approach.

---

# 2. Initializing an Array

Instead of assigning values one by one,

```java
int[] numbers = {10,20,30,40,50};
```

Java automatically determines the size of the array.

Equivalent to:

```java
int[] numbers = new int[5];

numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

---

# 3. Default Values

When an array is created, Java automatically initializes every element.

## int

```java
int[] arr = new int[5];
```

```
0 0 0 0 0
```

---

## double

```java
double[] arr = new double[3];
```

```
0.0 0.0 0.0
```

---

## boolean

```java
boolean[] arr = new boolean[3];
```

```
false false false
```

---

## String

```java
String[] names = new String[3];
```

```
null null null
```

---

# 4. Reading Elements

Elements are accessed using their index.

Example:

```java
int[] arr = {10,20,30,40,50};

System.out.println(arr[0]);
System.out.println(arr[3]);
```

Output

```
10
40
```

Remember:

```
First Index = 0

Last Index = length - 1
```

---

# 5. Updating Elements

Example:

```java
int[] arr = {10,20,30,40,50};

arr[2] = 100;
```

Before

```
10 20 30 40 50
```

After

```
10 20 100 40 50
```

Updating an element takes **O(1)** time.

---

# 6. Array Length

Every array has a built-in property.

```java
arr.length
```

Example:

```java
System.out.println(arr.length);
```

Output

```
5
```

> **Note:** `length` is a property (field), not a method.

Correct:

```java
arr.length
```

Incorrect:

```java
arr.length()
```

---

# 7. Traversing an Array

Traversal means visiting every element exactly once.

---

## Traditional For Loop

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Advantages:

- Access to index
- Can modify elements
- Used in most DSA problems

---

## Enhanced For Loop (For-Each)

```java
for (int value : arr) {
    System.out.println(value);
}
```

Advantages:

- Cleaner syntax
- Easy to read

Limitations:

- No index
- Cannot directly update elements
- Not suitable for many interview problems

---

# 8. Reverse Traversal

Reverse traversal starts from the last element and moves towards the first.

Example:

```java
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}
```

Reverse traversal is frequently used in interview problems.

---

# 9. Common Beginner Mistakes

## Mistake 1

```java
arr[arr.length]
```

Incorrect.

Valid indexes are:

```
0

to

arr.length - 1
```

Correct:

```java
arr[arr.length - 1]
```

---

## Mistake 2

```java
for(int i=1;i<=arr.length;i++)
```

Incorrect.

Correct:

```java
for(int i=0;i<arr.length;i++)
```

---

## Mistake 3

```java
arr.length()
```

Incorrect.

Correct:

```java
arr.length
```

---

# Complexity Summary

| Operation | Time Complexity |
|------------|-----------------|
| Read | O(1) |
| Update | O(1) |
| Traversal | O(n) |
| Reverse Traversal | O(n) |

---

# Key Takeaways

- Arrays are created using the `new` keyword or initialized directly.
- Java automatically assigns default values to array elements.
- Arrays are accessed using indexes.
- Arrays use zero-based indexing.
- `length` returns the number of elements in an array.
- Traditional `for` loops are preferred in DSA because they provide access to indexes.
- Enhanced `for` loops are useful when only element values are needed.
- Reverse traversal is a common interview technique.

---

# Interview Questions

1. What are the two ways to create an array?
2. What are the default values of different array types?
3. What is the difference between `arr.length` and `arr.length()`?
4. When should we use a traditional `for` loop instead of a `for-each` loop?
5. How do you traverse an array in reverse order?
6. What causes an `ArrayIndexOutOfBoundsException`?