# Python3 program to print
# given matrix in spiral form
def spiralPrint(matrix):

    ''' n1 - starting row index
        n2 - ending row index
        m1 - starting column index
        m2 - ending column index
    '''

    m1, n1 = 0, 0
    m2, n2 = len(matrix)-1, len(matrix[0])-1

    while m1 <= m2 and n1 <= n2:

        # Print the first row from
        # the remaining rows
        #if m1 <= m2:
        for i in range(n1, n2 +1):
            print(a[m1][i], end=" ")

        m1 += 1

        # Print the last column from
        # the remaining columns
        if n1 <= n2:
            for i in range(m1, m2 +1):
                print(a[i][n2], end=" ")

        n2 -= 1

        # Print the last row from
        # the remaining rows
        if m1 <= m2 :

            for i in range(n2, n1-1, -1):
                print(a[m2][i], end=" ")

            m2 -= 1

        # Print the first column from
        # the remaining columns
        if n1 <= n2 :
            for i in range(m2, m1 -1, -1):
                print(a[i][n1], end=" ")

            n1 += 1
    print()

def printArray(a):
    for i in a:
        print(i)
    print()

# Driver Code
a = [[1, 2, 3, 4, 5, 6],
     [7, 8, 9, 10, 11, 12],
     [13, 14, 15, 16, 17, 18]]
printArray(a)
spiralPrint( a)
print("#"*100)

a = [[1,2,3,4,5,6,7]]
printArray(a)
spiralPrint( a)
print("#"*100)

a = [[1],[2],[3],[4],[5],[6],[7]]
printArray(a)
spiralPrint( a)
print("#"*100)

a = [[1],[2],[3],[4],[5],[6],[7]]
printArray(a)
spiralPrint( a)
print("#"*100)
