def groupAnagrams(strs):
    """
    :type strs: List[str]
    :rtype: List[List[str]]
    """

    memo = {}

    for s in strs:
        l = list(s)
        l.sort()
        key = "".join(l)
        print(key)
        ar = memo.get(key, [])
        ar.append(s)
        memo[key] = ar
    print(memo)
    r = []
    for ar in memo.values():
        print(ar)
        r.append(ar)
    return r

inputs = [["eat","tea","tan","ate","nat","bat"]]

for i in inputs:
    print(groupAnagrams(i))