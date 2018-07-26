def lengthOfLongestSubstring(s):
    """
    :type s: str
    :rtype: int
    """
    if len(s) == 1:
        return 1

    max_length = 0
    for i in range(len(s) - 1):
        max_length = max(max_length, nextIndex(s[i:]))
    return max_length

def nextIndex(s):
    chars = [0] * 256
    for i, c in enumerate(s):
        index = ord(c)
        chars[index] += 1
        if chars[index] > 1:
            return i
    return len(s)

inputs = ["abcd", "abbc", "abcabcbb", "a", ""]

for i in inputs:
    print(nextIndex(i))