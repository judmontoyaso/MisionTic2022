import random

def randomNumberFuntion(number):
    lisOfRandomNumbers = []
    for randomNumber in range(0, number):
        lisOfRandomNumbers.append(random.randint(0,10))
    return lisOfRandomNumbers


def searchInRandomList(numberToFind, listToSearch):
    found = False
    for index,element in enumerate(listToSearch):
        if element == numberToFind:
            return True, index   
        return found


randomlist = randomNumberFuntion(10)
found = searchInRandomList(7, randomlist)
print(randomlist, found)