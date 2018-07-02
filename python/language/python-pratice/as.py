class A:
    def p(self):
        print(self.v)

class B(A):
    def __init__(self ):
        self.v ="B"

class C(A):
    def __init__(self ):
        self.v ="C"



#a = A()
#a.p()

a= B()
a.p()

a = C()
a.p()


