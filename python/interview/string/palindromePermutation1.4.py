"""
input: "Tact Coa"
output: True   :"taco cat", "atco cta "

Note 1: Space can be skipped in an example
Note 2: upper and lower letters can be treated equally
Note 3: odd number of characters can be once at most.

Solution: using dictionary, store number of characters in the dictionary.
          key = cha  value:frequency
          if there are more than one odd number in values(), then False. Otherwise, True

          Skip " " and "\n" to be stored. store only lower characters

Q1: empty string is True or False?
"""


def palindromePermutation(s1):
    lib = dict()
    for c in s1:
        if not c.isalnum():
            continue
        c = c.lower()
        frequency = lib.get(c, 0)
        lib[c] = frequency + 1

    numOfodd = 0
    for i in lib.values():
        if i%2 == 1:
            numOfodd += 1
        if numOfodd > 1:
            return False

    return True


#Testcase
tc1 = ""
print(palindromePermutation(tc1))
tc2 = "a"
print(palindromePermutation(tc2))
tc3 = "ab a  bc"
print(palindromePermutation(tc3))
tc4 = "ab a  bcv"
print(palindromePermutation(tc4))
