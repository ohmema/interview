import sys, time
from itertools import count, islice

def _int32_to_bytes(i):
    """Convert an integer to four bytes in little-endian format."""
    return bytes((i & 0xff,
                  i >> 8 & 0xff,
                  i >> 16 & 0xff,
                  i >> 24 & 0xff))


def _bytes_to_int32(b):
    """Convert a bytes object containing four bytes into an integer."""
    return b[0] | (b[1] << 8) | (b[2] << 16) | (b[3] << 24)

with open("sample.txt", mode = "wb") as f:
    pos = None
    eof=None
    for i in range(10000000,10000003 ):
        if i == 10000001:
            pos = f.tell()
            f.write(b"\x00\x00\x00\x00")
        f.write((i).to_bytes(4,"little", signed=True))
        eof = f.tell()

    f.seek(pos)
    f.write((9999).to_bytes(4, "little", signed=True))
    f.seek(eof)
    f.write(_int32_to_bytes(10000003))

#    f.write(b"\n")

# with open("sample.txt", mode="rt", encoding="utf-8") as f:
#     for line in f.readlines():
#         sys.stdout.write(line)


print()
with open("sample.txt", mode="rb") as f:
    while True:
        i = f.read(4)
        if not i :
            break
        i = int.from_bytes(i, "little", signed=True )
        sys.stdout.write(str(i))
