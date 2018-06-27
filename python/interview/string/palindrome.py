def isPalindrome(word):
    if word == None :
        return False

    if len(word) == 0 or len(word) == 1:
        return True

    i, j  = 0, len(word) - 1
    while i < j:
        while i < len(word) and not word[i].isalpha():
            i += 1

        while j > 0  and not word[j].isalpha():
            j -= 1

        if i >= j:
            return True

        if word[i].lower() != word[j].lower():
            return False

        i += 1
        j -= 1

    return True

input = "Don't nod."
print(input, end= " : Palandrome ")
print(isPalandrome(input))

input = "I did, did I?"
print(input, end= " : Palandrome ")
print(isPalandrome(input))

input = "My gym"
print(input, end= " : Palandrome ")
print(isPalandrome(input))


inputs = [ "Red rum, sir, is murder",
           "Step on no pets",
            "Top spot",
            "Was it a cat I saw?",
            "Eva, can I see bees in a cave?",
            "No lemon, no melon",
           "s",
           "ss",
           "      ",
           "   d     @"]

for w in inputs:
    print(w, end=" : Palandrome ")
    print(isPalandrome(w))


inputs =[ "ws", " s  a ", " k k d d", ]
for w in inputs:
    print(w, end=" : Palandrome ")
    print(isPalandrome(w))