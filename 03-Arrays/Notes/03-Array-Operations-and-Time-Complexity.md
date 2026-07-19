# 📚 Lesson 03 - Array Operations & Time Complexity

---

# Why Learn Array Operations?

Almost every array interview problem involves one or more of these operations:

- Access
- Update
- Traversal
- Search
- Insertion
- Deletion

Understanding how these operations work helps explain their time complexities instead of simply memorizing them.

---

# Array Operations

| Operation | Time Complexity |
|-----------|----------------:|
| Access | O(1) |
| Update | O(1) |
| Traversal | O(n) |
| Search (Linear Search) | O(n) |
| Insertion | O(n) |
| Deletion | O(n) |

---

# 1. Access

Example:

```java
int[] arr = {10,20,30,40,50};

System.out.println(arr[3]);
```

Output

```
40
```

## Why is it O(1)?

Arrays are stored in contiguous memory.

The address of an element is calculated using:

```
Address = Base Address + (Index × Size of Data Type)
```

The computer directly jumps to the required memory location.

No searching is performed.

### Time Complexity

```
O(1)
```

---

# 2. Update

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

Only one memory location changes.

### Time Complexity

```
O(1)
```

---

# 3. Traversal

Traversal means visiting every element exactly once.

Example:

```java
for (int value : arr) {
    System.out.println(value);
}
```

Traversal order

```
Index

0
↓
1
↓
2
↓
3
↓
4
```

Every element is visited exactly once.

### Time Complexity

```
O(n)
```

where **n** is the number of elements in the array.

---

# 4. Search (Linear Search)

Suppose we want to find:

```
40
```

The computer compares one element at a time.

```
10 ❌

20 ❌

30 ❌

40 ✅
```

Worst case:

```
10

20

30

40

50
```

Every element may need to be checked.

### Time Complexity

```
O(n)
```

> Later, Binary Search improves searching to **O(log n)** on sorted arrays.

---

# 5. Insertion

## Important Note

Java arrays have **fixed size**.

If an array is already full, a new larger array must be created to insert another element.

Example:

```java
int[] arr = {10,20,30,40,50};
```

To insert `25`, we must create:

```java
int[] newArr = new int[6];
```

copy the existing elements, insert `25`, and then copy the remaining elements.

---

## DSA Concept

Most DSA problems assume the array has extra capacity.

Example:

```
Capacity = 10

Logical Size = 5
```

```
10 20 30 40 50 _ _ _ _ _
```

Insert `25` after `20`.

Before

```
10 20 30 40 50
```

After shifting

```
10 20 _ 30 40 50
```

Insert

```
10 20 25 30 40 50
```

Notice:

- Physical Capacity = 10
- Logical Size changes from 5 → 6

The array itself does **not** grow.

---

## Why is Insertion O(n)?

Elements after the insertion point must shift one position to the right.

Worst case:

Insert at index 0.

```
10 20 30 40 50

↓

5 10 20 30 40 50
```

Every element moves.

### Time Complexity

```
O(n)
```

---

# 6. Deletion

Example:

```
10 20 30 40 50
```

Delete `20`.

Shift every remaining element left.

```
10 30 40 50 50
```

Notice that the last value is duplicated.

The array length is still **5**.

We simply reduce the logical size.

```
Logical Size = 4
```

Only the first four elements are now considered valid.

```
10 30 40 50
```

Sometimes we may clear the last position for readability.

```
10 30 40 50 0
```

This is optional.

The important change is reducing the logical size.

---

## Why is Deletion O(n)?

Deleting an element requires shifting all subsequent elements one position to the left.

Worst case:

Deleting the first element requires shifting every remaining element.

### Time Complexity

```
O(n)
```

---

# Logical Size vs Physical Size

This is an important concept.

Suppose:

```
Capacity = 10

Logical Size = 5
```

```
10 20 30 40 50 _ _ _ _ _
```

After deleting `20`

```
10 30 40 50 _ _ _ _ _ _
```

Physical Capacity remains

```
10
```

Logical Size becomes

```
4
```

Only the first four positions are considered valid.

---

# Arrays vs ArrayList

| Feature | Array | ArrayList |
|---------|--------|-----------|
| Size | Fixed | Dynamic |
| Insert when Full | Create new array manually | Creates larger internal array automatically |
| Delete | Shift elements, logical size decreases | Shift elements automatically |
| Random Access | O(1) | O(1) |

ArrayList is internally implemented using a dynamically resized array.

---

# Summary

| Operation | Description | Time Complexity |
|-----------|-------------|----------------:|
| Access | Read element using index | O(1) |
| Update | Modify element using index | O(1) |
| Traversal | Visit every element | O(n) |
| Search | Compare one by one | O(n) |
| Insertion | Shift elements right | O(n) |
| Deletion | Shift elements left | O(n) |

---

# Key Takeaways

- Arrays provide constant-time random access.
- Updating an element is also constant time.
- Traversal requires visiting every element.
- Linear Search checks elements one by one.
- Insertion and deletion are expensive because elements must be shifted.
- Java arrays have fixed size.
- DSA often uses the concept of **logical size** and **physical capacity**.
- ArrayList overcomes the fixed-size limitation by creating larger arrays internally.

---

# Interview Questions

1. Why is array access O(1)?
2. Why are insertion and deletion O(n)?
3. What is the difference between logical size and physical size?
4. Why can't Java arrays grow automatically?
5. How does ArrayList overcome the fixed-size limitation?
6. When would you choose an array over an ArrayList?