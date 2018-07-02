# print("Chang")
'''
given an array of integers and another integer (A), 
write a function to find a pair of numbers in the given array 
that the sum of the two numbers is the closest to A



input1 -> [10, 5, 1, 2, 4, 0]
input2 -> 3
=> 1,2

input1 -> [10, 5, 2, 4, 0]
input2 -> 3
==> 2, 0

[0,1,2,4,5,10] , 4
[-2,1,2,3,4]

minimal_difference = (3, (0, 1)), (1, (1, 2), (2, (2, 4)), (6, (4,5)), (11,(5,10))

[-4 -1 5] , 0
[-2,1,2,3,4], 2

'''


def closestSum(l, n):
    if len(l) < 1:
        raise Exception

    minimal = (abs(n - (l[0] + l[1])), (l[0], l[1]))

    for i in range(len(l)):
        for j in range(len(l)):
            if i != j:
                diff = abs(n - (l[i] + l[j]))
                if diff == 0:
                    return (l[i], l[j])
                if minimal[0] > diff:
                    minimal = (diff, (l[i], l[j]))

    return minimal[1]

def closestSum2(l, n):
    if len(l) < 1:
        raise Exception

    minimal = (abs(n - (l[0] + l[1])), (l[0], l[1]))

    for i in range(len(l)):
        for j in range(i+1, len(l)):
            diff = abs(n - (l[i] + l[j]))
            if diff == 0:
                return (l[i], l[j])
            if minimal[0] > diff:
                minimal = (diff, (l[i], l[j]))

    return minimal[1]

print(closestSum([-2,22,-1,2,4] , -2))
print(closestSum2([-2,21,-1,2,4] , -2))
# TestCases
# 1. [1], 1 => Error
# 2, [-1, 0], -1 ==> Yes  (matched)
# 3, [-1, 1], -2 ==> Yes  (closes)
# 4, [-2, -1, 0, 1, 2 ], 0 ==> Yes (matched with duplicates)
# 5, [0, 2, 2 ], 3 ==> ==> yes (cloest with duplicates)
# 6, [unordered lists with 2, 3, 4, 5, scenarios]
