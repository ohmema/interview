from  nose.tools import raises
def  test_fail():
    assert False

@raises(IndexError)
def test_expetion():
	raise IndexError

