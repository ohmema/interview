#Validate () {} []

def validate(paren):
    pairs = {'{':'}', '(':')', '[':']'}
    stock = list()
    for c in paren:
        if c in "({[":
            stock.append(c)
        elif c in "}])":
            try:
                enclose = stock.pop()
                if pairs[enclose] != c:
                    return False
            except:
                return False
    if len(stock) !=0:
        return False
    return True
"""
inputs = ["{}", "{)", "{([])}", "{[(]]}", "[  { } ) ]", "[{()}]]" , "", "{", ")"]
for i in inputs:
    print("{} : {}".format(i, validate(i)))
"""
#2: Bitwise Complements

def complements(i):
    return ~i + 1

inputs = [0, 1,2,3, 456]
for i in inputs:
    print("{} : {}".format(i, complements(i)))
#3: Binary Tree Question