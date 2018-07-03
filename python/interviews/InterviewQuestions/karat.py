counts = [
    "900,google.com",
    "60,mail.yahoo.com",
    "10,mobile.sports.yahoo.com",
    "40,sports.yahoo.com",
    "300,yahoo.com",
    "10,stackoverflow.com",
    "2,en.wikipedia.org",
    "1,es.wikipedia.org"]

"""
1320    com
 900    google.com
 410    yahoo.com
  60    mail.yahoo.com
  10    mobile.sports.yahoo.com
  50    sports.yahoo.com
  10    stackoverflow.com
   3    org
   3    wikipedia.org
   2    en.wikipedia.org
   1    es.wikipedia.org
"""


# O(nk)
def get(_counts):
    data = dict()

    for word in _counts:
        domain = word.split(",")[1]
        data[domain] = 0
        for i in range(len(domain)):
            if domain[i] == '.':
                name = domain[i + 1:]
                data[name] = 0

    for word in _counts:
        count = int(word.split(",")[0])
        name = word.split(",")[1]  # google.com
        for k in data:  # com, google.com
            if k in name:
                count = data[k] + count
                data[k] = count

    import pprint
    pprint.pprint(data)


get(counts)



user0 = ["/nine.html", "/four.html", "/six.html", "/seven.html", "/one.html"]
user1 = ["/one.html", "/two.html", "/three.html", "/four.html", "/six.html"]
user2 = ["/nine.html", "/two.html", "/three.html", "/four.html", "/six.html", "/seven.html"]
user3 = ["/three.html", "/eight.html"]

"""
f(user0, user2):
   /four.html
   /six.html
   /seven.html

f(user1, user2):
   /two.html
   /three.html
   /four.html
   /six.html

f(user0, user3):
   None

f(user1, user3):
   /three.html

"""


def f(user1, user2):
    max = []

    for i in range(len(user1)):
        tempi = i
        temp = []
        for j in range(len(user2)):
            if user1[tempi] == user2[j]:
                temp.append(user1[tempi])
            else:
                temp =[]
                continue
            tempi += 1

            if len(max) < len(temp):
                max = temp

    return max



print(f(user0, user2))
