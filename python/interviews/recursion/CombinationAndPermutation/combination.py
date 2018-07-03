def combination(word, n):
    comb = set()
    comb = _combination(word, n, comb)
    return list(comb)

def _combination(word, n, comb):
    if len(word) == n:
        comb.add("".join(sorted(word)))
        return []
    for i in range(len(word)):
        subword=word[:i] + word[i+1:]
        _combination(subword, n, comb)
    return comb

a = "abca"
for i in combination(a, 2):
    print(i)