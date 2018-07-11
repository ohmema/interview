"""
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.

For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
"""


def isIsomorphic(word1, word2):
    if len(word1) != len(word2):
        return False
    d={}
    for i in range(len(word1)):
        idem = d.get(word1[i], None)
        if idem == None :
            d[word1[i]] = word2[i]
        else:
            if idem != word2[i]:
                return False
    return True


inputs = [("egg", "add"), ("foo", "bar")]

for e in inputs:
    print(e, end = " : ")
    print(isIsomorphic(*e))