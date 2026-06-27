# 🎯 Interview Patterns Guide

> **"The hardest part of DSA is not writing code. It is recognizing the correct pattern."**

---

# 📖 Introduction

When solving interview problems, never ask:

> "Which algorithm should I use?"

Instead, ask a series of smaller questions until only one pattern remains.

This document acts as a decision tree to help identify the correct approach.

---

# 🧠 Pattern Recognition Flow

```text
Read the Problem
        │
        ▼
Understand Input & Output
        │
        ▼
Identify Constraints
        │
        ▼
Recognize the Pattern
        │
        ▼
Choose the Algorithm
        │
        ▼
Implement
        │
        ▼
Analyze Complexity
```

---

# 🟦 Pattern 1 — Arrays

## When to Use

* Array is given.
* Need traversal.
* Need searching.
* Need insertion or deletion.
* Need rearrangement.

## Common Keywords

* Maximum
* Minimum
* Reverse
* Rotate
* Frequency
* Majority

## Common Problems

* Second Largest Element
* Move Zeroes
* Rotate Array
* Best Time to Buy Stock

---

# 🟩 Pattern 2 — Strings

## When to Use

* Characters
* Words
* Text
* Substrings

## Keywords

* Palindrome
* Anagram
* Character Count
* Reverse String

## Common Problems

* Valid Palindrome
* Group Anagrams
* Longest Common Prefix

---

# 🟨 Pattern 3 — Hashing

## When to Use

Need:

* Fast lookup
* Frequency counting
* Duplicate detection
* Pair finding

## Keywords

* Count
* Frequency
* Duplicate
* Pair
* Exists

## Data Structures

* HashMap
* HashSet

## Common Problems

* Two Sum
* Contains Duplicate
* Majority Element

---

# 🟧 Pattern 4 — Prefix Sum

## When to Use

Need repeated range calculations.

## Keywords

* Sum between indices
* Range Sum
* Continuous Sum
* Subarray Sum

## Common Problems

* Range Sum Query
* Subarray Sum Equals K

---

# 🟥 Pattern 5 — Suffix Sum

## When to Use

Need information from right to left.

## Keywords

* Product Except Self
* Right Side Sum
* Suffix Information

---

# 🟪 Pattern 6 — Difference Array

## When to Use

Need multiple range updates.

## Keywords

* Increment Range
* Update Range
* Interval Updates

---

# 🟫 Pattern 7 — Kadane's Algorithm

## When to Use

Maximum or minimum contiguous subarray.

## Keywords

* Maximum Sum
* Contiguous
* Largest Subarray

---

# 🔵 Pattern 8 — Two Pointers

## Decision Tree

```text
Need two indices?

        │
       Yes
        │
Is array/string sorted?

        │
       Yes
        │
Use Two Pointers
```

## Keywords

* Pair
* Sorted
* Two Sum
* Remove Duplicates
* Palindrome

## Common Problems

* Two Sum II
* Container With Most Water
* Remove Duplicates
* Valid Palindrome

---

# 🟢 Pattern 9 — Sliding Window

## Decision Tree

```text
Need contiguous subarray?

        │
       Yes
        │
Need longest?

Need shortest?

Need maximum?

Need minimum?

↓

Sliding Window
```

## Keywords

* Longest Substring
* Window
* Continuous
* Subarray
* Substring

## Common Problems

* Maximum Sum Subarray
* Longest Substring Without Repeating Characters
* Minimum Window Substring

---

# 🟡 Pattern 10 — Binary Search

## Decision Tree

```text
Sorted Data?

       │
      Yes
       │
Need Fast Search?

↓

Binary Search
```

## Keywords

* Sorted
* Search
* First
* Last
* Lower Bound
* Upper Bound

---

# 🟠 Pattern 11 — Binary Search on Answer

## Decision Tree

```text
Need minimum value?

Need maximum value?

Can answer be checked?

↓

Binary Search on Answer
```

## Keywords

* Minimize
* Maximize
* Capacity
* Speed
* Distance

## Common Problems

* Koko Eating Bananas
* Aggressive Cows
* Allocate Books
* Ship Packages Within D Days

---

