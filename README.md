# Laboratory Activity: Recursion

## Brief Description
This Java program calculates the Greatest Common Divisor (GCD) of two non-negative integers using the recursive Euclidean algorithm. It also displays the values involved in each recursive call so the execution can be traced toward the base case.

## Programming Language
Java

## Algorithm
The program uses the recursive form:

`gcd(a, b) = gcd(b, a % b)`

The base case is `b == 0`, where the function returns `a`.

## How to Compile and Run
1. Open a terminal in the folder containing `RecursionGCD.java`.
2. Compile the program:

```text
javac RecursionGCD.java
```

3. Run the program:

```text
java RecursionGCD
```

4. Enter two non-negative integers. The two values must not both be zero.

## Sample Input and Output

Example input:

```text
48
16
```

Example output:

```text
Recursive execution trace:
gcd(48, 16)
48 % 16 = 0
gcd(16, 0)
Base case reached: b == 0, return 16

GCD = 16
```

## AI Disclosure
AI assistance was used during development for code drafting, explanation drafting, and checking recursion traces. The student is responsible for reviewing, understanding, testing, and verifying the submitted program and explanations.

Tool used: OpenAI ChatGPT, GPT-5.6 Luna.

The human author verified the program by compiling and running it with the required test cases and reviewed the generated explanations before submission.

Estimated AI-assisted portion: approximately 60% of the initial drafting, with the final work reviewed, tested, and edited by the student.
