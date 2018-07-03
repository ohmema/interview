def rotate(array):
    for i in range(len(array)-1, 0, -1):
        j = i -1
        array[i], array[j] = array[j], array[i]



array = [0,1,2,3,4,5,6,7,8]
print(array)
rotate(array)
print(array)