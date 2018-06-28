

def power_k(n, k):
    if k == 0:
        return 1
    result = 1
    for _ in range(k):
        result *= n
    return result


inputs = [(5,7), (-5, 7), (1,6), (-1, 5), (4, 8), (-4, 8), (-4, 0)]
for t in inputs:
    print("{}**{} = {}".format(t[0], t[1], power_k(t[0],t[1])))

print("#"*100)
def power_logk(n, k):
    if k ==0:
        return 1

    data = [None]*(k+1)
    data[0] = 1
    data[1] = n
    return _power(n,k,data)

def _power(n, k, data):

    target = k//2
    target2 = k - target

    if target != target2:
        plusone = True
    else:
        plusone = False

    if data[target] == None:
        _power(n, target, data)

    data[k] = data[target]*data[target] if not plusone else data[target]*data[target]*n
    return data[k]

for t in inputs:
    print("{}**{} = {}".format(t[0], t[1], power_logk(t[0],t[1])))

