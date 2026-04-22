# 🔹 Operators in Java – Complete Interview Preparation

This module covers **all operator-based problems** from **Basic → Medium → Hard**, along with **essential theory** required for interviews.

---

# 📘 ⚡ Quick Tutorial (Must-Know Concepts)

## 🔹 1. Arithmetic Operators

* `+  -  *  /  %`
* Integer division:

    * `5 / 2 = 2`
* Floating division:

    * `5.0 / 2 = 2.5`

---

## 🔹 2. Relational Operators

* `==  !=  >  <  >=  <=`
* Always return **boolean (true/false)**

---

## 🔹 3. Logical Operators

* `&&` (AND)
* `||` (OR)
* `!` (NOT)

### 💡 Short-Circuit:

* `false && anything → false` (second not evaluated)
* `true || anything → true`

---

## 🔹 4. Bitwise Operators (Most Important 🔥)

* `&` → AND
* `|` → OR
* `^` → XOR
* `~` → NOT
* `<<` → Left Shift
* `>>` → Right Shift

---

## 🔹 5. Key Bitwise Tricks (VERY IMPORTANT)

### ✅ Even / Odd

```java
n & 1
```

### ✅ Swap without temp

```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```

### ✅ Power of 2

```java
n > 0 && (n & (n - 1)) == 0
```

### ✅ Remove lowest set bit

```java
n & (n - 1)
```

### ✅ Count set bits (Brian Kernighan)

```java
while(n != 0){
    n = n & (n - 1);
    count++;
}
```

### ✅ Opposite signs

```java
(a ^ b) < 0
```

---

## 🔹 6. Ternary Operator

```java
result = (condition) ? value1 : value2;
```

---

## 🔹 7. Unary Operators

* `++` Increment
* `--` Decrement

### 💡 Important:

```java
int a = 5;
System.out.println(a++); // 5
System.out.println(++a); // 7
```

---

## 🔹 8. Assignment Operators

* `=  +=  -=  *=  /=  %=`

---

## 🔹 9. Operator Precedence (High → Low)

1. Unary (`++ -- ! ~`)
2. Multiplicative (`* / %`)
3. Additive (`+ -`)
4. Relational
5. Logical
6. Assignment

---

# 📌 🔰 BASIC LEVEL

## 1. Swap two numbers without temp variable

📂 `SwapWithoutTemp.java`

## 2. Check even/odd using bitwise

📂 `EvenOddBitwise.java`

## 3. Find max of two numbers using ternary

📂 `MaxUsingTernary.java`

## 4. Increment/decrement demo

📂 `IncrementDecrementDemo.java`

## 5. Logical AND/OR demo

📂 `LogicalOperatorsDemo.java`

## 6. Bitwise NOT demo

📂 `BitwiseNotDemo.java`

## 7. Check if number is power of 2

📂 `PowerOfTwo.java`

## 8. Count set bits in integer

📂 `CountSetBits.java`

## 9. Toggle case of character

📂 `ToggleCase.java`

## 10. Multiply by 2 using bitwise

📂 `MultiplyBy2.java`

---

# 📌 ⚡ MEDIUM LEVEL

## 11. Divide by 2 using bitwise

📂 `DivideBy2.java`

## 12. Find missing number in array using XOR

📂 `MissingNumberXOR.java`

## 13. Find single non-repeating element using XOR

📂 `SingleNonRepeating.java`

## 14. Implement addition without + operator

📂 `AddWithoutPlus.java`

## 15. Implement subtraction without - operator

📂 `SubtractWithoutMinus.java`

## 16. Implement multiplication without * operator

📂 `MultiplyWithoutOperator.java`

## 17. Implement division without / operator

📂 `DivideWithoutOperator.java`

## 18. Check if two numbers have opposite signs

📂 `OppositeSigns.java`

## 19. Find absolute value using bitwise

📂 `AbsoluteValueBitwise.java`

## 20. Swap bits at given positions

📂 `SwapBits.java`

---

# 📌 🔥 HARD LEVEL

## 21. Implement fast exponentiation using bitwise

📂 `FastExponentiation.java`

## 22. Implement modulo using bitwise

📂 `ModuloBitwise.java`

## 23. Find two non-repeating elements using XOR

📂 `TwoNonRepeating.java`

## 24. Find maximum XOR pair in array

📂 `MaxXORPair.java`

## 25. Implement bitmask for subsets

📂 `BitmaskSubsets.java`

## 26. Count number of bits to flip to convert A → B

📂 `BitsToFlip.java`

## 27. Find next higher number with same set bits

📂 `NextHigherSameBits.java`

## 28. Implement bitwise sieve for primes

📂 `BitwiseSieve.java`

## 29. Implement Gray code generator

📂 `GrayCode.java`

## 30. Implement bit manipulation based encryption

📂 `BitwiseEncryption.java`

---

# 🧠 Key Learning Outcomes

* Master **bitwise operations**
* Solve without using standard operators
* Think in **binary**
* Optimize solutions to **O(1) / O(log n)**

---

# 💡 Interview Tips

* XOR is your best friend
* Always think in binary
* Use bit tricks for optimization
* Practice edge cases

---

# 🚀 How to Run

```bash
javac FileName.java
java FileName
```

---

# 📌 Next Step

👉 Control Statements (if, switch, loops)

---

# 👨‍💻 Author

**Aniket Shubham**
🔗 GitHub: https://github.com/AniketShubham-Dev
🔗 LinkedIn: [www.linkedin.com/in/aniket-shubham-92b937104](http://www.linkedin.com/in/aniket-shubham-92b937104)

---

# ⭐ Contribution

* ⭐ Star the repo
* 🍴 Fork it
* 📈 Practice daily
