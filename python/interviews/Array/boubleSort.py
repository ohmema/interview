def countSwaps(a):
    count = 0
    for i in range(len(a)-1):
        for j in range(len(a)-1 -i):
            if a[j] > a[j+1]:
                a[j], a[j+1] = a[j+1], a[j]
                count +=1
    print("Array is sorted in {} swaps.".format(count))
    print("First Element: {}".format(a[0]))
    print("Last Element: {}".format(a[-1]))

inputs = [[1 ,2 ,3], [3 ,2 ,1], [4 ,2 ,3, 1] ]

for input in inputs:
    countSwaps(input)