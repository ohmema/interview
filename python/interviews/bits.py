

def numOf1_bits(num):
    n = 0
    for i in range(32):
        bit = num & 0x01 << i
        if bit == 1:
            n+=1
    print(n)

inputs = [5,6,7,8]

for input in inputs:
    numOf1_bits(input)
