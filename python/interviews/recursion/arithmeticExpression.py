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
#inputs = [[22,79, 21]]
for input in inputs:
    print(arithmeticExpressions_1(input))


print("#"*100)
# Complete the arithmeticExpressions function below.
mul = ('*', lambda x, y: x * y)
add = ('+', lambda x, y: x + y)
mus = ("-", lambda x, y: x - y)

funcs = [mul, add, mus]


def arithmeticExpressions_2(arr):
    data = build_data(arr)
    for val, out in data.items():
        if val % 101 == 0:
            return out
    return ""


def build_data(arr):
    data = {arr[0]:str(arr[0])}
    for num in arr[1:]:
        next_data = {}
        for val, out in data.items():
            for f in funcs:
                next_val = f[1](val, num)
                next_out = out + f[0] + str(num)
                next_data[next_val]= next_out
        data = next_data
    return data

for input in inputs:
    print(arithmeticExpressions_2(input))

print("#"*100)
def solution(a):
    n = len(a)
    valid = [[False] * 101 for i in range(n)]
    valid[0][a[0]] = True
    for i in range(1, n):
        for v in range(101):
            if valid[i - 1][v]:
                valid[i][(v + a[i]) % 101] = True
                valid[i][(v - a[i]) % 101] = True
                valid[i][(v * a[i]) % 101] = True

    v = 0
    for i in range(n - 1, 0, -1):
        for w in range(101):
            if valid[i - 1][w]:
                if (w + a[i]) % 101 == v:
                    a[i] = '+' + str(a[i])
                    v = w
                    break
                if (w - a[i]) % 101 == v:
                    a[i] = '-' + str(a[i])
                    v = w
                    break
                if (w * a[i]) % 101 == v:
                    a[i] = '*' + str(a[i])
                    v = w
                    break
    return ''.join(map(str, a))

for input in inputs:
    print(solution(input))