def longestRectangularAre_timeout(histograms):
    n = len(histograms)
    memo = [[(0,0)]*n for _ in range(n)]

    #memo[i][j[] = ( max area, min height)
    for i in range(n):
        memo[i][i] = (histograms[i], histograms[i])

    for i in range(1, n):
        for j in range(n -i):
            I = j
            J = I + i

            min_height = min(memo[I][J-1][1], memo[I+1][J][1], histograms[J])
            _max =  max(memo[I][J-1][0], memo[I+1][J][0], (i+1) * min_height)
            memo[I][J] = (_max, min_height)

    #return memo
    return memo[0][n-1][0]

#O(n)
def longestRectangularArea(histograms):

    stack = []
    n = len(histograms)
    i = 0
    max_area = 0
    while i < n:
        if len(stack) == 0 or histograms[stack[-1]] <= histograms[i]:
            stack.append(i)
            i += 1   # This is tricky
        else:
            height = histograms[stack.pop()]
            if len(stack) == 0:
                width = i
            else:
                width = i - stack[-1] -1

            area = height * width
            max_area = max(area, max_area)

        #i += 1

    while len(stack) != 0:
        height = histograms[stack.pop()]
        if len(stack) == 0:
            width = i
        else:
            width = i - stack[-1] - 1
        area = height * width
        max_area = max(area, max_area)
    return max_area



inputs = [[6,2,5,4,5,1,6]]

import pprint
for i in inputs:
    print(i, end = " : ")
    print(longestRectangularAre_timeout(i), end = " : ")
    print(longestRectangularArea(i))

