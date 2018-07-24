def mindGuess(target, guess):
    data = {}
    for i, v in enumerate(target):
        indexes = data.get(v, [])
        indexes.append(i)
        data[v] = indexes

    hit = 0
    for i, v in enumerate(guess):
        indexes = data.get(v, [])
        if i in indexes:
            hit += 1
            indexes.remove(i)
            data[v] = indexes

    neighbor = 0
    for i, v in enumerate(guess):
        indexes = data.get(v, [])
        if len(indexes) > 0:
            indexes.pop(0)
            neighbor += 1
            data[v] = indexes

    return hit, neighbor

inputs = [([1,2,3,4], [1,1,2,2]),
          ([1,2,1,3], [1,1,2,2]),
          ([3,4,5,4], [3, 3,4, 4]),
          ([-1, 0, 0, 0, 3],[0,0,0, 3, -1]),
          ([4,5,6,7], [0,1,2,3,4, 5]),
          ([6,7,8,9], [-1,2,3,-2, 7, 13, 20])]

for input in inputs:
    print("{} {}".format(input[0], input[1]), end = " : ")
    print("{}".format(mindGuess(input[0], input[1])))
