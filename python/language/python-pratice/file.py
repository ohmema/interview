import os.path

assert os.path.isfile("p.py")

def readText():
    with open("p.py", mode='rt', encoding="utf-8") as f:
        count=0
        for line in f:
            print("{} {}".format(count,line), end="")
            count +=1


def writeBytes():
    with open("p.py", mode="ab") as f:
        #f.write(b"\n")
        #f.write(b"1")
        #f.write(b'\x00')
        a=1
        f.write(bytes())
readText()
#writeBytes()