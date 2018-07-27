#Lexicographically smallest string obtained after concatenating array
# Complete the smallestString function below.
from functools import cmp_to_key

def smallestString(substrings):
    substrings.sort(key=cmp_to_key(comparator))
    return "".join(substrings)

def comparator(a,b):
    if a == b:
        return 0
    if len(a) == len(b):
        if a > b: return 1
        else: return -1

    min_l = min(len(a), len(b))

    if a[:min_l] > b[:min_l]:
        return 1
    elif a[:min_l] < b[:min_l]:
        return -1
    else:
        if len(a) > len(b):
            if a[min_l] > b[min_l-1]:
                return 1
            else:
                return -1
        else:
            if a[min_l-1] > b[min_l]:
                return 1
            else:
                return -1

inputs = [["aa", "ab", "aaa"], ["c","cb", "cba"], ["cd","caz", "c", "1","caza"]]
for i in inputs:
    print(i, end= " : ")
    print(smallestString(i))