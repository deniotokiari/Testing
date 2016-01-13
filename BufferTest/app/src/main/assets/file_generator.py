import random

def generate_file(name, words, size):
    f = open(name, "wb")

    for i in range(0, size):
        f.write(random.choice(words))
                          
    f.close()             

generate_file("test", ['Lorem', 'ipsum', 'dolor', 'sit', 'amet'], 400000)
