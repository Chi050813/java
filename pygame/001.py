import tkinter as tk
window = tk.Tk()

count = 0

def buttomClick():
    global count
    count += 1
    buttom.config(text=str(count))

buttom = tk.Button(window, text="Click me!", command=buttomClick)
buttom.pack()
window.mainloop()