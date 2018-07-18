def _int32_to_bytes1(i):
    """Convert an integer to four bytes in little-endian format."""
    return bytes((i & 0xff,
                  i >> 8 & 0xff,
                  i >> 16 & 0xff,
                  i >> 24 & 0xff))

def _int32_to_bytes(i):
    """Convert an integer to four bytes in little-endian format."""
    return bytes((i | 0x00,
                  i >> 8 | 0x00,
                  i >> 16 | 0x00,
                  i >> 24 | 0x00))

def _bytes_to_int32(b):
    """Convert a bytes object containing four bytes into an integer."""
    return b[0] | (b[1] << 8) | (b[2] << 16) | (b[3] << 24)




def f_write_int(filename):
    with open(filename, mode='wb') as f:
        d = [i for i in range(10)]
        for i in d:
            f.write(_int32_to_bytes(i))


def f_read_int(filename):
    with open(filename, mode="rb") as f:
        four = f.read(4)
        while four:
            i = _bytes_to_int32(four)
            print(i, end="")
            four = f.read(4)

filename = "f.dat"
f_write_int(filename)
f_read_int(filename)
print()
print("#"*100)
def f_write_str(filename):
    with open(filename, mode='wb') as f:
        c = [chr(c) for c in range(ord('a'), ord('z')+1)]
        c = "".join(c)
        f.write(c.encode("utf-8"))

def f_read_str(filename):
    with open(filename, mode='rb') as f:
        c = f.read().decode("utf-8")
        print(c)

filename = "c.dat"
f_write_str(filename)
f_read_str(filename)