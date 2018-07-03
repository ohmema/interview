"""
Date:1/17/2018
"""
from interviews.bitwise.paritybit import *


def swapbits(num, i, j):
    biti = num >> i  & 1
    bitj = num >> j & 1

    if biti == bitj:
        return num
    elif biti == 1 and bitj == 0:
        num &= ~(1 << i)
        num |=  1 << j
    elif biti == 0 and bitj == 1:
        print("#" * 100)
        num |= 1 << i
        num &= ~(1 << j)

    return num
inputs  =[(23, 1, 6), (1289, 3, 6)]

for t in inputs:
    print("{} {} {}: {} {}".format(t[0],t[1], t[2], convert_bits_to_string(t[0]), convert_bits_to_string(swapbits(t[0], t[1], t[2]))))

