#longest palindromic sequence
# Complete the longestPalindrome function below.
#https://www.youtube.com/watch?v=_nCsPn7_OgI

def longestPalindrome(n, s):
    L = [[0 for x in range(n)] for x in range(n)]
    for i in range(n):
        L[i][i] = 1

    for cl in range(2, n + 1):
        for i in range(n - cl + 1):
            j = i + cl - 1
            if s[i] == s[j] and cl == 2:
                L[i][j] = 2
            elif s[i] == s[j]:
                L[i][j] = L[i + 1][j - 1] + 2
            else:
                L[i][j] = max(L[i][j - 1], L[i + 1][j]);

    return L[0][n - 1]


def longestPalandromicSubsequence(s):

    n = len(s)
    memo = [[1]*n for _ in range(n)]

    for i in range(1, n):
        for j in range(n -  i):
            I = j
            J = I + i

            if s[I] == s[J]:
                memo[I][J] = memo[I+1][J-1] + 2
            else:
                memo[I][J] = max(memo[I+1][J], memo[I][J-1])
    return memo[0][n-1]


inputs =["agbbsba", "ssgbnss"]

for i in inputs:
    print(i, end=" : ")
    print(longestPalindrome(len(i), i), end = " : ")
    print(longestPalandromicSubsequence(i))

