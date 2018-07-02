class Person:
    def __init__(self, name):
        self.name = name
        print("aaaa")

    def show(self):
        print(self.name)

class Employee(Person):
    def __init__(self, name):
        Person.__init__(self, name)
        self.ename = name*2
        print("sssss")
        Person.__init__(self, name)

    def show(self):
        print(self.ename)

e = Employee("jame")

e.show()

print(e.name)
print(e.ename)