
def subset(l):

    subsets = set()
    word = "".join(l)
    _subset(word, subsets, len(word) )
    return subsets

def _subset(word, subsets, level):
    if level == 0:
        return subsets.add("")

    subsets.add(word)
    for i in range(0, len(word)):
        disect_w = word[:i] + word[i+1:]
        _subset(disect_w, subsets, level -1)


def getSubsets(_list):
    _all =[]
 #   _all.append(_list)
    _getSubsets(_list, _all)
    return _all

def _getSubsets(_list, _all):
    if len(_list) == 0:
        if [] not in _all:
            _all.append([])
        return

    if _list not in _all:
        _all.append(_list)
    for i in range(0, len(_list)):
        combined = _list[:i] + _list[i+1:]
        _getSubsets(combined, _all)

s=["a", "b", "c", "d"]
a = subset(s)
b = getSubsets(s)
a= list(a)
a = list(map(list, a))
a.sort()
b.sort()
print(a)
print(b)

print("MATCHED") if a == b else print("FALSE")