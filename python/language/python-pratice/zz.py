import heapq

l =[]

heapq.heappush(l, (1, 4))
heapq.heappush(l, (5, 9))
heapq.heappush(l, (7, 19))
heapq.heappush(l, (0, 19))
print(heapq.heappop(l))

print(l)