import tkinter as tk
import random
window = tk.Tk()

maxNo = 100
score = 0
scoreall = 0

def buttonClick():
    global score
    global scoreall
    try:
        guess = int(guessBox.get())
        if 10 <= guess <= maxNo:
            result =random.randrange(10, maxNo + 1)
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
    resultLabel.config(text = "Random number = " + str(result))
    scoreLabel.config(text = "Score = " + str(score))
    scoreallLabel.config(text = "Scoreall = " + str(scoreall))
    guessBox.delete(0, tk.END)

guessLabel = tk.Label(window , text = "Enter a number from 10 to " + str(maxNo))
guessBox = tk.Entry(window)
resultLabel = tk.Label(window , text = "Random number = ")
scoreLabel = tk.Label(window , text = "Score = " + str(score))
scoreallLabel = tk.Label(window , text = "Scoreall = " + str(scoreall))
button = tk.Button(window , text = "guess" , command = buttonClick)

guessLabel.pack()
guessBox.pack()
resultLabel.pack()
scoreLabel.pack()
scoreallLabel.pack()
button.pack()

window.mainloop()