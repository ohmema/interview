from flask import Flask
import json
import requests
import threading, time

app = Flask(__name__)
print(__name__)
movies = {'page': 1, 'per_page': 10, 'total': 13, 'total_pages': 2,
        'data': [{'Poster': 'https://images-na.ssl-images-amazon.com/images/M/MV5BYjFhN2RjZTctMzA2Ni00NzE2LWJmYjMtNDAyYTllOTkyMmY3XkEyXkFqcGdeQXVyNTA0OTU0OTQ@._V1_SX300.jpg', 'Title': 'Italian Spiderman', 'Type': 'movie', 'Year': 2007, 'imdbID': 'tt2705436'},
                 {'Poster': 'https://images-na.ssl-images-amazon.com/images/M/MV5BMjQ4MzcxNDU3N15BMl5BanBnXkFtZTgwOTE1MzMxNzE@._V1_SX300.jpg', 'Title': 'Superman, Spiderman or Batman', 'Type': 'movie', 'Year': 2011, 'imdbID': 'tt2084949'},
                 {'Poster': 'N/A', 'Title': 'Spiderman', 'Type': 'movie', 'Year': 1990, 'imdbID': 'tt0100669'},
                 {'Poster': 'N/A', 'Title': 'Spiderman', 'Type': 'movie', 'Year': 2010, 'imdbID': 'tt1785572'}, {'Poster': 'N/A', 'Title': 'Fighting, Flying and Driving: The Stunts of Spiderman 3', 'Type': 'movie', 'Year': 2007, 'imdbID': 'tt1132238'},
                 {'Poster': 'http://ia.media-imdb.com/images/M/MV5BMjE3Mzg0MjAxMl5BMl5BanBnXkFtZTcwNjIyODg5Mg@@._V1_SX300.jpg', 'Title': 'Spiderman and Grandma', 'Type': 'movie', 'Year': 2009, 'imdbID': 'tt1433184'},
                 {'Poster': 'N/A', 'Title': 'The Amazing Spiderman T4 Premiere Special', 'Type': 'movie', 'Year': 2012, 'imdbID': 'tt2233044'},
                 {'Poster': 'N/A', 'Title': 'Amazing Spiderman Syndrome', 'Type': 'movie', 'Year': 2012, 'imdbID': 'tt2586634'},
                 {'Poster': 'N/A', 'Title': "Hollywood's Master Storytellers: Spiderman Live", 'Type': 'movie', 'Year': 2006, 'imdbID': 'tt2158533'},
                 {'Poster': 'N/A', 'Title': 'Spiderman 5', 'Type': 'movie', 'Year': 2008, 'imdbID': 'tt3696826'}]}
@app.route('/')
def hello_world():
    return json.dumps(movies)

@app.route('/titles')
def get_movies():
    entities = movies["data"]
    entities.sort(key=lambda a: a["Title"])
    return json.dumps([entity["Title"] for entity in entities])

@app.route('/year/<int:year>')
def get_movies_by_year(year):
    entities = movies["data"]
    returnData = list(filter(lambda a: a['Year'] == year, entities))
    return json.dumps(returnData)

api = threading.Thread(name= "Hello World Restful Api App", target= app.run, kwargs={'port':5000}, daemon=False)
#app.run(port=5000)
api.start()

time.sleep(1)

def getMovieTitles():
    response = requests.get('http://127.0.0.1:5000/')
    print(response.json()["data"])
    entities = response.json()["data"]
    entities.sort(key=lambda a: a["Title"])
    return [entity["Title"] for entity in entities]

for i in range(1):
    print(getMovieTitles())
    time.sleep(1)
