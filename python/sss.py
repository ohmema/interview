def kangaroo(x1, v1, x2, v2):
    if v1 == v2:
        if x1 == x2:
            return "YES"
        else:
            return "NO"

    bigger_jumper = max(v1, v2)
    smaller_jumper = min(v1, v2)
    bigger_p = x1 if bigger_jumper == v1 else x2
    smaller_p = x2 if bigger_jumper == v1 else x1
    i = 1
    while True:

        big = i * bigger_jumper + bigger_p
        small = i * smaller_jumper + smaller_p
        if big == small:
            return "YES"
        if big > small:
            break
        i += 1
    return "NO"

print(kangaroo(2564, 5393, 5121, 2836))