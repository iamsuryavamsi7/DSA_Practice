# Majority Element - Notes

## Definition

A majority element is an element whose frequency is greater than

n / 2

---

## Observation

If an element appears more than half the size of the array,

it can never be completely cancelled by all the remaining elements.

This observation leads to the Boyer-Moore Voting Algorithm.

---

# Approach 1

Brute Force

For every element,

count its occurrences by traversing the complete array.

Time Complexity

O(n²)

Space Complexity

O(1)

---

# Approach 2

HashMap

Store

Element → Frequency

Example

2 → 4

1 → 3

Then find the element having maximum frequency.

Finally verify

frequency > n / 2

Time Complexity

O(n)

Space Complexity

O(n)

---

# Approach 3

Boyer-Moore Voting Algorithm

Maintain

candidate

count

Rules

If count == 0

Choose current element as candidate.

If current element equals candidate

count++

Else

count--

Finally verify the candidate frequency.

Time Complexity

O(n)

Space Complexity

O(1)

---

# Complexity Comparison

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| HashMap | O(n) | O(n) |
| Boyer-Moore | O(n) | O(1) |

---

# Key Interview Takeaways

- Frequency counting is the first optimization.
- Boyer-Moore is one of the most frequently asked interview algorithms.
- Always perform a verification pass unless the problem guarantees a majority element.