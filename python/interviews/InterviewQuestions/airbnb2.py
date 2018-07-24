def consecutive(num):
    count = 0
    L = 1
    while (L * (L + 1) < 2 * num):
        a = (num - (L * (L + 1)) / 2) / (L + 1)
        print("{} {}".format(a, int(a)))
        if (a - int(a) == 0.0):
            count += 1
        L += 1
    print(count)
    return count

consecutive(15)