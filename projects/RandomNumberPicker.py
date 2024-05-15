import random

class MyClass:
    """
    A class that allows the user to guess a random number within a given range.
    """

    isCorrect = False
    a = int(input("Enter the lower limit: "))
    b = int(input("Enter the upper limit: "))
    c = random.randint(a, b)
    print(c)

    while isCorrect != True:
        d = int(input("Enter a number to guess: "))
        if d == c:
            print("You have guessed the correct number")
            isCorrect = True
        elif d > c:
            print("The number you have guessed is greater than the correct number")
        else:
            print("The number you have guessed is smaller than the correct number")
