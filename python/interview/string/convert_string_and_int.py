"""
"123" --> 123
"-012" ==> -12
"""

def convert_to_int(word):
    negative = True if word[0] == "-" else False
    if negative:
        start = 1
    else:
        start = 0
    return_value = 0
    for i in range(start, len(word)):
        if not '0' <= word[i] <= '9':
            return None
        int_v = ord(word[i]) - ord('0')
        return_value = return_value*10 +int_v

    return return_value*-1 if negative else return_value

def convert_to_str(integer):
    if integer == 0:
        return "0"

    chararray = []
    if integer < 0:
        negative = True
    else:
        negative = False

    if negative:
        integer *= -1

    while integer > 0:
        integer, mod = divmod(integer, 10)
        chararray.insert(0, str(mod))

    _str = "".join(chararray)
    _str = "-" + _str if negative else _str
    return _str

inputs = [ "123",
           "-123",
           "0",
           "-00",
           "45.5",
           "000001"
           ]

for w in inputs:
    print(w , end = " int: ")
    print(convert_to_int(w))

print("#"*100)

inputs = [-0,
         0,
         -1,
         1,
         1000,
         -1000]

for w in inputs:
    print(w , end = " str: ")
    print(convert_to_str(w))
