

"""
 input --> Four core experiences of business.
 output --> business of experiences core Four
"""

def reverse(line):
    reverse_line=[]
    for e in line.split(" "):
        reverse_line.insert(0, e)
    return " ".join(reverse_line)

inputs = [" hello my           name is \n dulio \n did something \n wrong "]

#for e in inputs:
#    print(e)
#    print("#"*100)
#    print(reverse(e))

def reverse_method2(line):
    r_chars = list(line)
    r_chars.reverse()

    i = 0
    start = 0
    while i < len(r_chars):
        while i < len(r_chars) and r_chars[i] != " ":
            i += 1
        end = i

        reverse_chars(r_chars, start, end)
        i += 1
        start = i

    return "".join(r_chars)

def reverse_chars(chars,i, j ):
    for step in range((j - i)//2):
        chars[i + step], chars[j-1 - step] = chars[j-1 - step], chars[i + step]


for e in inputs:
    print(e)
    print("#"*100)
    print(reverse_method2(e))