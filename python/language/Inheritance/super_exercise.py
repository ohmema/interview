class Base1:
    def __init__(self):
        v = "Base1.v"
        print("Base1.__init__")

    def ss(self):
        print("Base1.ss()")

class Base2:
    v = "Base2.v"
    def __init__(self):
        print("Base2.__init__")

    def ss(self):
        print("Base2.ss()")

class Sub(Base1, Base2):
    v = "Sub.v"
    pass
    #def __init__(self):
    #    print("Sub.__init__")
    #def ss(self):
    #    print("Sub.ss()")

s = Sub()
s.ss()
#print(s.v)
#s.v = s.v + s.v
print(Sub.v)
#Sub.v = Sub.v+ " " +Sub.v
print(Sub.v)
#print(s.v)

print(super(Sub, s).v)


#print(Sub.mro())
#print(s.mro())
#print(dir(Sub))
#print(dir(s))