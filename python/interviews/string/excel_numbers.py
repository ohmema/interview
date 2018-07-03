"""
A = 1, B = 2, C = 3, Z = 26,
AA = 27, AB = 28, AC = 29, ZZ = 702,
AAA = 703, AAB = 704, AAC = 705, BAA = 1379,

"""

def convert_excel_number_string_to_int(excel_num):
    excel_num = excel_num.upper()
    carrier = 0
    int = 0
    for i, c in enumerate(excel_num):
        if not 'A'<= c <= 'z':
            return None
        int += 26**(len(excel_num) - i  -1) * (ord(c) - ord("A")+1)

    return int

inputs = ["A", "z", "AA", "AB", "AZ", "ZZ", "AAA", "AAC", "BAA", "ZZZZ"]
for e in inputs:
    print(e, end=" int: ")
    print("{}".format(convert_excel_number_string_to_int(e)))

print("#"*100)

def convert_int_to_excel_number(num):
    if num <= 0:
        raise ValueError
    result = []
    while num > 0:
            num, mod = divmod(num, 26)
            if mod == 0:
                num -=1
                mod = 26
            result.insert(0, chr(ord('A') + mod - 1))

    return "".join(result)

inputs =[1, 26, 27, 28, 52, 702,703, 705, 1379, 475254]

for e in inputs:
    print(e, end=" str: ")
    print("{}".format(convert_int_to_excel_number(e)))