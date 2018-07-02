"""
string is considered ascii characters.

Q1: Does a space canm be a character?
Q2: How do I handle newline characters?

"""


def isUnique(s):
    """
    Time complexcity is O(n)
    Space Complexcity is O(n)
    :param s:
    :return:
    """
    lib = dict()

    for c in s:
        count = lib.get(c, 0)
        if count:
            return False
        lib[c] = count + 1

    return True


"""
Without extra space

"""


def isUnique2(s):
    """
    Time complexcity is O(n^2)
    Space Complexcity is O(1)
    :param s:
    :return:
    """

    for i in range(len(s)):
        for j in range(i+1, len(s)):
            if s[i] == s[j]:
                return False

    return True


#TESTCASES
tc1 = ""
tc2 = "a"
tc3 = "a b c"
print(isUnique2(tc3))



