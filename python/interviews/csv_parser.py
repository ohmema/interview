'''
Parsing CSV input into a list of tokens.
Exception: a comma in double quote is considered inside of a token.
Two double quotes inside is considered an escape to one double quote in the token.

example:

a, b, c ===>
a
b
c


a, "b", c ==>
a
b
c


a, "b, x" , d ==>
a
b,x
d

a, "b, x,""", d ==> 'a' 'b,x"' 'd'
a
b,x,"
d

"" x, y "" ==> "x, y"
'''

