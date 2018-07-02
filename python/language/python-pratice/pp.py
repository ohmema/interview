import time

t = (2012, 9, 29,13,6,52,1,273,-1)

t= time.mktime(t)
print(time.strftime("%b, %d, %Y %H", time.gmtime(t)))


import re
line = "my dogs are my friends"
m = re.match(r'Dogs', line, re.M|re.I)
print(bool(m))
m = re.search(r'Dogs', line, re.M|re.I)
print(bool(m))

