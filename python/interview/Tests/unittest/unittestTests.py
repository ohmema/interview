import tempfile, os, sys, traceback
import unittest


class Tests(unittest.TestCase):
    COUNT = 0
    def setUp(self):
        self.f = tempfile.TemporaryFile(mode = "w+t")
        Tests.COUNT += 1
        print("count : {} : {}".format(Tests.COUNT, self.f) )


    def tearDown(self):
        try:
            print("Tear down count : {}".format(Tests.COUNT))
            Tests.COUNT -= 1
            self.f.close()
            os.remove(self.f.name)

        except Exception as e:
            traceback.print_exc(file= sys.stderr)


    def test_a1(self):
        self.assertEqual(self.f.read(), "")


    def test_a2(self):
        self.f.write("x")
        self.f.seek(0)
        self.assertEqual(self.f.read(), "x")
    
    def test_a3(self):
        with  self.assertRaises(TypeError):
            self.f.write(b"x")

if __name__ == "__main__":
    unittest.main()