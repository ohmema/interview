
"""
you cannot use len
"""
def search(l, t):

   i, j = 0, 12
   while i <= j :
       p = (i+j)//2
       a1 = l[i]
       a2 = l[p]
       a3 = l[j]

       if a1 == t:
           return i
       if a2 == t:
           return p
       if a3 == t:
           return j

       if a1 < t < a2:
           i = i+1
           j = p - 1

       elif a2 < t < a3:
           i = p + 1
           j = j-1

       elif a2 == -1:
           i = i + 1
           j = p - 1


       elif a3 == -1:
           i = p + 1
           j = j -1

       elif  a3 < t :
           i = j+1
           j += 10


   return -1


l =[1,2,3,4,5, 25] +[-1]*100
print(search(l,25))