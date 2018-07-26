"""
Given a date string in the format Day Month Year, where:

Day is in the set {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", …, "29th", "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the inclusive range[1900, 2100].

Convert the date string to the format YYYY - MM - DD, where:

YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.

For example:
1st Mar 1984 → 1984 - 03 - 01
2nd Feb 2013 → 2013 - 02 - 02
4th Apr 1900 → 1900 - 04 - 04

Function
Description

Complete
the
function
reformatDate in the
editor
below.The
function
must
return an
array
of
converted
date
strings in the
order
presented.


10
20th Oct 2052
6th Jun 1933
26th May 1960
20th Sep 1958
16th Mar 2068
25th May 1912
16th Dec 2018
26th Dec 2061
4th Nov 2030
28th Jul 1963
Sample
Output
0

2052 - 10 - 20
1933 - 06 - 06
1960 - 05 - 26
1958 - 09 - 20
2068 - 03 - 16
1912 - 05 - 25
2018 - 12 - 16
2061 - 12 - 26
2030 - 11 - 04
1963 - 07 - 28
Explanation

We
convert
the
following
n = 10
dates:

20th Oct 2052 → 2052 - 10 - 20
6th Jun 1933 → 1933 - 06 - 06
26th May  1960 → 1960 - 05 - 26
20th Sep 1958 → 1958 - 09 - 20
16th Mar 2068 → 2068 - 03 - 16
25th May 1912 → 1912 - 05 - 25
16th Dec 2018 → 2018 - 12 - 16
26th Dec 2061 → 2061 - 12 - 26
4th Nov 2030 → 2030 - 11 - 04
28th Jul 1963 → 1963 - 07 - 28
We then return the array
["2052-10-20", "1933-06-06", "1960-05-26", "1958-09-20", "2068-03-16", "1912-05-25", "2018-12-16", "2061-12-26", "2030-11-04", "1963-07-28"] as our
answer.

"""

DAYS = {"1st":"1", "2nd":"2", "3rd":"3"}
for i in range(4,32):
    DAYS[str(i)+"th"] = str(i)

MONTHS = {"Jan":"01", "Feb":"02", "Mar":"03", "Apr":"04", "May":"05", "Jun":"06", "Jul":"07", "Aug":"08", "Sep":"09", "Oct":"10", "Nov":"11", "Dec":"12"}
YEARS = (1900, 2100)

def formated_date(s):
    words = s.strip().split()
    day = words[0]
    mon = words[1]
    year = words[2]

    r_s = year + "-" + MONTHS[mon] + "-" + DAYS[day]
    return r_s

inputs = ["26th May  1960", "25th May 1912"]
for s in inputs:
    print(formated_date(s))
