# Binary Exponentiation

Binary Exponentiation is an algorithm to calculate powers efficiently.

Instead of multiplying the base repeatedly,

we divide the exponent by 2.

Observation:

If exponent is even

a^8

=

(a^4)^2

If exponent is odd

a^9

=

a × a^8

This reduces the number of multiplications dramatically.

Time Complexity

O(log n)

Space Complexity

O(1)

Applications

- Modular Exponentiation
- Cryptography (RSA)
- Competitive Programming
- Matrix Exponentiation
- Combinatorics