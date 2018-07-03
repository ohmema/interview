

chars =  [chr(i) for i in range(ord('A'), ord('Z')+1)]

def get_words(_str):
    s = set()
    _get_words(_str, s)
    return s

def _get_words(_str, s):
    if len(_str) == 0:
        return s
    int1 = int(_str[0])
    int2 = int(_str[:2])
    ss = set()

    for w in s:
        new_words = w + chars[int1]
        ss.add()
        if int2 < 26:
            new_words = w + chars[int2]
            ss.add()
        _get_words(_str[1:], ss)


