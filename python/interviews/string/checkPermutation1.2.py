"""
check if one is a permutation of the other

Q1: set cannot cpver the duplicated eleements
Q2: the len(s1) and len(s2) should be same
q3: Order does not matter, which means if number of elements are correct, it can be said True



"""

def isPermutation(s1, s2):
    """
    Solution1: sort both strings and compare two string. O(nlogn)
    :param s1:
    :param s2:
    :return:
    """
    if len(s1) != len(s2):
        return False
    s1 = sorted(s1)
    s2= sorted(s2)
    if s1 == s2:
        return True
    return False


def isPermutation2(s1, s2):
    """
    Solution2: Store elements to dictionary. + and -, all elements in dictionary should 0.
           O(n)
    :param s1:
    :param s2:
    :return:
    """
    if len(s1) != len(s2):
        return False
    lib = dict()

    for c in s1:
        count = lib.get(c, 0)
        lib[c] = count + 1

    for c in s2:
        count = lib.get(c, 0)
        lib[c] = count -1

    return not all(lib.values())


s1 = "abcd"
s2 = "bcda "

print(isPermutation2(s1, s2))
