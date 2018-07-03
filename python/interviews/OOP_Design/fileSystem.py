"""
Design fiel sysysem
"""

class File:
    def __init__(self, name, path, size = 0):
        self._name = name
        self._path= path
        self._permission = None
        self._owner = None
        self._size = size

    def getname(self):
        return self._name

    def setname(self, name):
        self._name = name

    def getpath(self):
        return self._path

    def setpath(self, path):
        self._path = path

    def getpermission(self):
        return self._permission

    def setpermission(self, p):
        self._permission = p

    def getowner(self):
        return self._owner

    def setowner(self, owner):
        self._owner = owner

    def getsize(self):
        return self._size

    def updatesize(self, size):
        self._size = size


class Directory(File):
    def __init__(self,  name, path):
        super().__init__(name, path)
        self.files = []
        self.directories = []

    def getfiles(self):
        return self.files

    def getdirectories(self):
        return self.directories

class FileSystem:
    def __init__(self):
        self.root = Directory("root", "/")
        self.current_dir = self.root

    def createDirectory(self, name, path = None):
        if path :
            self._createDirectory(self.current_dir, name, path)
        else:
            self.current_dir.directories.append(Directory(name,self.current_dir.getpath() + name))

    def _createDirectory(self, dir, name, path):
        if len(path.split("/")) == 1:
            for d in dir.directories:
                if d.getname() == path.split("/")[0]:
                    d.directories.append(Directory(name, path+name))
                    return
        for d in dir.directories:
            if d.getname() == path.split("/")[0]:
                self._createDirectory(d, name, "/".join(path.split("/")[1:]))
                break


    def createFile(self, name , path = None, size = 0):
        if path :
            self._createFile(self.current_dir.directories, name, path, size)
        else:
            self.current_dir.files.append(File(name,self.current_dir.getpath() + name, size))

    def _createFile(self, dir, name, path, size):
        if path == "" or path == "/":
            dir.files.append(File(name, path+name, size))
            return
        for d in dir:
            if d.path.split("/")[-1] == path.split("/")[0]:
                self._createFile(d, name, "/".join(path.split("/")), size)



    def ls(self):
        for f in self.current_dir.files:
            print(f.getname(), end = " ")
        for d in self.current_dir.directories:
            print(d.getname())


    def copy(self, _from, _to):
        pass

    def mv(self, _from, _to):
        pass

    def print_all(self):
        self._print_all(self.root, "" )

    def _print_all(self, dir, prefix):
        for f in dir.files:
            print(prefix + f.getname(), end = "  ")

        for d in dir.directories:
            print(prefix + d.getname())
            self._print_all(d, prefix + "  ")



s = FileSystem()

s.createDirectory("temp")
s.createDirectory("temp","temp")
s.createDirectory("temp","temp/temp")
s.createFile("temp.sh", None, 20 )
s.print_all()

#s.ls()