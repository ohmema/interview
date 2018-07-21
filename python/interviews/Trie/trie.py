class Node:
    def __init__(self, end = False):
        self.children = [None]*26
        self.end = end
        self.sum = 0 # for to find all the number of matching string

class Trie:
    def __init__(self):
        self.root = Node()

    def add(self, _str):
        l = len(_str)
        p = self.root
        for ch in _str:
            index = ord(ch.lower()) - ord('a')
            if not p.children[index]:
                p.children[index] = Node()
            p = p.children[index]
            p.sum = p.sum + 1
        p.end = True

    def search(self, _str):
        p = self.root
        for ch in _str:
            index = ord(ch.lower()) - ord('a')
            if p.children[index] == None:
                return False
            p = p.children[index]

        return p != None and p.end

    def find(self, _str):
        p = self.root
        for ch in _str:
            index = ord(ch.lower()) - ord('a')
            if p.children[index] == None:
                return []
            p = p.children[index]

        return self._find(p, _str)

    def _find(self, p, _str):
        all =[]
        if p != None and p.end == True:
            all.append(_str)

        for i, iNode in enumerate(p.children):
            if iNode != None:
                re = self._find(iNode, _str+ chr(ord('a')+i))
                all.extend(re)
        return all

    def find_sum(self, _str):
        p = self.root
        for ch in _str:
            index = ord(ch.lower()) - ord('a')
            if p.children[index] == None:
                return 0
            p = p.children[index]

        return p.sum


t = Trie()
t.add("hack")
t.add("hacker")
t.add("hackerrank")

print(t.search("hack"))
print(t.search("hacky"))
print(t.search("hacker"))
print(t.search("hac"))
print(t.search("hackerrank"))
print(t.find("ha"))
print(t.find_sum("ha"))
print(t.find("hak"))
print(t.find_sum("hak"))
print(t.find("z"))
print(t.find_sum("z"))