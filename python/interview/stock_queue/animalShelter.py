class Animal:
    NumOfAnimal = 0
    def __init__(self, name, gender):
        self.name = name
        self.gender = gender
        self.num = Animal.NumOfAnimal
        Animal.NumOfAnimal += 1

class Cat(Animal):
    def __init__(self, name=None, gender=None):
        super().__init__(name, gender)

class Dog(Animal):
    def __init__(self, name=None, gender=None):
        super().__init__(name, gender)

from datetime import datetime

class AnimalShelter:
    def __init__(self):
        self.shelter = []

    def enqueue(self, a):
        self.shelter.append(a)

    def dequeue(self):
        return self.shelter.pop(0)

    def dequeueDog(self, kind = Dog):
        for i, a in enumerate(self.shelter):
            if isinstance(a, kind):
                return self.shelter.pop(i)

    def dequeueCat(self):
        return self.dequeueDog(kind=Cat)


s = AnimalShelter()
s.enqueue(Dog())
s.enqueue(Cat())
s.enqueue(Dog())
s.enqueue(Cat())
s.enqueue(Dog())
import pprint
pprint.pprint(s.shelter)
print("$"*100)
s.dequeue()
pprint.pprint(s.shelter)
print("$"*100)
s.dequeueDog()
pprint.pprint(s.shelter)
print("$"*100)
s.dequeueDog()
pprint.pprint(s.shelter)
