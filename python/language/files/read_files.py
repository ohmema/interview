def readchars(filename):
    with open(filename, mode='rt') as f:
        for four in f:
            print(four, end="")

def readchars1(filename):
    with open(filename, mode='rt') as f:
        print(f.read())

def readchars2(filename):
    with open(filename, mode='rt') as f:
        lines = f.readlines()
        print("".join(lines))

def readchars3(filename):
    with open(filename, mode='rt') as f:
        four = f.read(4)
        while four:
            print(four, end="")
            four = f.read(4)


filename = "language/files/b.txt"
readchars3(filename)