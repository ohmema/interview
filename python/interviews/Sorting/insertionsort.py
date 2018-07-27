def sort(l):
    for i in range(1, len(l)):
        for j in range(i, 0, -1):
            if l[j] < l[j-1]:
                l[j], l[j-1] =l[j-1], l[j]
#l=[9,8,7,6,5,4,3]

#sort(l)
#print(l)


def insertionSort(arr):
    count = 0
    for i in range(1, len(arr)):
        j = i
        k = i - 1
        while k >= 0 and arr[k] > arr[j]:
            count += 1
            arr[k], arr[j] = arr[j], arr[k]
            k -= 1
            j -= 1

    return arr, count

inputs = [[2 ,1 ,3 ,1 ,2], [2],[2,3,4], [3,2,1], [9,8,7,6,5,4,3], [-3, -5,6,2,1]]
inputs = [[2 ,1 ,3 ,1 ,2]]
for arr in inputs:
    print(insertionSort(arr))