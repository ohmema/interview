class DD:
    A = "None"
    B = "assasa"
    def p(self):
        print(self.A)
        self.B = "chnaged"
    def pp(self):
        print(self.B)

    @classmethod
    def ppp(cls, c ):
        cls.B = c

d = DD()
d.p()
d.pp()
print(DD.B)
DD.ppp("VVVVV")
print(DD.B)


