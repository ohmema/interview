cpu_usage_values = [
    (1478111360, 3),
    (1478111370, 1),
    (1478111380, 7),
    (1478111390, 2),
    (1478111400, 90),
    (1478111410, 94),
    (1478111420, 97),
    (1478111430, 93),
    (1478111440, 3),
    (1478111450, 2),
    (1478111460, 94),
    (1478111470, 97),
    (1478111480, 93),
    (1478111490, 3),

]


def threshholdFilter(cpu_usage_values, threshold):
    rv = []
    for t in cpu_usage_values:
        if (t[1] >= threshold):
            rv.append(t)
    return rv


def threshholdFilterWithDuration(cpu_usage_values, threshold, du_t):
    rv = []
    start_duration = cpu_usage_values[0]
    for t in cpu_usage_values:
        if (t[0] - start_duration[0]) > du_t and t[1] >= threshold:
            rv.append(t)
        elif (t[0] - start_duration[0]) <= du_t and t[1] >= threshold:
            pass
        elif t[1] < threshold:
            start_duration = t
    return rv


print(threshholdFilter(cpu_usage_values, 90))
print(threshholdFilterWithDuration(cpu_usage_values, 90, 20))