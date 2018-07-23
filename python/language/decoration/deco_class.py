class Deco:
    def __init__(self, f):
        self.f =  f
    def __call__(self):
        print("Decorating", self.f.__name__)
        self.f()


d = Deco(lambda: print("sasas"))
d()

@Deco
def foo():
    print("ssss")

foo()
