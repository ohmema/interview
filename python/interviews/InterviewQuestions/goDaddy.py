import urllib.request
import json


# Complete the function below.

def getMovieTitles(substr):
    with  urllib.request.urlopen('https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr) as f:
        _str = f.read().decode("utf-8")
    _json = json.loads(_str)
    with open("titles.json", 'w') as f:
        json.dump(_json, f)
    entities = _json["data"]
    entities.sort(key = lambda a: a["Title"])
    return [ entity["Title"] for entity in entities]

def getMovieTitles1(substr):
    with  urllib.request.urlopen('https://jsonmock.hackerrank.com/api/movies/search/?Title=' + substr) as f:
        _json = json.load(f)
    with open("titles.json", 'w') as f:
        json.dump(_json, f)
    entities = _json["data"]
    entities.sort(key = lambda a: a["Title"])
    return [ entity["Title"] for entity in entities]

res = getMovieTitles1("spiderman")
for res_cur in res:
    print(res_cur)
