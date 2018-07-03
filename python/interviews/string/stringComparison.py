# Enter your code here. Read input from STDIN. Print output to STDOUT

def isSubstring(_super, _sub):
    # O(nm)
    for i in range(0, len(_super)):
        ch = _super[i]
        if len(_sub) > 0 and ch == _sub[0]:
            if len(_super[i:]) < len(_sub):
                return False
            _len = 0
            for j in range(len(_sub)):
                if _super[i + j] != _sub[j]:
                    break;
                _len+=1
            if _len == len(_sub):
                return True
    return False


def isSubstring2(_super, _sub):
    for i in range(0, len(_super)):
        sub = _super[i:i + len(_sub)]
        if sub == _sub:
            return True
    return False


def isSubstring3(_super, _sub):
    return (_sub in _super)


inputs = [("hello world", "world"), (" hello world ", "o w"), (" ", " "), (" ", ""), ("hello", "hello "),
          ("hello", "hillo"), ("hello", " hello")]

inputs = [(" ", " "), (" ", "")]

for t in inputs:
    print("'{}' : '{}' : '{}'".format(t[0], t[1], isSubstring(t[0], t[1])))
print("#" * 100)
for t in inputs:
    print("'{}' : '{}' : '{}'".format(t[0], t[1], isSubstring2(t[0], t[1])))
print("#" * 100)
for t in inputs:
    print("'{}' : '{}' : '{}'".format(t[0], t[1], isSubstring3(t[0], t[1])))
