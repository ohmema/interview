class Human:
    def __init__(self):
        self.name = 'Guido'
        self.head = self.Head()
        self.brain = self.Brain()

    class Head:
        def talk(self):
            return 'talking...'

    class Brain:
        def think(self):
            return 'thinking...'

class Outer:
    num = 30
    def __init__(self):
        print ('Instance of outer class is created')

    class Inner:
        def __init__(self):
            print ('Instance of Inner class is created')

if __name__ == '__main__':
    guido = Human()
    print(guido.name)
    print(guido.head.talk())
    print(guido.brain.think())

    o = Outer.Inner()

    head = Human.Head()
    brian = Human.Brain()