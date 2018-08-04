"""
[2,3, 3] | [3, 4, 3] = [3]

[2,3,3] | [3, 4, 3] = [3, 3]
"""


def intersect_two_lists_1(l1, l2):
    s1 = set(l1)
    s2 = set(l2)
    return list(s1 & s2)

def intersect_two_lists_2(l1, l2):
    data = {}
    for e in l1:
        count = data.get(e, 0)
        data[e] = count + 1
    return_list = []
    for e in l2:
        count = data.get(e, 0)
        if count > 0:
            return_list.append(e)
            data[e] = count -1
    return return_list

print(intersect_two_lists_1([1,2,3,3], [3,3,7,8]))
print(intersect_two_lists_2([-3, 3, 1,2,3], [3,7,8, 3, 1]))
print(intersect_two_lists_1([], []))
print(intersect_two_lists_2([], []))
print(intersect_two_lists_1([4], [-4]))
print(intersect_two_lists_2([4], [-4]))