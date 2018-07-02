"""
Insert a cha
remove a cha
replace a cha

pale, Ple => true
pales,pale => True
pale, bale => True
pale, bake => False
write a function to check if they are one edit (or zero) away

Note 1: Only one character difference

Solution 1 ( Logical Error: because the order matters)
            : using dictionary. if there are the following values in dictionary, then True
            -1, +1 , -1 +1 (everything else should be 0 in values

Q1: uppercase and lowercase are same?
Q2: how about space?
"""


def oneway(s1, s2):
    if abs(len(s1) - len(s2)) > 1:
        return False

    if len(s1) == len(s2):
        counter = 0
        for i in range(len(s1)):
            if s1[i] != s2[i]:
                counter += 1
        if counter > 1:
            return False

    else:
        min_len = min(len(s1), len(s2))
        counter = 0
        for i in range(min_len):
            if s1[i + counter] != s2[i]:
                if len(s1) > len(s2):
                    counter = counter - 1
                else:
                    counter = counter + 1
            if counter > 1 and counter < -1:
                return False

    return True

s1="pale"
s2="ale"
print(oneway(s1, s2))




