

def rotate(l,k):
    k = k%len(l)
    returnv = l + l
    return returnv[len(l)-k: len(l) -k +len(l)]

def rotate_in_memory(l, k):
    l =l[:]
    k = k%len(l)

    for _ in range(k):
        t = l[0]
        for i in range(1, len(l)+1):
            p = l[i%len(l)]
            l[i%len(l)] = t
            t = p
    return l

inputs = [[0,1,2,3,4]]

for e in inputs:
    for i in range(len(e)+3):
        print(rotate(e, i))

print("#"*30 + " in memory "+ "#"*30)

for e in inputs:
    for i in range(len(e)+3):
        print(rotate_in_memory(e, i))