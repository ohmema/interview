def checkMagazine(magazine, note):
    memo = {}
    for word in magazine:
        count = memo.get(word, 0)
        memo[word] = count + 1

    for word in note:
        count = memo.get(word, 0)
        if count == 0:
            return "No"
        else:
            count = count - 1
            memo[word] = count
    return "Yes"

inputs = [ ("two times three is not four", "two times two is four"),
           ("give me one grand today night","give one grand today"),
           ("give me one grand today night", "give one grand today")
        ]

for i in inputs:
    print("{} : {}".format(i[0],i[1]), end = " : ")
    print(checkMagazine(i[0].strip().split(),i[1].strip().split()))