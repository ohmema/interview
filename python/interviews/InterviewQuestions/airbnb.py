# Complete the doesCircleExist function below.
def doesCircleExist(commands):
    up_and_down = 1
    left_right = 0
    p = [0, 0]
    for i in range(4):
        for command in commands:
            if "G" == command:
                p[0] += up_and_down
                p[1] += left_right

            if "R" == command:
                if up_and_down == 1 and left_right == 0:
                    up_and_down, left_right = 0, 1
                elif up_and_down == 0 and left_right == 1:
                    up_and_down, left_right = -1, 0
                elif up_and_down == -1 and left_right == 0:
                    up_and_down, left_right = 0, -1
                elif up_and_down == 0 and left_right == -1:
                    up_and_down, left_right = 1, 0

            if "L" == command:
                if up_and_down == 1 and left_right == 0:
                    up_and_down, left_right = 0, -1
                elif up_and_down == 0 and left_right == -1:
                    up_and_down, left_right = -1, 0
                elif up_and_down == -1 and left_right == 0:
                    up_and_down, left_right = 0, 1
                elif up_and_down == 0 and left_right == 1:
                    up_and_down, left_right = 1, 0
        if p == [0, 0]:
            return "YES"

    return "NO"

inputs = ["G", "L"]
for commands in inputs:
    print(doesCircleExist(commands))