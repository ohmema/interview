"""
take n interger and return all all prime between 1 and n
"""

import math
import pickle, os

def isprime(n):
    for i in range( 2, int(math.sqrt(n)+1)):
        if n%i == 0:
            return False
    return True

def get_prime(n):
    if n <= 0:
        raise ValueError("Input parameter should be greater than 0")
    file = "primes.dat"
    prime_nums = get_prime_from_file(file)

    for i , prime in enumerate(prime_nums):
        if prime > n:
            return prime_nums[:i]

    starting_prime = 1 if len(prime_nums) == 0 else prime_nums[-1]
    for i in range(starting_prime + 1, n+1):
        if isprime(i):
            prime_nums.append(i)
    save_prime_list(prime_nums, file)
    return prime_nums

def get_prime_from_file(file):
    prime_list =[]
    if os.path.exists(file):
        prime_list = pickle.load(open(file, 'rb'))
    return prime_list

def save_prime_list(_list, file):
    pickle._dump(_list, open(file, 'wb'))

print(get_prime(1100))