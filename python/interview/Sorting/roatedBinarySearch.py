
def binarySearch(l, t):
    return _binarySearch(0, len(l)-1, l, t)

def _binarySearch(left, right, l, t):
    if left > right:
        return -1
    if left == right and l[left] != t:
        return -1
    p = (left+right)//2
    if l[p] == t:
        return p

    if l[p] > t:
        if t >= l[left]:
            return _binarySearch(left, p -1, l,t )
        else:
            while l[p] > l[left]:
                p += 1
            return _binarySearch(p, right, l, t)
    else:
        if l[right] <= t:
            return _binarySearch(p-1, right, l, t)
        else:
            while l[p] <l[left]:
                p -= 1
            return _binarySearch(left, p , l, t)



l =[2,3,4,5,6,1]

print(binarySearch(l, 4))