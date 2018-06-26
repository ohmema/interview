

"""
An anagram is a word or
phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
"""


def isAnagram_BIGO_nlogn(stringA, stringB):
    arrayA = list(stringA.lower())
    arrayB = list(stringB.lower())
    arrayA.sort()
    arrayB.sort()
    return arrayA == arrayB


s1= "Rail safety"
s2 ="Fairy tales"

print(isAnagram_BIGO_nlogn(s1, s2))


def isAnagram_BIGO_n(stringA, stringB):
    d = {}
    for c in stringA:
        c = c.lower()
        if c.isalnum():
            count = d.get(c, 0)
            d[c] = count + 1
    for c in stringB:
        c = c.lower()
        if c.isalnum():
            count = d.get(c, 0)
            if count == 0:
                return False
            else:
                d[c] = count -1

    return True

s1= "Rail safety"
s2 ="Fairy tales"

print(isAnagram_BIGO_n(s1, s2))

