"""
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
"""


#####"aaaaaa .....   aaaaaa"
def longestPalindrome_timeout1(s):
    """
    :type s: str
    :rtype: str
    """
    max_length = (0, 1)
    for i in range(len(s)):
        j = len(s) - 1
        while j > i and s[j] != s[i]:
            j -= 1
        last = i +  maxPalandrome(s[i:j + 1])
        max_length = (i, last ) if max_length[1] - max_length[0] <= last - i else  max_length

    return s[max_length[0]:max_length[1]]


def maxPalandrome(s):
    i, j = 0, len(s) - 1
    while i < j:
        while i < j and s[i] != s[j]:
            j -= 1
        if isPalandrome(s[:j+1]):
            break
        j -= 1
    return j + 1

def isPalandrome(s):
    i , j = 0, len(s)-1
    while i < j:
        if s[i] != s[j]:
            return False
        i +=1
        j -=1
    return True


## Timeout "babaddtattarrattatddetartrateedredividerb"
def longestPalindrome2(s):
    if isPalandrome(s):
        return s

    s1 = longestPalindrome2(s[1:])
    s2 = longestPalindrome2(s[:-1])
    return s1 if len(s1) > len(s2) else s2

def longestPalindrome(s):

    t = "a"
    length = len(s)
    for i in range(length - 1):
        # if (length) %2 != 0:
        l = maxP(s, i, i)
        t = l if len(l) > len(t) else t
        # else:
        r = maxP(s, i, i + 1)
        t = r if len(r) > len(t) else t
    return t

def maxP(s, i, j):
    while 0 <= i and j < len(s) and s[i] == s[j]:
        i -= 1
        j += 1
    return s[i + 1: j]


inputs =["cbbd", "abcda", "abc"]

for i in inputs:
    print(longestPalindrome(i))

