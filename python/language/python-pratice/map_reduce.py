

text = """Python – Beyond the Basics builds directly on the foundations laid in our introductory Python course, Python Fundamentals. 
Python is a great dynamic language for web development, big data, science, and scripting. 
In this course we add breadth and depth to your Python skills, exploring the topics you'll need to create robust and readable applications of any size. 
On completing this course, you'll be familiar with the majority of Python techniques and constructs used in Python programs. 
Crucially, we'll also advise you on when – and when not – to use the different tools available in Python to best effect, \
to maximize the quality of your code, your productivity, and the joy inherent in coding in Python."""

def count_words(line):
    normalized_line = "".join(c.lower() if c.isalpha() else ' ' for c in line)
    frequency = {}
    for word in normalized_line.split():
        frequency[word] = frequency.get(word,0) + 1
    return frequency

def combine_counts(d1, d2):
    d = d1.copy()
    for word, count in d2.items():
        d[word] = d.get(word, 0) + count
    return d

from functools import reduce
counts = map(count_words, text.splitlines())

"""
A map object is a generator returned from calling the map() built-in function. 
It is intended to be iterated over (e.g. by passing it to list()) only once, after which it is consumed. 
Trying to iterate over it a second time will result in an empty sequence.
"""
counts = list(counts)
for i in counts:
    print(i)
total_count = reduce(combine_counts, counts)
print(total_count)


#top1 = reduce(lambda kw1, kw2: dict(kw1) if kw1[1] < kw2[1] else dict(kw2), total_count.items())

top1 = max(total_count.items(), key= lambda x: x[1])
print(top1)