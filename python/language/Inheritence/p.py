import unittest
class A:
    def __init__(self):
        self.data=[]
        print("A")

    def test_empty(self):
        pass

    def add(self, item):
        print("A add: ")
        self.data.append(item)

class B(A):
    def __init__(self):
        super().__init__()
        print("B")

    def add(self, item):
        print("B add: ")
        super().add(item)

class C(A):
    def __init__(self):
        super().__init__()
        print("C")

    def add(self, item):
        print("C add: ")
        super().add(item)

class D(B, C):
    pass

class testA(unittest.TestCase):
    def test_empty(self):
        pass

    def test(self):
        pass

class testB(unittest.TestCase):
    def test_empty(self):
        pass

    def test(self):
        pass


class testC(unittest.TestCase):
    def test_empty(self):
        pass

    def test(self):
        pass

class testD(unittest.TestCase):
    def test_empty(self):
        pass

    def test(self):
        pass


if __name__ == "__main__":
    unittest.main()

