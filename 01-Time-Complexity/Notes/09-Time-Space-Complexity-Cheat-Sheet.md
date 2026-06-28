# Time & Space Complexity Cheat Sheet

## Complexity Order

O(1)
↓

O(log n)
↓

O(n)
↓

O(n log n)
↓

O(n²)
↓

O(2ⁿ)
↓

O(n!)

---

## Arrays

Access → O(1)

Traversal → O(n)

Linear Search → O(n)

Binary Search → O(log n)

Insert at Beginning → O(n)

Delete at Beginning → O(n)

---

## ArrayList

get() → O(1)

add() → O(1) Amortized

remove(index) → O(n)

---

## Linked List

Access → O(n)

Insert Head → O(1)

Delete Head → O(1)

---

## Stack

Push → O(1)

Pop → O(1)

Peek → O(1)

---

## Queue

Enqueue → O(1)

Dequeue → O(1)

Front → O(1)

---

## HashMap

Put → O(1) Average

Get → O(1) Average

Remove → O(1) Average

---

## Heap

Insert → O(log n)

Remove → O(log n)

Peek → O(1)

---

## Golden Rules

Single Loop → O(n)

Nested Loop → O(n²)

Consecutive Loops → O(n)

Extra Array → O(n) Space

Matrix → O(n²) Space

Ignore Constants

Keep Dominant Term