def mergeSort(l):
    if len(l) == 1:
        return l
    mid = len(l)//2
    a = mergeSort(l[:mid])
    b = mergeSort(l[mid:])
    c = merge(a, b)
    return c



def merge(a, b):
    c = []
    i , j = 0, 0

    while i < len(a) and j < len(b):
        if a[i] < b[j]:
            c.append(a[i])
            i += 1
        else:
            c.append(b[j])
            j += 1

    while i < len(a):
        c.append(a[i])
        i += 1

    while j < len(b):
        c.append(b[j])
        j += 1
    return c

#l =[9,8,7,6,3]
#z=mergeSort(l)
#print(z)


def mergeSort_inplace(s, e, _list):
    if e-s == 1:
        return

    mid = (s+e)//2
    mergeSort_inplace(s, mid, _list)
    mergeSort_inplace(mid, e, _list)
    merge_inplace(s,mid, e, _list)

def merge_inplace(s, mid, e,_list):
    i = s
    j = mid

    while i < mid and j < e:
        if _list[i] > _list[j]:
            tmp = _list[j]
            del _list[j]
            _list.insert(i, tmp)
            j += 1
            i += 1
            mid += 1
        else:
            i += 1


def merge_sort3(arr, l, r, swap):
    if l >= r:
        return swap
    #print("{} {}".format(l, r))
    mid = (r+l + 1) // 2
    swap = merge_sort3(arr, l, mid -1  , swap)
    swap = merge_sort3(arr, mid , r, swap)
    return merge3(arr, l, mid, r, swap)


def merge3(arr, l, mid, r, swap):
    left = arr[l:mid]
    right = arr[mid:r + 1]
    i, j = 0, 0
    t1 = l
    t2 = r
    #print(arr[t1:t2+1])
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            arr[l] = left[i]
            l += 1
            i += 1
        elif left[i] > right[j]:
            arr[l] = right[j]
            l += 1
            j += 1
        else:
            arr[l] = left[i]
            l += 1
            i += 1
            arr[l] = right[j]
            l += 1
            j += 1

    while i < len(left):
        arr[l] = left[i]
        l += 1
        i += 1
    while j < len(right):
        arr[l] = right[j]
        l += 1
        j += 1
    #print(arr[t1:t2 + 1])

l =[4,3,5,67,8,3,44,6]
print(sorted(l))
print(mergeSort(l))
merge_sort3(l , 0,  len(l)-1, 0)
print(l)


def countInversions(arr):
    return merge_sort(arr, 0, len(arr) - 1, 0)


def merge_sort(arr, l, r, swap):
    if l >= r:
        return swap
    mid = (l + r + 1) // 2
    swap = merge_sort(arr, l, mid - 1, swap)
    swap = merge_sort(arr, mid, r, swap)
    return merge(arr, l, mid, r, swap)


def merge(arr, l, mid, r, swap):
    left = arr[l:mid]
    right = arr[mid:r + 1]
    i, j = 0, 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            arr[l] = left[i]
            l += 1
            i += 1

        else:
            arr[l] = right[j]
            l += 1
            j += 1
            swap += len(left) - i

    while i < len(left):
        arr[l] = left[i]
        l += 1
        i += 1
    while j < len(right):
        arr[l] = right[j]
        l += 1
        j += 1

    return swap


