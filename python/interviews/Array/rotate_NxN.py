"""
write a method to rotate the image by 90 degrees. Can you do in place?
"""

def rotate_NxN(matrix):
    if len(matrix) != len(matrix[0]):
        raise ValueError("Parameter requires NxN martix")

    for i in range(len(matrix)//2 ):
        matrix[i], matrix[len(matrix)-1 - i] = matrix[len(matrix)-1 - i], matrix[i]

    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if i > j:
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

def mxnprint(mxn):
    print("=" * len(mxn[0]) * 2)
    for i in range(len(mxn)):
        for j in range(len(mxn[0])):
            print(mxn[i][j], end=" ")
        print(" ")
    print("=" * len(mxn[0]) * 2)

l = 5
input = [[i for i in range(j,j + l)] for j in range(l)]
mxnprint(input)
rotate_NxN(input)
mxnprint(input)


#Complicated Solution
def rotate_grid(matrix):
    index_range = len(matrix) - 1
    depth = (len(matrix)) // 2
    for d in range(depth):
        for i in range(d, index_range - d):
            last_index = index_range
            t1 = matrix[d][i]
            t2 = matrix[i][last_index - d]
            t3 = matrix[last_index - d][last_index - i]
            t4 = matrix[last_index - i][d]

            matrix[d][i] = t4
            matrix[i][last_index - d] = t1
            matrix[last_index - d][last_index - i] = t2
            matrix[last_index - i][d] = t3

l = 5
input = [[i for i in range(j,j + l)] for j in range(l)]
mxnprint(input)
rotate_grid(input)
mxnprint(input)