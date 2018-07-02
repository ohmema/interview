class Node:
    def __init__ (self, e, next=None):
        self.e=e
        self.next = next

class CircularLinkedList:
    def __init__(self ):
        self.head = None
        self.tail = None

    def add(self, e):
        _new = Node(e, self.head)
        if self.tail == None:
            self.tail = _new
            self.head = _new

        else:
            ptr = self.tail
            ptr.next = _new
            self.tail = _new

    def printFromStartk(self, ptr, k):
        for _ in range(k):
            ptr = ptr.next
        print(ptr.e)

    def print(self):
        ptr = self.head
        while ptr != self.tail:
            print("{} ==>".format(ptr.e), end="")
            ptr = ptr.next
        print("{} ==>".format(ptr.e), end="")
        print("Head")

cll = CircularLinkedList()
for i in range(11):
    cll.add(i)

cll.print()

cll.printFromStartk(cll.head,12)
