"""
Given a binary string, count number of substrings that start and end with 1.
For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.

"""

def countbinarystr_strat1_end1(b_str):
    count = 0
    for i  in range(len(b_str)):
        for j in range(i+1, len(b_str)):
            if b_str[i] == "1" and b_str[j] == "1":
                count += 1
    return count

inputs = ["00100101", "1111"]
for i in inputs:
    print("{} : {}".format(i, countbinarystr_strat1_end1(i)))



"""
Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's, 
and all the 0's and all the 1's in these substrings are grouped consecutively.

Input: "00110011"
Output: 6
Explaination: "0011", "01", "1100", "10", "0011", and "01".

Input: "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.

"""

def countBinarySubstrings_timeout(s):
    r = []
    for i in range(len(s)):
        flip = s[i]
        c1 = 1
        c2 = 0
        nomore = False
        for j in range(i+1, len(s)):
            if s[j] == flip:
                c1+=1
            else:
                if nomore:
                    break
                nomore = True
                flip = s[j]
                c2+=1
                c1, c2 = c2, c1
            if c1 == c2:
                r.append(s[i:j+1])
    return r

def countBinarySubstrings(s):
    groups = [1]
    i = 1
    while i < len(s):
        if s[i-1] == s[i]:
            groups[-1] += 1
        else:
            groups.append(1)

        i +=1
    ans = 0
    for i in range(1, len(groups)):
        ans += min(groups[i-1], groups[i])

    return ans


inputs = ["00110011"]

for i in inputs:
    print(countBinarySubstrings(i))


