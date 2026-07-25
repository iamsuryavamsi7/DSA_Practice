# Rearrange Array by Sign

## Goal

Arrange the array so that:

- Positive numbers occupy even indices.
- Negative numbers occupy odd indices.
- Preserve the original order of positive numbers.
- Preserve the original order of negative numbers.

---

## Learning Objectives

After completing this problem, you should understand:

- Index Manipulation
- Two Independent Pointers
- Stable Rearrangement
- Extra Array Technique

---

## Interview Importance

Difficulty

Medium

Frequently Asked In

- Amazon
- Microsoft
- Google
- Adobe
- Flipkart

---

## Time Complexity

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n) | O(n) |
| Optimal | O(n) | O(n) |

---

## Key Learning

Maintain two indices:

- Even Index → Positive Numbers
- Odd Index → Negative Numbers

Traverse the array once.

Whenever a positive number is found, place it at the next even index.

Whenever a negative number is found, place it at the next odd index.

Increase the corresponding index by **2**.