_list = []
inputs = input("Numbers=>").split()
for num in inputs:
    _list.append(num)

frequency = {}
for i in _list:
    f = frequency.get(i, 0)
    frequency[i] = f + 1

ordered_freq = list(set(frequency.values()))
ordered_freq.sort(reverse=True)
ordered_values = []

for f in ordered_freq:
    for k, v in frequency.items():
        if v == f:
            ordered_values.extend([k] * f)

for e in ordered_values:
    print(e, end=" ")