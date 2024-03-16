import tkinter as tk
import random
window = tk.Tk()

maxNo = 99
score = 0
scoreall = 0
guess = 0

def buttonClick():
    global guess
    global score
    global scoreall
    try:
        score = 0
        guess = int(guessBox.get())
        if 0 <= guess <= maxNo:
            result =random.randrange(0, maxNo + 1)
            if guess == result:
                score += 10
                scoreall += 10
            elif (int(guess / 10) == int(result / 10) or guess % 10 == result % 10):
                score += 5
                scoreall += 5
            elif(int(guess / 10) == result % 10 or guess % 10 == int(result / 10)): 
                score += 2
                scoreall += 2
        else:
            result = "Entry not valid"
    except:
        result = "Entry not valid"

    guess_formatted = str(guess).zfill(2)
    guessnumberLabel.config(text="Your guess number = " + guess_formatted)
    result_formatted = str(result).zfill(2) if result < 10 else result
    resultLabel.config(text="Random number = " + str(result_formatted))  
    scoreLabel.config(text = "Score = " + str(score))
    scoreallLabel.config(text = "Scoreall = " + str(scoreall))
    guessBox.delete(0, tk.END)

guessLabel = tk.Label(window , text = "Enter a number from 0 to " + str(maxNo))
guessBox = tk.Entry(window)
guessnumberLabel = tk.Label(window , text = "Your guess number = " + str(guess))
resultLabel = tk.Label(window , text = "Random number = ")
scoreLabel = tk.Label(window , text = "Score = " + str(score))
scoreallLabel = tk.Label(window , text = "Scoreall = " + str(scoreall))
button = tk.Button(window , text = "guess" , command = buttonClick)

guessLabel.pack()
guessBox.pack()
guessnumberLabel.pack()
resultLabel.pack()
scoreLabel.pack()
scoreallLabel.pack()
button.pack()

window.mainloop()
