def countBinarySubstrings(s):
    """
    :type s: str
    :rtype: int
    """
    if len(s) < 2:
        return []
    binaries = []
    for i in range(len(s) - 1):
        for j in range(i + 1, len(s), 2):
            if count_b(s[i:j + 1]):
                binaries.append(s[i:j + 1])

    return binaries


def count_b(s):
    length = len(s) // 2
    f_c, f_e = 0, 0
    for i in range(length):
        if s[i] == s[0]:
            f_c += 1
        else:
            f_e += 1

    if f_c != length:
        return False

    for i in range(length , len(s)):
        if s[i] == s[0]:
            f_c += 1
        else:
            f_e += 1

    if f_e != length:
        return False
    return True


inputs = ["00110011", "10101", "01"]
for input in inputs:
    print(countBinarySubstrings(input))


print(count_b("1010"))