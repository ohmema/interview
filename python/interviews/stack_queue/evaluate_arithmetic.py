"""
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are +, -, *, /. Each operand may be an integer or another expression. For example:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
"""



def calculate(array):
    stack = []
    stack.extend(array[0:2])
    for e in array[2:]:
        if isinstance(e, str):
            a = stack.pop()
            b = stack.pop()
            c = cal(e, a,b)
            stack.append(c)
        else:
            stack.append(e)

    if len(stack) != 1:
        print(stack)
        raise ValueError("Wrong format")
    return stack.pop()

def cal(e, a, b):
    e = e.strip()
    if e == '+':
        return a+b
    elif e == "-":
        return a-b
    elif e == "/":
        return a/b
    elif e == "*":
        return a*b
    else:
        raise ValueError("Wrong Arithmetic operation")


inputs = [[2, 1, "+", 3, "*"], [4, 13, 5, "/", "+"]]
for e in inputs:
    print(e, end=" : ")
    print(calculate(e))


