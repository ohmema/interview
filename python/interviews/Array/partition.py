# This algorithm showed in cracking the code interview but this is wrong algorithm.
def partition_wrong(array, l, r):
    pivot = array[(l+r)//2]
    print("pivot : {}".format(pivot), end = " : ")
    while l <= r:
        while array[l] < pivot:
            l += 1
        while array[r] > pivot:
            r -= 1

        if l <= r:
            array[l], array[r] = array[r], array[l]
            l += 1
            r -= 1

    return l

def partition(array, l, r):
    i = l-1
    j = l
    pivot = array[r]
    print("pivot : {}".format(pivot), end=" : ")
    while j < r:
        if array[j] < pivot:
            i +=1
            array[i], array[j] = array[j] , array[i]

        j += 1
    i += 1
    array[i], array[j] = array[j], array[i]
    return i



arrays = [[4,5,6,9,8],
          [2,3,4,5,6,7],
          [0,0,0,0,0],
          [2, -2, 3, -4, 5, 6, -6, 7, -7, 8]]
for a in arrays:
    print(a, end = " : ")
    print(" index {}".format(partition(a, 0, len(a)-1)), end= " : ")
    print(a)