import json, fileinput

def writejson():
    filename ="dict.json"
    d = {"aaa": 2, "eee":4, "rrr":[1,2,3,4] }
    with open(filename, 'w') as f:
        json.dump(d, f)

def overwritejson():
    filename ="dict.json"
    with open(filename, 'r+') as f:
        d  = json.load(f)
        d["aaa"]=100
        f.seek(0)
        json.dump(d, f)

def inplace_overwritejson():
    filename ="dict.json"
    for line in fileinput.input(filename, inplace=True):
        line = line.replace("2", "3")
        print(line)

writejson()

#overwritejson()
inplace_overwritejson()