# Dry Run - Boyer-Moore Voting Algorithm

Input

[2,2,1,1,1,2,2]

---

Initial State

candidate = -

count = 0

---

Iteration 1

Current = 2

count == 0

candidate = 2

count = 1

---

Iteration 2

Current = 2

Same candidate

count = 2

---

Iteration 3

Current = 1

Different element

count = 1

---

Iteration 4

Current = 1

Different element

count = 0

---

Iteration 5

Current = 1

count == 0

candidate = 1

count = 1

---

Iteration 6

Current = 2

Different element

count = 0

---

Iteration 7

Current = 2

count == 0

candidate = 2

count = 1

---

First Pass Completed

Candidate = 2

---

Verification Pass

Frequency of 2 = 4

Array Length = 7

Required Frequency > 3

Condition

4 > 3

True

Answer = 2

---

Final Complexity

Time Complexity

O(n)

Space Complexity

O(1)

---

Learning

The majority element survives every cancellation because it occurs more than all remaining elements combined.