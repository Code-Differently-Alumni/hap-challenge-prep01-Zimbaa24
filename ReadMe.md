# Problem 01 Palindrome Number

Given an integer x, return true if x is palindrome integer. An integer is a palindrome when it reads the same backward as forward.

* For example, 121 is a palindrome while 123 is not.

### Example 01:

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
```

### Example 02:

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. 
From right to left, it becomes 121-. 
Therefore it is not a palindrome.
```

### Example 03
```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```

# Problem 02 Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

### Example 01

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```

### Example 02

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```

### Example 03
```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```

# Problem 03 Valid Palindrome II

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

### Example 01

```
Input: s = "aba"
Output: true
```

### Example 02

```
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
```

### Example 03

```
Input: s = "abc"
Output: false
```

# Continued Study
* Read [Geek For Geek Palindromes in Java](https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/)
* Read [Find Kth most occuring element](https://www.geeksforgeeks.org/find-kth-most-occurring-element-in-an-array/)
* Try [Break a Palindrome](https://leetcode.com/problems/break-a-palindrome/)