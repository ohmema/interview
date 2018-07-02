import itertools

def fun(_str):
    _ss = "".join(sorted(_str))
    for _tuple in itertools.combinations_with_replacement(_ss, 2):
        print("".join(_tuple))

fun("HAWK")
#_ints = list(map(int, input()))

