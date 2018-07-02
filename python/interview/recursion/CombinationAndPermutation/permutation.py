"""
Permutation of string
"""

def all_perms(word):
    if len(word) == 0:
        return [""]
    head = word[0]
    subwords = all_perms(word[1:])
    new_pumutation = set()
    for subword in subwords:
        for i in range(len(subword)+1):
            new_word = subword[:i] + head + subword[i:]
            new_pumutation.add(new_word)
    return list(new_pumutation)

"""
def perm(word):
    if len(word) == 1:
        return [word]

    perms = perm(word[1:])  #perms=["bc","cb"]
    char = word[0]
    result=[]

    for sub_word in perms:
        for i in range(len(sub_word)+1):
            result.append(sub_word[:i] + char + sub_word[i:])

    return result
"""
a="abc"
#for i in all_perms(a):
#    print(i)

_l = all_perms(a)
for i in _l:
    print(i)
