# Best Case, Average Case & Worst Case

## Best Case

The minimum number of operations required by an algorithm.

Example:

Searching the first element.

Time Complexity:

O(1)

---

## Average Case

The expected number of operations for a typical input.

Example:

Searching an element near the middle.

Time Complexity:

Usually simplified using Big O.

---

## Worst Case

The maximum number of operations required by an algorithm.

Example:

Searching the last element or an element that does not exist.

Time Complexity:

O(n)

---

## Why Worst Case Matters

Software systems must perform acceptably even under the most demanding inputs.

Therefore, interviewers usually ask for the Worst Case Time Complexity.

---

## Examples

Linear Search

Best: O(1)

Average: O(n)

Worst: O(n)

---

Binary Search

Best: O(1)

Average: O(log n)

Worst: O(log n)

---

Array Access

Best: O(1)

Average: O(1)

Worst: O(1)

---

## Key Learning

Always clarify which case is being analyzed.

If no case is specified, assume Worst Case.