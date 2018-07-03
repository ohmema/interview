"""
 To print array in decreasing order its frequency
 input ={1,2,5,4,2,2,4} output = {2,2,2,4,4,5,1}

 freq ={1:1, 2:3, 5:1, 4:2}
 ordered_freq = [((3,2), (2,4),(1,1),(5,1)]
Test cases

1. []
2. [1], [-1], [2**33]
4. [1,1,1,1], [1,2,3,4,5]
5. [0,1,2,2,3,3,3,4,4,4,4] , [4,4,4,4,3,3,3,2,2,1,0]
6. [0, -1,-2,-2,-3,-3,-3,-4,-4,-4],  [-4,-4,-4,-4,-3,-3,-3,-2,-2,-1,0]
7. ['1', '1','2','2'], ['2','2','1','1']
8. size of memeoy of less than half)

"""


def decresingOrder(l):
    freq = {}
    for i in l:
        f = freq.get(i, 0)
        f = f + 1
        freq[i] = f

    ordered_freq = [(k, freq[k]) for k in sorted(freq, key=freq.get, reverse=True)]

    for tup in ordered_freq:
        for _ in range(tup[1]):
            print(tup[0], end="")
