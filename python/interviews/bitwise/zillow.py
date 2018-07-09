# Enter your code here. Read input from STDIN. Print output to STDOUT


"""
Write a function to determine whether a given IP is in a given subnet.

For example:

    in_subnet("128.0.0.0/12", "128.15.32.1") == true
    in_subnet("192.168.1.0/24", "192.168.2.42") == false


cidr : '128.1.32.0/12'
ip   : '128.4.1.20'

00001100 00000001 00110111 01010101
same subnet:00001100 0011 

taotal : 32 bit
12:  1 byte + 4 bit: i >> (8 - 4) 
24:  3 bytes + 0 bit : 8 - 4 

00000100


cidr : '128.1.32.0/12'
ip   : '128.4.1.20'
num =12
subet = 123.1.32.0
bytes = 1
bits = 4
         0     1     2    3
ip1 = ["128", "1", "32", "0"]
ip2 = ["128", "4", "1", "20"]
bit1 =  0000
bit2 =  0000

cidr : '128.1.32.0/2'
ip   : '128.4.1.20'
"""


def isSubnet(cidir, ip):
    num = int(cidir.split('/')[1])
    subnet = cidir.split('/')[0]

    bytes, bits = divmod(num, 8)
    ip1 = subnet.split(".")
    ip2 = subnet.split(".")

    for i in range(bytes):
        if ip1[i] != ip2[i]:
            return False

    bit1 = int(ip1[bytes]) >> (8 - bits)
    bit2 = int(ip2[bytes]) >> (8 - bits)

    if bit1 != bit2:
        return False

    return True
cidr = '128.1.32.0/12'
ip   = '128.4.1.20'

print(isSubnet(cidr, ip))