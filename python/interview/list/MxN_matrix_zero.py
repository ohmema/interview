"""
if an element in an MxN matrix is 0,
its entire row and column are set to 0
"""

def MxN_zero_matrix(mxn):
    c_zeros, l_zeros = set(), set()

    for i in range(len(mxn)):
        for j in range(len(mxn[0])):
            if mxn[i][j] == 0:
                c_zeros.add(j)
                l_zeros.add(i)

    for i in range(len(mxn)):
        for j in range(len(mxn[0])):
            if i in l_zeros or j in c_zeros:
                mxn[i][j] = 0

    return mxn

def mxnprint(mxn):
    print("="*len(mxn[0])*2)
    for i in range(len(mxn)):
        for j in range(len(mxn[0])):
            print(mxn[i][j], end = " ")
        print(" ")
    print("=" * len(mxn[0])*2)

input = [ [i for i in range(1, 5)] for i in range(5) ]
input[3][3] = 0
mxnprint(input)
MxN_zero_matrix(input)
mxnprint(input)


input = [ [i for i in range(-5, 1)] for i in range(5) ]
input[3][3] = 0
mxnprint(input)
MxN_zero_matrix(input)
mxnprint(input)