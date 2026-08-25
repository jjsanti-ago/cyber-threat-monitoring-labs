# Password Strength Checker 🔐

A simple Java-based password strength checker developed as a cybersecurity learning project.

## Project Overview

This project evaluates a password based on several basic security criteria and provides a simple strength classification.

The checker evaluates:

- Password length
- Uppercase letters
- Lowercase letters
- Numbers
- Special characters

## Strength Criteria

| Criteria | Description |
|---|---|
| Length | Checks whether the password meets the minimum length requirement |
| Uppercase | Checks for at least one uppercase letter |
| Lowercase | Checks for at least one lowercase letter |
| Number | Checks for at least one numeric character |
| Special Character | Checks for at least one special character |

## Example

```text
Password Analysis
-----------------

Length: 12
Uppercase: true
Lowercase: true
Number: true
Special Character: true
Score: 5/5
Strength: STRONG
```
## Testing

The application was tested using sample inputs representing different password strength levels.

Test Case 1 — Weak

Input: Sample password with insufficient length and limited character variety.

Result:
Score: 1/5
Strength: WEAK

Test Case 2 — Moderate

Input: Sample password containing uppercase letters, lowercase letters, and numbers.

Result:
Score: 3/5
Strength: MODERATE

Test Case 3 — Strong

Input: Sample password meeting all five implemented criteria.

Result:
Score: 5/5
Strength: STRONG

All test cases produced the expected classifications based on the implemented password strength criteria.

## Security Considerations

This project is intended for educational purposes.

The application does not store, transmit, or log passwords.

For real-world applications, passwords should never be stored in plaintext. Secure password storage should use appropriate password hashing and security practices.

## Technologies
- Java
- Java Regular Expressions
- Console Input
## Learning Objectives

Through this project, I aim to strengthen my understanding of:

- Java programming fundamentals
- Conditional statements
- Loops
- String manipulation
- Regular expressions
- Basic security concepts
- Input validation
## Career Relevance

This project demonstrates the application of programming fundamentals to a basic cybersecurity-related problem.

It supports my learning path toward Cybersecurity, Security Operations, and SOC Analysis.
