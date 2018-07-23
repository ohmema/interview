"""
Output Format

Print a single line containing the required expressoin. You may insert spaces between operators and operands.

Note

You are not allowed to permute the list.
All operators have the same precedence and are left-associative, e.g.,  is interpreted as
Unary plus and minus are not supported, e.g., statements like , , or  are invalid.
Sample Input 0

3
22 79 21
Sample Output 0

22*79-21
Explanation 0

Solution 1: , where , so it is perfectly divisible by .
Solution 2: , which is also divisible by .

Sample Input 1

5
55 3 45 33 25
Sample Output 1

55+3-45*33-25
Explanation 1

 which is divisible by .
"""


# Complete the arithmeticExpressions function below.
def arithmeticExpressions_1(arr):
    return _calculate(arr, 1, arr[0], str(arr[0]))


def _calculate(arr, i, result, out):
    if len(arr) == i and result % 101 == 0:
        return out
    elif len(arr) == i and result % 101 != 0:
        return ""

    num = arr[i]
    re = _calculate(arr, i + 1, result * num, out + "*" + str(num))
    if re != '':
        return re

    re = _calculate(arr, i + 1, result + num, out + "+" + str(num))
    if re != '':
        return re

    re = _calculate(arr, i + 1, result - num, out + "-" + str(num))
    if re != '':
        return re

    return ''


inputs = [[22,79, 21],[55,3,45,33,25], [22,79,21]]

for input in inputs:
    print(arithmeticExpressions_1(input))


S = ('+', lambda x, y: x + y)
D = ('-', lambda x, y: x - y)
M = ('*', lambda x, y: x * y)
funcs = [S, D, M]


def arithmeticExpressions_2(arr):
    results = []
    for num in arr:
        pass
        

