import heapq



def leastInterval(tasks, n):

    cached = {}
    for t in tasks:
        cached[t] = cached.get(t, 0) + 1

    p1, p2 = [], []

    for t, c in cached.items():
        heapq.heappush(p1, (-c, t))

    schedule = []

    while len(cached) != 0:
        interval = n
        while interval + 1:
            if len(p1) != 0:
                c, t = heapq.heappop(p1)
                c = -c
                schedule.append(t)
                if c == 1:
                    cached.pop(t)
                else:
                    cached[t] = c - 1
                    heapq.heappush(p2, (-(c - 1), t))
            else:
                schedule.append("idle")
            if len(cached) == 0:
                break
            interval -= 1
        while len(p1) != 0:
            heapq.heappush(p2, heapq.heappop(p1))
        p1, p2 = p2, p1
    return schedule

inputs = [(["A","A","A","A","A","A","B","C","D","E","F","G"], 2),(["A","A","A","B","B","B"], 2)]

for i in inputs:
    print(leastInterval(i[0], i[1]))