
"""
Date: 1/17/2018
Result: need sharpness
inout: 64 bits
output: charity bit (true or false)
"""
def convert_bits_to_string(num, bits = 32):
    binary=[]
    for _ in range(bits):
        if num & 1 :
            binary.insert(0,"1")
        else:
            binary.insert(0,"0")
        num = num >> 1
    return "".join(binary)


def get_charitybit(words):
    count = 0
    while words:
        if words & 1:
            count += 1
        words = words >> 1

    return 0 if count%2 == 0 else 1

if __name__ == "__main__":
    inputs =[0,1,2,3,4,5,6,7]
    for num in inputs:
        print("{} : {} : {}".format(num, convert_bits_to_string(num), get_charitybit(num)))



