from queue import PriorityQueue
max_pq = PriorityQueue()
min_pq = PriorityQueue()


def median(a):
    if max_pq.qsize() == min_pq.qsize():
        if max_pq.qsize() == 0 and min_pq.qsize() == 0:
            max_pq.put(a * -1)
        elif max_pq.queue[0]*-1 > a :
            max_pq.put(a*-1)
        elif max_pq.queue[0]*-1 < a < min_pq.queue[0]:
            max_pq.put(a*-1)
        elif min_pq.queue[0] < a:
            min_pq.put(a)
        elif max_pq.queue[0]*-1 == a:
            min_pq.put(a)
        else:
            max_pq.put(a*-1)
    elif max_pq.qsize() > min_pq.qsize():
        m = max_pq.get()*-1
        _min = min(m, a)
        _max = max(m,a)
        max_pq.put(_min * -1)
        min_pq.put(_max)

    elif max_pq.qsize() < min_pq.qsize():
        m = min_pq.get()
        _min = min(m, a)
        _max = max(m, a)
        max_pq.put(_min * -1)
        min_pq.put(_max)


    if  max_pq.qsize() == min_pq.qsize():
        return (max_pq.queue[0] * -1 + min_pq.queue[0]) / 2
    elif max_pq.qsize() > min_pq.qsize():
        return max_pq.queue[0]*-1
    else:
        return min_pq.queue[0]

    '''
    if max_pq.qsize() == 0 and min_pq.qsize() == 0:
        max_pq.put(a * -1)
        return a

    if max_pq.qsize() == min_pq.qsize() and min_pq.queue[0] > a:
        max_pq.put(a * -1)
        return max_pq.queue[0] * -1

    if max_pq.qsize() == min_pq.qsize() and min_pq.queue[0] < a:
        min_pq.put(a)
        return min_pq.queue[0]

    if max_pq.qsize() > min_pq.qsize() and max_pq.queue[0] * -1 < a:
        min_pq.put(a)
        return (max_pq.queue[0] * -1 + min_pq.queue[0]) / 2

    if max_pq.qsize() > min_pq.qsize() and max_pq.queue[0] * -1 > a:
        max_pq.put(a * -1)
        min_pq.put(max_pq.get() * -1)
        return (max_pq.queue[0] * -1 + min_pq.queue[0]) / 2

    if max_pq.qsize() < min_pq.qsize() and min_pq.queue[0] > a:
        max_pq.put(a * -1)
        return (max_pq.queue[0] * -1 + min_pq.queue[0]) / 2

    if max_pq.qsize() < min_pq.qsize() and min_pq.queue[0] < a:
        min_pq.put(a)
        max_pq.put(min_pq.get() * -1)
        return (max_pq.queue[0] * -1 + min_pq.queue[0]) / 2
    '''

a = []
for i in range(1, 10):
    a.append(i)
    print(a, end = " : ")
    print(median(i))
    print("{} {}".format(max_pq.queue, min_pq.queue))