# 🔴 Pattern 12 — Linked List

## Keywords

* Node
* Next
* Reverse
* Cycle
* Middle

## Common Problems

* Reverse Linked List
* Detect Cycle
* Merge Lists

---

# 🟣 Pattern 13 — Stack

## Keywords

* Undo
* Backtracking
* Parentheses
* Expression
* Previous

## Common Problems

* Valid Parentheses
* Min Stack
* Evaluate Postfix

---

# 🟤 Pattern 14 — Monotonic Stack

## Keywords

* Next Greater
* Previous Smaller
* Histogram
* Span

## Common Problems

* Next Greater Element
* Largest Rectangle
* Daily Temperatures

---

# ⚫ Pattern 15 — Queue

## Keywords

* FIFO
* Scheduling
* BFS
* Waiting

---

# ⚪ Pattern 16 — Monotonic Queue

## Keywords

* Sliding Window Maximum
* Window Minimum

---

# 🔷 Pattern 17 — Heap

## Keywords

* K Largest
* K Smallest
* Top K
* Priority

## Common Problems

* Kth Largest
* Merge K Lists
* Top K Frequent Elements

---

# 🌳 Pattern 18 — Tree

## Keywords

* Parent
* Child
* Height
* Depth
* Traversal

## Traversals

* Preorder
* Inorder
* Postorder
* Level Order

---

# 🌲 Pattern 19 — BST

## Keywords

* Sorted Tree
* Search
* Insert
* Delete

---

# 🌐 Pattern 20 — Graph

## Keywords

* Network
* Connected
* Path
* Island
* City
* Route

## Algorithms

* BFS
* DFS

---

# 🔗 Pattern 21 — Union Find

## Keywords

* Connected Components
* Merge Groups
* Connectivity

---

# 📚 Pattern 22 — Topological Sort

## Keywords

* Dependency
* Prerequisite
* Course Schedule

---

# ⚡ Pattern 23 — Greedy

## Keywords

* Maximum Profit
* Minimum Cost
* Best Choice
* Local Optimum

---

# 🧩 Pattern 24 — Dynamic Programming

## Decision Tree

```text
Overlapping Subproblems?

↓

YES

Need optimal answer?

↓

YES

↓

Dynamic Programming
```

## Keywords

* Minimum
* Maximum
* Count Ways
* Number of Ways
* Optimal
* Best

---

# 💡 Pattern 25 — Bit Manipulation

## Keywords

* XOR
* Power of Two
* Unique Number
* Toggle Bits

---

# 🧠 Complete Decision Tree

```text
Problem
│
├── Sorted?
│      ├── Binary Search
│      └── Two Pointers
│
├── Range Sum?
│      ├── Prefix Sum
│      └── Suffix Sum
│
├── Range Update?
│      └── Difference Array
│
├── Maximum Contiguous?
│      └── Kadane
│
├── Longest / Shortest Window?
│      └── Sliding Window
│
├── Pair / Frequency?
│      └── Hashing
│
├── Parentheses?
│      └── Stack
│
├── Next Greater?
│      └── Monotonic Stack
│
├── Top K?
│      └── Heap
│
├── Tree?
│      ├── DFS
│      └── BFS
│
├── Graph?
│      ├── BFS
│      ├── DFS
│      ├── Union Find
│      └── Topological Sort
│
└── Optimal Solution?
       └── Dynamic Programming
```

---

# 🚀 Interview Checklist

Before writing code, ask yourself:

* [ ] Is the input sorted?
* [ ] Do I need fast lookup?
* [ ] Is this a range query?
* [ ] Is this a contiguous subarray?
* [ ] Is there a window?
* [ ] Do I need two pointers?
* [ ] Is recursion required?
* [ ] Is this a graph?
* [ ] Is this a tree?
* [ ] Are there overlapping subproblems?
* [ ] Can I optimize using a better pattern?

If you can answer these questions consistently, you'll identify the right approach much more quickly during interviews.

---

# 🌟 Final Advice

The goal is **not** to memorize hundreds of problems.

The goal is to recognize that many interview questions are variations of the same underlying patterns.

Master the patterns, and unfamiliar problems become much easier to tackle.
