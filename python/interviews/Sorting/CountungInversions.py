"""
In an array, , the elements at indices  and  (where ) form an inversion if . In other words, inverted elements  and  are considered to be "out of order". To correct an inversion, we can swap adjacent elements.

For example, consider the dataset . It has two inversions:  and . To sort the array, we must perform the following two swaps to correct the inversions:

Given  datasets, print the number of inversions that must be swapped to sort each dataset on a new line.

Function Description

Complete the function countInversions in the editor below. It must return an integer representing the number of inversions required to sort the array.

countInversions has the following parameter(s):

arr: an array of integers to sort .
Input Format

The first line contains an integer, , the number of datasets.

Each of the next  pairs of lines is as follows:

The first line contains an integer, , the number of elements in .
The second line contains  space-separated integers, .

Insertion sort ---Timeout
"""


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
        if left[i] < right[j]:
            arr[l] = left[i]
            l += 1
            i += 1

        elif left[i] > right[j]:
            arr[l] = right[j]
            l += 1
            j += 1
            swap += len(left) - i
        else:
            arr[l] = left[i]
            l += 1
            i += 1

    while i < len(left):
        arr[l] = left[i]
        l += 1
        i += 1
    while j < len(right):
        arr[l] = right[j]
        l += 1
        j += 1
    return swap

inputs = [([1, 1, 1, 2, 2], 0), ([2, 1, 3, 1, 2], 4), ([7, 5, 3, 1], 6)]

for input in inputs:
    print(input[0] , end = " : swaps - " )
    swaps = countInversions(input[0])
    print(swaps, end = " : ")
    print( "True" if swaps == input[1] else "Error")