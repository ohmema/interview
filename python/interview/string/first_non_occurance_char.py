"""
"sasas sasdas tsasad " => t
"""

def first_non_occcurance_char_n2(word):
    word = word.upper()
    onechar = None
    for i in range(0, len(word)):
        target_char = word[i]
        dup = False
        for j in range(0, len(word)):
            if i != j and word[j] == target_char:
                dup = True
                break
        if not dup:
            return target_char
    return None

def first_non_occcurance_char_n(word):
    word = word.upper()
    frequency = [0]*(127)
    for c in word:
        frequency[ord(c)] += 1

    for c in word:
        if frequency[ord(c)] == 1:
            return c

    return None


inputs = ["AllyA", "aaaabaaaa" , "abcdef", "abcdfdcba", "1235,6577654321", "", "qqwqw"]

for w in inputs:
    print(w, end=" First non-occurance char: ")
    print(first_non_occcurance_char_n2(w))

print("#"*100)
for w in inputs:
    print(w, end=" First non-occurance char: ")
    print(first_non_occcurance_char_n(w))

