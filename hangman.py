import random

def play_hangman():
    word_list = ["python", "programming", "language", "computer", "science"]
    word = random.choice(word_list)
    word_letters = set(word)
    alphabet = set("abcdefghijklmnopqrstuvwxyz")
    used_letters = set()
    word_guessed = set()
    tries = 6

    while (len(word_letters) != 0) and tries > 0:
        print("You have", tries, "tries left.")
        print("Used letters:", " ".join(used_letters))
        print("Word:", " ".join([letter if letter in word_guessed else "_" for letter in word]))
        user_letter = input("Guess a letter: ").lower()
        if user_letter in alphabet - used_letters:
            used_letters.add(user_letter)
            if user_letter in word_letters:
                word_guessed.add(user_letter)
                word_letters.discard(user_letter)
            else:
                tries -= 1
        else:
            print("You've already used that letter. Try again.")
    if tries == 0:
        print("You lost! The word was", word)
    else:
        print("Congratulations! You guessed the word", word)

play_hangman()

/*This code uses a while loop to repeatedly ask the user to guess a letter until either the word is guessed or the number of tries runs out.
The word to guess is randomly chosen from a list of words, and the letters that the user
has already guessed and the letters that are in the word are tracked using sets.*/
