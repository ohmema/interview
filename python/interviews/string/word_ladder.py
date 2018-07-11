"""
Given two words (start and end), and a dictionary,
find the length of shortest transformation sequence from start to end, such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. For example, given:

start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]

One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.
"""





def isOneCharDiff(w1, w2):
    if w1 == w2:
        return False
    if len(w1) == len(w2):
        return isOneCharDiff_len(w1, w2)
    _max = w1 if len(w1) > len(w2) else w2
    _min = w1 if len(w1) < len(w2) else w2
    for i in range(0, len(_max)):
        substr = _max[:i]+_max[i+1:]
        if substr == _min:
            return True
    return False

def isOneCharDiff_len(w1, w2):
    same = 0;
    for i in range(len(w1)):
        if w1[i] == w2[i]:
            same+=1
    if same == len(w1) -1:
        return True
    return False


def ladder(start, end, d):
    l = []
    l.append(start)
    val=[]
    _ladder(start, end, d, l, val)
    return val



def _ladder(start, end, d, l, val):
    if isOneCharDiff(l[-1], end):
        l.append(end)
        val.append(l[:])
        l.remove(end)
        return
    p = l[-1]
    for e in d:
        if isOneCharDiff(p, e) and e not in l:
            l.append(e)
            _ladder(start, end, d, l, val)
            l.remove(e)

    return

start = "hit"
end = "cog"
d = ["hot","dot","dog","lot","log"]

pathes = ladder(start, end, d)
for p in pathes:
    print(p)

print("#"*100)
start = "hit"
end = "cog"
d = ["kit","dot","dog","got","log", "git", "gut", "hot"]
pathes = ladder(start, end, d)
for p in pathes:
    print(p)

print("#"*100)
start = "hit"
end = "dogg"
d = ["kit","dot","dog","got","log", "git", "gut", "hot"]
pathes = ladder(start, end, d)
for p in pathes:
    print(p)