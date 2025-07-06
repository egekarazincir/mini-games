import random

words = ["python", "hangman", "challenge", "programming"]
word = random.choice(words)
guessed = "_" * len(word)
tries = 6
guessed_letters = []

print("Welcome to Hangman!")

while tries > 0 and "_" in guessed:
    print(f"Word: {guessed}")
    guess = input("Guess a letter: ").lower()

    if guess in guessed_letters:
        print("Already guessed.")
        continue

    guessed_letters.append(guess)

    if guess in word:
        guessed = "".join([guess if word[i] == guess else guessed[i] for i in range(len(word))])
    else:
        tries -= 1
        print(f"Wrong guess. Tries left: {tries}")

if "_" not in guessed:
    print(f"You won! The word was: {word}")
else:
    print(f"You lost. The word was: {word}")
