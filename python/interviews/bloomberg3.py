
"""
Alex is shopping at a flea market and has some items he would like to purchase.
Noticing Alex's interest, the stand owner makes the following offer.  If Alex agrees to buy everything he has selected, the owner will discount each item after the first by the lesser of the item'
s cost or the non - discounted price of any earlier item in the list.

For example,
if he has items priced[2, 5, 1], he pays 2 for the first item, 5-2=3 for the second item, and gets the third item for free: max(
    1 - min(2, 5)) = 1 - 2 = -1, 0.
The first item is never discounted and the minimum cost of any item is 0. His total cost to purchase all items is 2 + 3 + 0 = 5.

Function Description

Complete the function calculateAmount in the editor below. The function must return Alex 's total cost to purchase all the items.

calculateAmount has the following parameter(s):

prices[prices[0], ...
prices[n - 1]]:  an array of integers representing the original prices of each of the items Alex has selected

Constraints

1 ≤ n ≤ 105
1 ≤ prices[i] ≤ 107, where
0 ≤ i < n

Input Format for Custom Testing

Sample
Input
0

4
4
9
2
3

Sample
Output
0

10

Explanation
0

n = 4, prices = [4, 9, 2, 3]

prices[0] = 4;
d[0] = 0;
cost[0] = 4
because
the
first
item is never
discounted.

prices[1] = 9;
d[1] = 4;
cost[1] = 9 − 4 = 5

prices[2] = 2;
d[2] = min(4, 9) = 4;
cost[2] = 0
because
d[2] > prices[2].

prices[3] = 3;
d[3] = min(4, 9, 2) = 2;
cost[3] = 3 − 2 = 1

The
total
cost
returned
by
our
calculateAmount
function is 4 + 5 + 0 + 1 = 10.
"""


# Complete the calculateAmount function below.
def calculateAmount(prices):
    price = 0
    _min = prices[0]
    for i in range(len(prices)):
        if i == 0:
            price += prices[i]
            continue

        disc = prices[i] - _min
        if disc > 0:
            pr = disc
        else:
            pr = 0
        price += pr
        _min = min(prices[i],_min)

    return price


inputs = [[4, 9, 2, 3]]

for i in inputs:
    print(calculateAmount(i))
