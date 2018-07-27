

"""
sprints = [1,5,10,3]

1 -> 5 ->10 -> 3
sprint 1 2 3 4 5 6 7 8 9 10
1      1 1 1 1 1
2              1 1 1 1 1 1
           1 1 1 1 1 1 1 1
visit  1 1 2 2 3 2 2 2 2 2

return lowest number of visits that is visited most time
return 5

sprint = [2,4,1,3]
2->4->1->3
sprint  1 2 3 4
          1 1 1
        1 1 1 1
        1 1 1
        2 3 3 1

return lowest number of visits that is visited most time
return 2

"""
def getMostVisited_timeout(n, sprints):
    nums = [0] * (n + 1)
    m = 0
    for i in range(1, len(sprints)):
        i, j = min(sprints[i - 1], sprints[i]), max(sprints[i - 1], sprints[i])
        for k in range(i, j + 1):
            nums[k] += 1
            m = nums[k] if m < nums[k] else m

    for i in range(n):
        if nums[i] == m:
            return i

def getMostVisited(n, sprints):
    range_sprints = []
    for i in range(1, len(sprints)):
        a = min(sprints[i-1], sprints[i])
        b = max(sprints[i-1], sprints[i])
        range_sprints.append(range(a, b+1))

    m = (0, 0)

    for i in range(1, n+1):
        p = 0;
        for r in range_sprints:
            if i in r:
                p += 1

        m = (p, i) if m[0] < p else m

    return m[1]

inputs =[(10,[4,1,5,10,3]), (5, [2,1,5])]

for i in inputs:
    print(i, end=" : ")
    print(getMostVisited_timeout(i[0],i[1]), end = " : ")
    print(getMostVisited(i[0],i[1]))

