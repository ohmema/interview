"""
Date:1/18/2018

Error was :

while implementing the function reverse_bit variable name was changed to reversed_bytes.
Then, I did not collect all the variables.
"""
from interviews.bitwise.paritybit import *

def reverse_bits(bytes, bits = 32):
    reversed_bytes=0
    for _ in range(bits):
        last_bit = (bytes & 1)
        bytes =  bytes >> 1

        reversed_bytes = reversed_bytes << 1
        reversed_bytes = (reversed_bytes | last_bit)

    return reversed_bytes

inputs = [0, 1,2,3,4,5,6,7,8,9,10, 255, 384 ]
n_inputs = [-1,-2,-3,-4,-5,-6, -7, -8, -9, -10,  -255, -384 ]
for i in inputs:
    print("{}, {}".format(convert_bits_to_string(i), convert_bits_to_string(reverse_bits(i))))

print("#"*100)
for i in n_inputs:
    print("{}, {}".format(convert_bits_to_string(i, 64), convert_bits_to_string(reverse_bits(i, 64), 64)))